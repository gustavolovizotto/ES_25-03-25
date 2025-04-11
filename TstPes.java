public class TstPes {
    public static void main(String[] args) { //O public significa que outro objeto de fora pode utilizar essa classe.
        Pessoa p1; //declaração
        p1 = new Pessoa(); //instanciaçã
        /*p1.entDados(18, "Gustavo"); //chamada do método
        p1.impDados(); //chamada do método*/

        Pessoa p2 = new Pessoa(); //instanciação
        /*p2.entDados(19, "POAP"); //chamada do método
        p2.impDados(); //chamada do método*/

        /*     p1.cpf=20; //acesso ao atributo
        p1.nome="Gustavo"; //acesso ao atributo
        p2.cpf=21; //acesso ao atributo 
        p2.nome="POAP"; //acesso ao atributo        */

        p1.setCpf(20); //chamada do método
        p1.setNome("Paulinho"); //chamada do método
        p1.getEnder().setNumero(10); //chamada do método
        p1.getEnder().setRua("Rua 1"); //chamada do método

        System.out.println("P1: " + p1.getCpf()); //chamada do método
        System.out.println("P1: " + p1.getNome()); //chamada do método
        System.out.println("P1: " + p1.getEnder().getNumero()); //chamada do método //reflexividade
        System.out.println("P1: " + p1.getEnder().getRua()); //chamada do método
    


       /*  System.out.println("End. P1: " + p1); //acesso ao atributo
        System.out.println("End. P2: " + p2); //acesso ao atributo  */
        System.gc(); //chamada do garbage collector
    }//Fim do main
}

//Encapsulamento é um Conceito e tecnica que permite gerenciar as trocas de mensagens. Possui niveis:
//+public: sem restrições de acesso.
//-private: restrição total de acesso.
//#protected: restrição de acesso parcial.
//+package: restrição de acesso parcial. O mesmo pacote pode acessar o atributo ou método, mas não pode ser acessado por classes de outros pacotes.
//O encapsulamento é um dos pilares da programação orientada a objetos, juntamente com a herança e o polimorfismo.
// Ele permite que os desenvolvedores criem classes que sejam mais fáceis de entender e manter, além de proteger os dados internos de uma classe contra acesso não autorizado ou modificação acidental.

/*POO:
 * 4 Artefatos:
 * -Classe;
 * -Atributos;
 * -Métodos;
 * -Objetos;
 * 
 * 3 Conceitos:
 * -Encapsulamento: Níveis -> +public/-private/#protected(Herança)/~package. O encapsulamento é o conceito de esconder os detalhes internos de uma classe e expor apenas o que é necessário para o mundo exterior. Isso é feito através do uso de modificadores de acesso (como public, private e protected) e métodos getters e setters.
 * -Polimorfismo: O polimorfismo é o conceito de que um objeto pode assumir muitas formas. Isso significa que um objeto pode ser tratado como um objeto de sua classe base ou de qualquer uma de suas subclasses. Isso é alcançado através do uso de herança e interfaces.
 * -Herança: A herança é o conceito de que uma classe pode herdar atributos e métodos de outra classe. Isso permite que os desenvolvedores criem hierarquias de classes e reutilizem código. A herança é um dos principais conceitos da programação orientada a objetos e permite que os desenvolvedores criem classes mais especializadas a partir de classes mais gerais.
 */