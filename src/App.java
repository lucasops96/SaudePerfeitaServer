import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Recepcionista r = new Recepcionista();

        Paciente p1 = new Paciente("lucas", "056.558.923-75","2005028030410",20, "M", new Endereco("CE","IPU","centro","Padre Correa",950), "_");

        Medico m1 = new Medico("Miguel", "026.829.456-00","8585858",40, "M", new Endereco("PB","Patos","Jardins","São Clemente",552),"0192", "Ortopedia");

        String data ="19/10/2022";

        Date d1 = sdf.parse(data);


        r.addMedico(m1);

        r.marcarConsulta("Miguel",d1,"8:00 am",p1);

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1-Adicionar Médico\n2-Marcar Consulta\n3-Remarcar Consulta\n4-Remover Consulta\n5-Imprimir Consultas"));

            switch (op) {
                case 1:
                    r.addMedico(new LerDados().adicionarMedico());
                    break;

                case 2:
                    String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
                    String data2 = JOptionPane.showInputDialog(null,"Digite a data: ");
                    Date date = sdf.parse(data2);
                    String hora = JOptionPane.showInputDialog(null,"Digite a hora: ");
                    
                    r.marcarConsulta(nomeMedico, date, hora, new LerDados().adicionarPaciente());    
                    break;

                case 3:
                    r.remarcaAgenda();
                    break;
                case 4:
                    String removerMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
                    String removerPaciente = JOptionPane.showInputDialog(null,"Digite o nome do Paciente: ");
                    r.cancelarConsulta(removerMedico, removerPaciente);
                    break;

                case 5:
                    r.imprimirConsultas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite uma operação válida!");
                    break;
            }
            
        } while (op!=6);

        

        

    

        //System.out.println(sdf.format(c1.getData())+"\n"+c1.getPaciente().getNome());

    }
}
