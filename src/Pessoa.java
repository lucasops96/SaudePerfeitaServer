public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String sexo;
    private Endereco endereco;

    public Pessoa() {
        this.nome = "-";
        this.cpf = "-";
        this.rg = "-";
        this.idade = 0;
        this.sexo = "-";
        this.endereco = new Endereco();
    }
    
    public Pessoa(String nome, String cpf, String rg, int idade, String sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
