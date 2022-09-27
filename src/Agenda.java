import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;
import java.text.ParseException;

public class Agenda {
    
    private ArrayList<Consulta> agenda = new ArrayList<Consulta>();

    public void addConsulta(Consulta consulta){
        this.agenda.add(consulta);
        JOptionPane.showMessageDialog(null,"Consulta Marcada."+"\n"+consulta);
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }

    

    public void remarcar(String nome) throws ParseException{
        
        for (Consulta consulta : agenda) {
         if(consulta.getPaciente().getNome().equals(nome)){
            String data = JOptionPane.showInputDialog(null,"Digite a data e hora: ");
            LocalDateTime date = LocalDateTime.parse(data, ofPattern("dd/MM/yyyy HH:mm"));
            consulta.setData(date);
            JOptionPane.showMessageDialog(null,"Paciente remarcado."+"\n"+consulta);
            return;
         }  
        }
    }

    public void remover(String nome){
        for(int i=0;i<agenda.size();i++){
            if(agenda.get(i).getPaciente().getNome().equals(nome)){
                this.agenda.remove(i);
                JOptionPane.showMessageDialog(null,"Consulta Removida");
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda  " + agenda ;
    }
    
    
    
}
