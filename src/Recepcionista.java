import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;


public class Recepcionista {

    private ArrayList<Medico> medicos = new ArrayList<Medico>();

    public void addMedico(Medico medico){
        this.medicos.add(medico);
    }

    public void marcarConsulta(String nomeMedico,Date data,String hora,Paciente paciente){
        int p = verificarAgenda(nomeMedico);

        medicos.get(p).getAgenda().addConsulta(new Consulta(data, hora, paciente));
    }

    public int verificarAgenda(String nomeMedico){
        int p=0;
        
        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome() == nomeMedico){
                JOptionPane.showMessageDialog(null,medicos.get(i).getAgenda(),"Consultas do Médico "+nomeMedico,JOptionPane.PLAIN_MESSAGE);
                p=i;
            }
        }

        return p;
    }

    public void remarcaAgenda() throws ParseException{
        String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
        String nomePaciente = JOptionPane.showInputDialog(null,"Digite o nome do Paciente: ");
        for (int i=0;i<medicos.size();i++) {
            System.out.println("oi");
            if(medicos.get(i).getNome() == nomeMedico){
                System.out.println("oi");
                medicos.get(i).getAgenda().remarcar(nomePaciente);
            }
        }
    }

    public void cancelarConsulta(String nomeMedico, String nomePaciente){
        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome() == nomeMedico){
                medicos.get(i).getAgenda().remover(nomePaciente);
                
            }
        }
    }

    public void imprimirConsultas(){
        for (int i=0;i<medicos.size();i++) {
            JOptionPane.showMessageDialog(null,medicos.get(i).getAgenda(),"Consultas do Médico: "+medicos.get(i).getNome(),JOptionPane.PLAIN_MESSAGE);
        }
    }
}
