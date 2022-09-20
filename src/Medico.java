
public class Medico extends Pessoa{
    private String crm;
    private String especializacao;
    private Agenda agenda;
    
    public Medico(String crm, String especializacao,Agenda agenda) {
        this.crm = crm;
        this.especializacao = especializacao;
        this.agenda = new Agenda();
    }
    
    public Medico(String nome, String cpf, String rg, int idade, String sexo, Endereco endereco, String crm,String especializacao) {
        super(nome, cpf, rg, idade, sexo, endereco);
        this.crm = crm;
        this.especializacao = especializacao;
        this.agenda = new Agenda();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

}
