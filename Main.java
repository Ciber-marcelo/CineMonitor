class Main {
  public static void main(String[] args) {

    Filme filme = new Filme();

    filme.setTitulo("Os Vingadores");
    filme.setAno(2012);
    filme.setTipo("Aventura");

    System.out.println("Meu filme favorito é" + filme.getTitulo());
    System.out.println("De " + filme.getAno());
    System.out.println("Do gênero " + filme.getTipo());

  }
}