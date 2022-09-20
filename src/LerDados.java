import javax.swing.JOptionPane;


public class LerDados {
    public Paciente adicionarPaciente(){
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do Paciente: ");
        String cpf = JOptionPane.showInputDialog(null,"Digite o CPF: ");
        String rg = JOptionPane.showInputDialog(null,"Digite o RG: ");
        String sexo = JOptionPane.showInputDialog(null,"Digite o Gênero: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Idade: "));
        String obs = JOptionPane.showInputDialog(null,"Observações: ");
        
        String estado = JOptionPane.showInputDialog(null,"Digite o estado: ");
        String cidade = JOptionPane.showInputDialog(null,"Digite a cidade: ");
        String bairro = JOptionPane.showInputDialog(null,"Digite o bairro: ");
        String rua = JOptionPane.showInputDialog(null,"Digite a rua: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite número do endereço: "));

        Paciente p = new Paciente(nome,cpf,rg,idade,sexo, new Endereco(estado,cidade,bairro,rua,numero),obs);

        return p;
    }

    public Medico adicionarMedico(){
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do Médico: ");
        String cpf = JOptionPane.showInputDialog(null,"Digite o CPF: ");
        String rg = JOptionPane.showInputDialog(null,"Digite o RG: ");
        String sexo = JOptionPane.showInputDialog(null,"Digite o Gênero: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Idade: "));
        String crm = JOptionPane.showInputDialog(null,"Digite o CRM: ");
        String espc = JOptionPane.showInputDialog(null,"Digite a especialização: ");
    
        String estado = JOptionPane.showInputDialog(null,"Digite o estado: ");
        String cidade = JOptionPane.showInputDialog(null,"Digite a cidade: ");
        String bairro = JOptionPane.showInputDialog(null,"Digite o bairro: ");
        String rua = JOptionPane.showInputDialog(null,"Digite a rua: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite número do endereço: "));

        Medico m = new Medico(nome,cpf,rg,idade,sexo, new Endereco(estado,cidade,bairro,rua,numero),crm,espc);

        return m;
    }
}
