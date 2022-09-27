import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ofPattern;


public class Recepcionista {

    private ArrayList<Medico> medicos = new ArrayList<Medico>();

    public void addMedico(Medico medico){
        this.medicos.add(medico);
    }

    

    public void marcarConsulta(String nomeMedico) throws ParseException{
        int p = verificarAgenda(nomeMedico);

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite:\n1-Cadastrar Consulta\n2-Cancelar"));

        if(op==1){
            String data = JOptionPane.showInputDialog(null,"Digite a data e hora: ");
            LocalDateTime date = LocalDateTime.parse(data, ofPattern("dd/MM/yyyy HH:mm"));
            if (medicos.get(p).verificaData(date)) {
                JOptionPane.showMessageDialog(null, "Horário já cadastrado, por favor, insira um novo");
                marcarConsulta(nomeMedico);
            }else {
                medicos.get(p).getAgenda().addConsulta(new Consulta(date, new LerDados().adicionarPaciente()));
            }
        }else{
            return;
        }

        
    }

    public int verificarAgenda(String nomeMedico){
        int p=0;
        
        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome().equals(nomeMedico)){
                JOptionPane.showMessageDialog(null,medicos.get(i).getAgenda(),"Consultas do Médico "+nomeMedico,JOptionPane.PLAIN_MESSAGE);
                p=i;
            }
        }

        return p;
    }

    public void remarcaAgenda() throws ParseException{
        String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
        String nomePaciente = JOptionPane.showInputDialog(null,"Digite o nome do Paciente: ");;

        for(int i=0;i<medicos.size();i++){
            if(medicos.get(i).getNome().equals(nomeMedico)){
                medicos.get(i).getAgenda().remarcar(nomePaciente);
            }
        }
        
    }

    public void cancelarConsulta(){
        String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
        String nomePaciente = JOptionPane.showInputDialog(null,"Digite o nome do Paciente: ");;

        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome().equals(nomeMedico)){
                medicos.get(i).getAgenda().remover(nomePaciente);
            }
        }
    }

    public void prescreverPaciente(){
        String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");

        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome().equals(nomeMedico)){
                medicos.get(i).prescrever();
            }
        }
    }

    public void prescricaoPaciente(){
        String nomeMedico = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");

        for (int i=0;i<medicos.size();i++) {
            if(medicos.get(i).getNome().equals(nomeMedico)){
                medicos.get(i).buscarPrescricao();
            }
        }
    }

    public void imprimirConsultas(){
        for (int i=0;i<medicos.size();i++) {
            JOptionPane.showMessageDialog(null,medicos.get(i).getAgenda(),"Consultas do Médico: "+medicos.get(i).getNome(),JOptionPane.PLAIN_MESSAGE);
        }
    }
}
