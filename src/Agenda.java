import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Consulta> agenda = new ArrayList<Consulta>();

    public void addConsulta(Consulta consulta){
        this.agenda.add(consulta);
    }

    public ArrayList<Consulta> getAgenda() {
        return agenda;
    }

    @Override
    public String toString() {
        return "Agenda  " + agenda ;
    }
    
    
    
}
