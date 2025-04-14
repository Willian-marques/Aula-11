import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os objetos com o tipo da interface (polimorfismo)
        Autenticavel adm = new Administrador("Fernanda");
        Autenticavel cliente = new cliente("João");

        // Entrada de dados para o Administrador
        System.out.println("==== LOGIN ADMINISTRADOR ===== ");
        System.out.print("Usuário: ");
        String loginAdm = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaAdm = scanner.nextLine();
        adm.autenticar(loginAdm, senhaAdm);

        // Entrada de dados para o Cliente
        System.out.println("\n==== LOGIN CLIENTE === ");
        System.out.print("Usuário: ");
        String usuarioCli = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaCli = scanner.nextLine();
        cliente.autenticar(usuarioCli, senhaCli);

        scanner.close();
    }
}
