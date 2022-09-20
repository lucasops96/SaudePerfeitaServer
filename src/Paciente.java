public class Paciente extends Pessoa{

    private String observacao;

    public Paciente(String observacao) {
        this.observacao = observacao;
    }

    public Paciente(String nome, String cpf, String rg, int idade, String sexo, Endereco endereco, String observacao) {
        super(nome, cpf, rg, idade, sexo, endereco);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "\nPaciente:  "+getNome()+"   Idade: "+getIdade()+"\nobservacao: " + observacao ;
    }
    
    
}
