import java.util.Scanner;

class Usuario {
    int id;
    String nome;
    String email;
    String telefone;
    String senha;
    String cpf;
    String dataNascimento;
    String endereco;
    static int contador = 0;

    public Usuario(int id, String nome, String email, String telefone, String senha, String cpf, String dataNascimento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        Usuario.contador++;
    }
}

public class CrudUsuariosVetor {
    static Usuario[] usuarios = new Usuario[100];
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

        usuarios[contador] = new Usuario(contador + 1, nome, email, telefone, senha, cpf, dataNascimento, endereco);
        contador++;
        System.out.println("Usuário cadastrado com sucesso!");
    }

    static void listar() {
        for (int i = 0; i < contador; i++) {
            Usuario u = usuarios[i];
            if (u != null) {
                System.out.println("ID: " + u.id + ", Nome: " + u.nome + ", Email: " + u.email);
            }
        }
    }

    static void atualizar(Scanner sc) {
        System.out.print("Informe o ID do usuário a atualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (usuarios[i] != null && usuarios[i].id == id) {
                System.out.print("Novo nome: ");
                usuarios[i].nome = sc.nextLine();
                System.out.print("Novo email: ");
                usuarios[i].email = sc.nextLine();
                System.out.print("Novo telefone: ");
                usuarios[i].telefone = sc.nextLine();
                System.out.print("Nova senha: ");
                usuarios[i].senha = sc.nextLine();
                System.out.print("Novo CPF: ");
                usuarios[i].cpf = sc.nextLine();
                System.out.print("Nova data de nascimento: ");
                usuarios[i].dataNascimento = sc.nextLine();
                System.out.print("Novo endereço: ");
                usuarios[i].endereco = sc.nextLine();
                System.out.println("Usuário atualizado!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    static void remover(Scanner sc) {
        System.out.print("Informe o ID do usuário a remover: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contador; i++) {
            if (usuarios[i] != null && usuarios[i].id == id) {
                usuarios[i] = null;
                System.out.println("Usuário removido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

}