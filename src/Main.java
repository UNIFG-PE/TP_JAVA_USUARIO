static void cadastrar(Scanner sc) {
    System.out.println("-------|Cadastro de usuário|-------\n");
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

    usuarios[contador] = new UsuarioInfo(contador + 1, nome, email, telefone, senha, cpf, dataNascimento, endereco);
    contador++;
    System.out.println("-------|Usuário cadastrado com sucesso!|-------");
    System.out.println("\n\n\n\n\n\n\n\n\n");
}

static void listar() {
    for (int i = 0; i < contador; i++) {
        UsuarioInfo u = usuarios[i];
        System.out.println("-------|Lista de usuários|-------\n");
        if (u != null) {
            System.out.println("ID: " + u.id + ", Nome: " + u.nome + ", Email: " + u.email);
        }
        System.out.println("\n-------|Fim da lista|-------");
        System.out.println("\n\n\n\n\n\n\n\n\n");
    }
}

static void atualizar(Scanner sc) {
    System.out.println("-------|Atualizar usuário|-------\n");
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
    System.out.println("-------|Remover usuário|-------\n");
    System.out.print("Informe o ID do usuário a remover: ");
    int id = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < contador; i++) {
        if (usuarios[i] != null && usuarios[i].id == id) {
            usuarios[i] = null;
            System.out.println("Usuário removido!");
            System.out.println("\n\n\n\n\n\n\n\n\n");
            return;
        }
    }
    System.out.println("Usuário não encontrado.");
    System.out.println("\n\n\n\n\n\n\n\n\n");
}
}