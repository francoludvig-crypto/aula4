public class PrimeiroExemploHeranca
{
    public static void main(String args[]){
        Usuario usuario = new Usuario(1, "João Silva", "joao.silva", "123456");
                                     
        Professor professor = new Professor(2, "Maria Santos", "maria.santos", "654321");
        professor.setAreaDeAtuacao("Matemática");
        
        Aluno aluno = new Aluno(3, "Pedro Oliveira", "pedro.oliveira", "abcdef");
        aluno.setAv1(8.5);
        aluno.setAv2(7.0);
                                     
        System.out.println("");
        System.out.println("Matricula do Usuario: " + usuario.getMatricula());
        System.out.println("Nome do usuario: " + usuario.getNome());
       
        System.out.println("");
        System.out.println("Matricula do Professor: " + professor.getMatricula());
        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Área de Atuação: " + professor.getAreaDeAtuacao());
       
        System.out.println("");
        System.out.println("Matricula do Aluno: " + aluno.getMatricula());
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Nota AV1: " + aluno.getAv1());
        System.out.println("Nota AV2: " + aluno.getAv2());
       
        usuario.exibeDados();
        professor.exibeDados();
        aluno.exibeDados();    
    }
}
