// Nome: Gustavo Lovizotto Tesin  RA:2648830
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static Leitura ler = Leitura.getInstancia(); // Singleton

    // Lista unificada de pessoas: polimorfismo por coerção
    private static List<Pessoa> pessoas = new ArrayList<>();

    private static ArrayList<Consulta> consultas = new ArrayList<>();

    private static int idConsulta = 1;

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1 -> cadastrarPaciente();
                case 2 -> cadastrarMedico();
                case 3 -> cadastrarFuncionario();
                case 4 -> agendarConsulta();
                case 5 -> imprimirPacientes();
                case 6 -> imprimirMedicos();
                case 7 -> imprimirConsultas();
                case 8 -> imprimirFuncionarios();
                case 9 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Médico");
        System.out.println("3 - Cadastrar Funcionario");
        System.out.println("4 - Agendar Consulta");
        System.out.println("5 - Listar Pacientes");
        System.out.println("6 - Listar Médicos");
        System.out.println("7 - Listar Consultas");
        System.out.println("8 - Imprimir Funcionarios");
        System.out.println("9 - Sair");
    }

    private static int lerInteiro(String mensagem) {
        int valor = -1;
        boolean valido = false;
        while (!valido) {
            try {
                valor = Integer.parseInt(ler.entDados(mensagem));
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
            }
        }
        return valor;
    }

private static String lerCpf(String mensagem) {
    return ler.entDados(mensagem).trim();
}

    private static void cadastrarPaciente() {
    String nome = ler.entDados("Nome do paciente:");
    Paciente p = new Paciente();
    p.setNome(nome);
    
    String cpf = ""; //INICIALIZAÇÃO DO CPF
    // Validação do CPF ANTES de ler os outros campos
    boolean cpfValido = false;
    while (!cpfValido) {
        cpf = lerCpf("CPF:");
        try {
            p.setCpf(cpf);
            cpfValido = true;
        } catch (CpfNegException | CpfPeqException | CpfGrdException e) {
            System.out.println(e.getMessage());
        }
    }
    char genero = lerGenero();
    int idade = 0; // INICIALIZAÇÃO DA IDADE
    boolean idadeValida = false;
while (!idadeValida) {
    idade = lerInteiro("Idade:");
    try {
        p.setIdade(idade);
        idadeValida = true;
    } catch (IdadeNegException e) {
        System.out.println(e.getMessage());
    }
}
if (idade < 18) {
    String nomeAcompanhante = ler.entDados("Nome do acompanhante:");
    String cpfAcompanhante = "";
    boolean cpfAcompanhanteValido = false;
    while (!cpfAcompanhanteValido) {
        cpfAcompanhante = lerCpf("CPF do acompanhante:");
        try {
            p.setCpf(cpfAcompanhante); // Só para validar
            cpfAcompanhanteValido = true;
        } catch (CpfNegException | CpfPeqException | CpfGrdException e) {
            System.out.println(e.getMessage());
        }
    }
    p.setNomeAcompanhante(nomeAcompanhante);
    p.setCpfAcompanhante(cpfAcompanhante);
    System.out.println("Acompanhante cadastrado: " + nomeAcompanhante + " - CPF: " + cpfAcompanhante);
}

    Endereco endereco = new Endereco(
        ler.entDados("Rua:"),
        lerInteiro("Número:")
    );

    Cidade cidade = new Cidade(
        lerInteiro("Código da cidade:"),
        ler.entDados("Nome da cidade:"),
        ler.entDados("UF:")
    );

    String telefone = ler.entDados("Telefone:");

p.setGenero(genero);
p.setEndereco(endereco);
p.setCidade(cidade);
// Validação do email
String email = "";
boolean emailValido = false;
while (!emailValido) {
    email = ler.entDados("Email:");
    try {
        p.setEmail(email);
        emailValido = true;
    } catch (EmailInvalidoException e) {
        System.out.println(e.getMessage());
    }
}
System.out.println("Validação do email finalizada."); // Uso do finally

try {
    p.setTelefone(telefone);
} catch (TelefoneInvalidoException e) {
    System.out.println(e.getMessage());
    return;
} finally {
    System.out.println("Validação do telefone finalizada."); // Uso do finally
}
    // Reflexividade: selecionar responsável
    List<Paciente> listaPacientes = new ArrayList<>();
    for (Pessoa pessoa : pessoas) {
        if (pessoa instanceof Paciente paciente) {
            listaPacientes.add(paciente);
        }
    }
    pessoas.add(p); // Polimorfismo por coerção
    System.out.println("Paciente cadastrado com sucesso!");
}

private static void cadastrarFuncionario() {
    String nome = ler.entDados("Nome do funcionário:");
    Funcionario f = new Funcionario();
    f.setNome(nome);

    String cpf;
    boolean cpfValido = false;
    while (!cpfValido) {
        cpf = lerCpf("CPF:");
        try {
            f.setCpf(cpf);
            cpfValido = true;
        } catch (CpfNegException | CpfPeqException | CpfGrdException e) {
            System.out.println(e.getMessage());
        }
    }

    char genero = lerGenero();
    f.setGenero(genero);

    int idade;
    boolean idadeValida = false;
    while (!idadeValida) {
        idade = lerInteiro("Idade:");
        try {
            f.setIdade(idade);
            idadeValida = true;
        } catch (IdadeNegException e) {
            System.out.println(e.getMessage());
        }
    }

    Endereco endereco = new Endereco(
        ler.entDados("Rua:"),
        lerInteiro("Número:")
    );

    Cidade cidade = new Cidade(
        lerInteiro("Código da cidade:"),
        ler.entDados("Nome da cidade:"),
        ler.entDados("UF:")
    );

    String funcao = ler.entDados("Função:");
    String turno = ler.entDados("Turno:");

    f.setEndereco(endereco);
    f.setCidade(cidade);
    f.setFuncao(funcao);
    f.setTurno(turno);

    pessoas.add(f); // Polimorfismo por coerção
    System.out.println("Funcionário cadastrado com sucesso!");
}


    private static void cadastrarMedico() {
    String nome = ler.entDados("Nome do médico:");
    Medico m = new Medico();
    m.setNome(nome);

    String cpf;
    boolean cpfValido = false;
    while (!cpfValido) {
        cpf = lerCpf("CPF:");
        try {
            m.setCpf(cpf);
            cpfValido = true;
        } catch (CpfNegException | CpfPeqException | CpfGrdException e) {
            System.out.println(e.getMessage());
        }
    }

    char genero = lerGenero();
    m.setGenero(genero);

    int idade;
    boolean idadeValida = false;
    while (!idadeValida) {
        idade = lerInteiro("Idade:");
        try {
            m.setIdade(idade);
            idadeValida = true;
        } catch (IdadeNegException e) {
            System.out.println(e.getMessage());
        }
    }

    Endereco endereco = new Endereco(
        ler.entDados("Rua:"),
        lerInteiro("Número:")
    );

    Cidade cidade = new Cidade(
        lerInteiro("Código da cidade:"),
        ler.entDados("Nome da cidade:"),
        ler.entDados("UF:")
    );

    int crm = lerInteiro("CRM:");
    String especialidade = ler.entDados("Especialidade:");

    m.setEndereco(endereco);
    m.setCidade(cidade);
    m.setCrm(crm);
    m.setEspecialidade(especialidade);

    pessoas.add(m); // Polimorfismo por coerção
    System.out.println("Médico cadastrado com sucesso!");
}

    private static char lerGenero() {
        char genero;
        do {
            String entrada = ler.entDados("Gênero (M/F):").toUpperCase();
            if (entrada.length() == 1 && (entrada.charAt(0) == 'M' || entrada.charAt(0) == 'F')) {
                genero = entrada.charAt(0);
                break;
            } else {
                System.out.println("Entrada inválida. Digite 'M' ou 'F'.");
            }
        } while (true);
        return genero;
    }

    private static void agendarConsulta() {
        List<Paciente> listaPacientes = new ArrayList<>();
        List<Medico> listaMedicos = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p instanceof Paciente) listaPacientes.add((Paciente) p);
            else if (p instanceof Medico) listaMedicos.add((Medico) p);
        }

        if (listaPacientes.isEmpty() || listaMedicos.isEmpty()) {
            System.out.println("Você precisa cadastrar pelo menos um paciente e um médico antes!");
            return;
        }

        String data = ler.entDados("Data da consulta:");
        String obs = ler.entDados("Motivo da consulta:");

        int indiceP = selecionarPaciente(listaPacientes);
        if (indiceP == -1) return;

        int indiceM = selecionarMedico(listaMedicos);
        if (indiceM == -1) return;

        Consulta c = new Consulta(idConsulta++, data, obs, listaPacientes.get(indiceP), listaMedicos.get(indiceM));
        consultas.add(c);
        System.out.println("Consulta agendada com sucesso!");
    }

    private static void imprimirFuncionarios() {
    boolean temFuncionario = false;
    System.out.println("\n==== Funcionários Cadastrados ====");
    for (Pessoa p : pessoas) {
        if (p instanceof Funcionario funcionario) {
            temFuncionario = true;
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Gênero: " + funcionario.getGenero());
            System.out.println("Endereço: " + funcionario.getEndereco().getRua() + ", Nº " + funcionario.getEndereco().getNumero());
            System.out.println("Cidade: " + funcionario.getCidade().getNomeCid() + " - " + funcionario.getCidade().getUfCid());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.println("Turno: " + funcionario.getTurno());
            System.out.println("----------------------------");
        }
    }
    if (!temFuncionario) {
        System.out.println("Nenhum funcionário cadastrado.");
    }
}

    private static int selecionarPaciente(List<Paciente> listaPacientes) {
        System.out.println("Selecione o paciente (0 a " + (listaPacientes.size() - 1) + "):");
        for (int i = 0; i < listaPacientes.size(); i++) {
            System.out.println(i + " - " + listaPacientes.get(i).getNome());
        }
        int indice = lerInteiro("Índice do paciente:");
        if (indice < 0 || indice >= listaPacientes.size()) {
            System.out.println("Índice de paciente inválido!");
            return -1;
        }
        return indice;
    }

    private static int selecionarMedico(List<Medico> listaMedicos) {
        System.out.println("Selecione o médico (0 a " + (listaMedicos.size() - 1) + "):");
        for (int i = 0; i < listaMedicos.size(); i++) {
            System.out.println(i + " - " + listaMedicos.get(i).getNome());
        }
        int indice = lerInteiro("Índice do médico:");
        if (indice < 0 || indice >= listaMedicos.size()) {
            System.out.println("Índice de médico inválido!");
            return -1;
        }
        return indice;
    }

    private static void imprimirPacientes() {
    boolean temPaciente = false;
    System.out.println("\n==== Pacientes Cadastrados ====");
    for (Pessoa p : pessoas) {
        if (p instanceof Paciente paciente) {
            temPaciente = true;
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("CPF: " + paciente.getCpf());
            System.out.println("Idade: " + paciente.getIdade());
            System.out.println("Gênero: " + paciente.getGenero());
            System.out.println("Endereço: " + paciente.getEndereco().getRua() + ", Nº " + paciente.getEndereco().getNumero());
            System.out.println("Cidade: " + paciente.getCidade().getNomeCid() + " - " + paciente.getCidade().getUfCid());
            System.out.println("Email: " + paciente.getEmail());
            System.out.println("Telefone: " + paciente.getTelefone());
            if (paciente.getIdade() < 18) {
                System.out.println("Acompanhante: " + paciente.getNomeAcompanhante());
                System.out.println("CPF do Acompanhante: " + paciente.getCpfAcompanhante());
            }
            System.out.println("----------------------------");
        }
    }
    if (!temPaciente) {
        System.out.println("Nenhum paciente cadastrado.");
    }
}

    private static void imprimirMedicos() {
        boolean temMedico = false;
        System.out.println("\n==== Médicos Cadastrados ====");
        for (Pessoa p : pessoas) {
            if (p instanceof Medico medico) {
                temMedico = true;
                System.out.println("Nome: " + medico.getNome());
                System.out.println("CPF: " + medico.getCpf());
                System.out.println("Gênero: " + medico.getGenero());
                System.out.println("Endereço: " + medico.getEndereco().getRua() + ", Nº " + medico.getEndereco().getNumero());
                System.out.println("Cidade: " + medico.getCidade().getNomeCid() + " - " + medico.getCidade().getUfCid());
                System.out.println("CRM: " + medico.getCrm());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("----------------------------");
            }
        }
        if (!temMedico) {
            System.out.println("Nenhum médico cadastrado.");
        }
    }

    private static void imprimirConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta agendada.");
            return;
        }
        System.out.println("\n==== Consultas Agendadas ====");
        for (Consulta c : consultas) {
            System.out.println("ID: " + c.getID());
            System.out.println("Data: " + c.getData());
            System.out.println("Paciente: " + c.getPaciente().getNome());
            System.out.println("Médico: " + c.getMedico().getNome());
            System.out.println("Observações: " + c.getObs());
            System.out.println("----------------------------");
        }
    }
}
