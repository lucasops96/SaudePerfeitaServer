import javax.swing.JOptionPane;
import java.time.LocalDateTime;

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


    public boolean verificaData(LocalDateTime data) {
        for (Consulta consulta: agenda.getAgenda()) {
            if (consulta.getData().equals((data))) {
                return true;
            }
        }
        return false;
    }


    public void prescrever () {
        
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Prescrever Medicamentos e Exames\n2-Sair"));
        
        StringBuffer stb = new StringBuffer();
        
        String nomePaciente = JOptionPane.showInputDialog(null, "Digite o nome do Paciente: ");
        
        if (op == 1) {
            
            stb.append("::Clínica Saúde Perfeita::\n\n");
            
            for (Consulta consulta : agenda.getAgenda()) {
                
                if (consulta.getPaciente().getNome().equals(nomePaciente)) {
                    stb.append("Dados do Paciente\n"
                            + "Nome: " + consulta.getPaciente().getNome() + "\nIdade: " + consulta.getPaciente().getIdade() + "\nCPF: " + consulta.getPaciente().getCpf()
                            + "\nEndereço " + consulta.getPaciente().getEndereco() + "\nData:"+consulta.getData()
                            + "\n\n         Receituário\n\n" + JOptionPane.showInputDialog(null, "Prescreva os medicamentos e exames do paciente: ")
                            + "\n\nDr." + getNome() + "\nCRM " + getCrm()
                    );

                    consulta.setPrescricao(stb);
                }
            
            }
            JOptionPane.showMessageDialog(null, stb.toString());
        }else{
            return;
        }
        
    }

    public void buscarPrescricao(){
        String nomePaciente = JOptionPane.showInputDialog(null, "Digite o nome do Paciente: ");

        for (Consulta consulta : agenda.getAgenda()) {
                
            if (consulta.getPaciente().getNome().equals(nomePaciente)) {
                consulta.imprimirPrescricao();
            }
        
        }

    }

}
