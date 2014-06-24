public class PessoaTestDrive {
    public static void main(String[] args)
    {
      Pessoa fernanda = new Pessoa();
      fernanda.setOcupacao("aluno");
      System.out.println(fernanda.getOcupacao());
      fernanda.setNome("Fernanda");
      System.out.println(fernanda.getNome());
      fernanda.setGenero("feminino");
      System.out.println(fernanda.getGenero());
      fernanda.setIdade(16);
      System.out.println(fernanda.getIdade());
    }
}