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

    }
}