class TrianguloTestDrive{
  public static void main(String[] args) {
    Triangulo t = new Triangulo();
      t.setG(10,8,9,7);
      System.out.println(t.checarTriangulo());
      
      t.setG(14,40,12,60);
      System.out.println(t.checarTriangulo());
   } 
}