import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {
    
        Endereco endereco = new Endereco(); 
        endereco.cep = "0000000";
        // Dados do enderexo

        Cliente cliente = new Cliente();
        // Dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso! ");
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicionatr endereço");
        }

        if (cliente.enderecos == null) {
            cliente.enderecos = new ArrayList<Endereco>();
        }
    }
    
}
