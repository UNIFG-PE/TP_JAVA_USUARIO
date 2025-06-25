import java.util.Scanner;

class usuario {
    int id;
    String nome;
    String email;
    String telefone;
    String senha;
    String cpf;
    String dataNascimento;
    String endereco;

    public usuario(int id, String nome, String email, String telefone, String senha, String cpf, String dataNascimento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}

public class Usuario {
    static usuario[] usuarios = new usuario[100];
    static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Atualizar usuário");
            System.out.println("4 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar(sc);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    atualizar(sc);
                    break;
                case 4:
                    remover(sc);
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }

    static void cadastrar(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        usuarios[contador] = new usuario(contador + 1, nome, email, telefone, senha, cpf, dataNascimento, endereco);
        contador++;
        System.out.println("Usuário cadastrado com sucesso!");
    }

}