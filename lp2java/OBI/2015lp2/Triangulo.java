class Triangulo {
  int g1;
  int g2;
  int g3;
  int g4;

  void setG(int a, int b, int c, int d){
    this.g1 = a;
    this.g2 = b;
    this.g3 = c;
    this.g4 = d;
  }

  String checarTriangulo(){
    if (g3< g1+g2 & g2< g1+g3 & g1<g2+g3){
      return "S";
    }
    else if(g4<g3+g2 & g3<g4+g2 & g2<g3+g4){
      return "S";
    }
    else if(g4<g2+g1 & g2<g4+g1 & g1<g4+g2){
      return "S";
    }
    else if(g4<g3+g1 & g3<g4+g1 & g1<g4+g3){
      return "S";
    }
    return "N";
  }
}