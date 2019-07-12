package cursojava.executavel;

import com.company.Aluno;
import com.company.Diretor;
import com.company.Pessoa;
import com.company.Secretario;

public class TestandoClassesFilhas {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setIdade(22);

        Diretor diretor = new Diretor();
        diretor.setNome("João bidó");
        diretor.setRegistroGeral("654");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setNome("Alerquina");
        secretario.setExperiencia("Administração");
        secretario.setIdade(2);

        System.out.println(aluno.pessoaMaiorIdade()+" - "+aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

        System.out.println("Salario do aluno é de: " +aluno.salario());
        System.out.println("Salario do Diretor é de: " +diretor.salario());
        System.out.println("Salario do Secretario é de: " +secretario.salario());

        
        Pessoa pessoa = new Aluno();

        pessoa = secretario;

        teste(aluno);
        teste(diretor);
        teste(secretario);

    }

    public static void teste(Pessoa pessoa){
        System.out.println("Esssa pessoa: "+pessoa.getNome()+" é de mais e ganha "+pessoa.salario());
    }



}
