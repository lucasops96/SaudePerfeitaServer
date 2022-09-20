import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
    
    private ArrayList<Consulta> agenda = new ArrayList<Consulta>();

    public void addConsulta(Consulta consulta){
        this.agenda.add(consulta);
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }

    public void remarcar(String nome) throws ParseException{
        
        for (Consulta consulta : agenda) {
         if(consulta.getPaciente().getNome()== nome){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String data = JOptionPane.showInputDialog(null,"Digite a data: ");
            Date d = sdf.parse(data);
            consulta.setData(d);
            String hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
            consulta.setHora(hora);
            JOptionPane.showMessageDialog(null,"Paciente remarcado."+"\n"+consulta);
            
         }  
        }
    }

    public void remover(String nome){
        for(int i=0;i<agenda.size();i++){
            if(agenda.get(i).getPaciente().getNome() == nome){
                this.agenda.remove(i);
                JOptionPane.showMessageDialog(null,"Consulta Removida");
                
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda  " + agenda ;
    }
    
    
    
}
