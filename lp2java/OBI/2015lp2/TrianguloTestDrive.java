import java.util.Scanner;


class TrianguloTestDrive{
  public static void main(String[] args) {
    Triangulo t = new Triangulo();
    int x1;
    int x2;
    int x3;
    int x4;

    Scanner sc = new Scanner(System.in);
    x1 = sc.nextInt();
    x2 = sc.nextInt();
    x3 = sc.nextInt();
    x4 = sc.nextInt();

    t.setG(x1, x2, x3, x4);
    System.out.println(t.checarTriangulo());




   } 
}