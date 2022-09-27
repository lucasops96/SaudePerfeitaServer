import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Consulta {
    private LocalDateTime data;
    private Paciente paciente;

    private StringBuffer prescricao;
    
    
    public Consulta(LocalDateTime data, Paciente paciente) {
        this.data = data;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
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


    DateTimeFormatter DataTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public String toString() {
        return "\nConsulta data: " + DataTimeFormatter.format(data) + "," + paciente+"\n\n" ;
    }

    public void imprimirPrescricao(){
        JOptionPane.showMessageDialog(null, this.prescricao.toString());
        
    }

    
}
