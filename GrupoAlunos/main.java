package GrupoAlunos;

public class main { public static void main(String[] args) {
    int qtdAlunos = 3;
    Leitor leitor = new Leitor();
    Alunos[] alunos = new Alunos[qtdAlunos];

    for(int i = 0; i < qtdAlunos; i++){
        Alunos aluno = new Alunos();
        aluno.nome = leitor.lerString("Digite o nome do aluno: ");
        aluno.notas[0] = leitor.lerDouble("Digite a nota 1 do aluno: ");
        aluno.notas[1] = leitor.lerDouble("Digite a nota 2 do aluno: ");
        aluno.notas[2] = leitor.lerDouble("Digite a nota 3 do aluno: ");
        alunos[i] = aluno;
    }

    for(Alunos aluno : alunos){
        System.out.printf("%s, teve a média final %.2f.\n", aluno.nome, aluno.calcularMedia());
    }
}
}
