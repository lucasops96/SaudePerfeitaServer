
//import java.text.SimpleDateFormat;
//import java.util.Date;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Recepcionista r = new Recepcionista();

        // Paciente p1 = new Paciente("lucas", "056.558.923-75","2005028030410",20, "M",
        // new Endereco("CE","IPU","centro","Padre Correa",950), "_");

        Medico m1 = new Medico("Miguel", "026.829.456-00", "8585858", 40, "M",
                new Endereco("PB", "Patos", "Jardins", "São Clemente", 552), "0192", "Ortopedia");
        Medico m2 = new Medico("Carlos", "026.829.456-00", "8585858", 40, "M",
                new Endereco("PB", "Patos", "Jardins", "São Clemente", 552), "0192", "Ortopedia");

        r.addMedico(m1);
        r.addMedico(m2);

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite:\n1-Adicionar Médico\n2-Marcar Consulta\n3-Remarcar Consulta\n4-Remover Consulta\n5-Imprimir Consultas\n6-Prescrever Paciente\n7-Imprimir Prescrição\n8-Encerrar"));

            switch (op) {
                case 1:
                    r.addMedico(new LerDados().adicionarMedico());
                    break;

                case 2:
                    String nomeMedico = JOptionPane.showInputDialog(null, "Digite o nome do Médico: ");
                    r.marcarConsulta(nomeMedico);
                    break;

                case 3:

                    r.remarcaAgenda();
                    break;

                case 4:

                    r.cancelarConsulta();
                    break;

                case 5:

                    r.imprimirConsultas();
                    break;

                case 6:

                    r.prescreverPaciente();
                    break;

                case 7:

                    r.prescricaoPaciente();
                    break;
                
                case 8:

                    System.out.println("Programa encerrado :/");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite uma operação válida!");
                    break;
            }

        } while (op != 8);

    }
}
