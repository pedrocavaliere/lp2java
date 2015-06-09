class TrianguloTestDrive{
  public static void main(String[] args) {
    Triangulo t = new Triangulo();
      t.setG(6,9,22,5);
      System.out.println(t.checarTriangulo());

      t.setG(14,40,12,60);
      System.out.println(t.checarTriangulo());

      t.setG(6,9,5,100);
      System.out.println(t.checarTriangulo());

      t.setG(41,98,38,51);
      System.out.println(t.checarTriangulo());

      t.setG(59,8,40,1);
      System.out.println(t.checarTriangulo());


// 6 9 22 5
// 14 40 12 60
// 6 9 5 100
// 41 98 38 51
// 59 8 40 1


   } 
}