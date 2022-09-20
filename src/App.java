import java.text.SimpleDateFormat;
import java.util.Date;
//import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Recepcionista r = new Recepcionista();

        Paciente p1 = new Paciente("lucas", "056.558.923-75","2005028030410",20, "M", new Endereco("CE","IPU","centro","Padre Correa",950), "_");

        Medico m1 = new Medico("Miguel", "026.829.456-00","8585858",40, "M", new Endereco("PB","Patos","Jardins","São Clemente",552),"0192", "Ortopedia");

        Medico m2 = new Medico("Carlos", "026.829.456-00","8585858",40, "M", new Endereco("PB","Patos","Jardins","São Clemente",552),"0192", "Ortopedia");

        

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String data ="19/10/2022";

        Date d1 = sdf.parse(data);


        r.addMedico(m1);
        r.addMedico(m2);

        r.marcarConsulta("Carlos",d1,"8:00 am",p1);
        r.marcarConsulta("Miguel",d1, "14:00 pm",p1);

        r.imprimirConsultas();

        //System.out.println(sdf.format(c1.getData())+"\n"+c1.getPaciente().getNome());

    }
}
