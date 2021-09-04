package exercRelampagoSurpresa4;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Aluno> alunos;

    public Curso() {
        this.alunos = new ArrayList<Aluno>();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getNumeroMatriculas() {
        return this.alunos.size();
    }

    public boolean verificaAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean verificaAlunoPeloNome(String nome) {
        for (Aluno aluno : this.alunos) {
            if (aluno.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
}
