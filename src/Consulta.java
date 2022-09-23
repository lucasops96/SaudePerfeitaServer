import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Consulta {
    private Date data;
    private String hora;
    private Paciente paciente;

    private StringBuffer prescricao;
    
    
    public Consulta(Date data, String hora, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    

    public StringBuffer getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(StringBuffer prescricao) {
        this.prescricao = prescricao;
    }


    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "\nConsulta data: " + sdf.format(data) + ", hora: " + hora + "," + paciente+"\n\n" ;
    }

    public void imprimirPrescricao(){
        JOptionPane.showMessageDialog(null, this.prescricao.toString());
        
    }

    
}
