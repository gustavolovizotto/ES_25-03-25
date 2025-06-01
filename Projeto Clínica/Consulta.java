// Nome: Gustavo Lovizotto Tesin  RA:2648830
public class Consulta {
    private int ID;
    private String data;
    private String obs;
    private Paciente paciente;
    private Medico medico;

    // Construtor padrão (sem parâmetros)
    public Consulta() {
        this.ID = 0;
        this.data = "";
        this.obs = "";
        this.paciente = new Paciente();
        this.medico = new Medico();
    }

    // Construtor com parâmetros (sobrecarga)
    public Consulta(int ID, String data, String obs, Paciente paciente, Medico medico) {
        this.ID = ID;
        this.data = data;
        this.obs = obs;
        this.paciente = paciente;
        this.medico = medico;
    }

    // Getters e Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
