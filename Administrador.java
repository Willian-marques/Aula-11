
//a classe Admistrador IMPLEMENTA a interface Autenticavel
public class Administrador implements Autenticavel {

    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    // metodo obrigatorio de inferface
    @Override
    public void autenticar(String usuario, String senha) {
        //Simulação de login fixo
        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Admistrador " + this.nome + " autenticado com sucesso");
        } else {
            System.out.println("Falha ao autenticar " + this.nome);
        }
    }

}
//a classe usa implements para indifcar que ela está se comprometendo a seguir o contrato
//da interface
// o metodo autenticar uma simulação de verificação de login com valores fixos
// o uso do @override indica