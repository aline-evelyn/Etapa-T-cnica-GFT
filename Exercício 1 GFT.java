// Exercício 1

interface AreaCalculavel {
  double calculaArea();
}


class Quadrado implements AreaCalculavel {
  private int lado;

  public Quadrado(int lado) {
    this.lado = lado;
  }

  public double calculaArea() {
    return this.lado * this.lado;
  }
}
class Retangulo implements AreaCalculavel {
  private int largura;
  private int altura;

  public Retangulo(int largura, int altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public double calculaArea() {
    return this.largura * this.altura;
  }
}
class Circulo implements AreaCalculavel {
  private float pi;
  private int raioquadrado;

  public Circulo(float pi, int altura) {
    this.pi = pi;
    this.raioquadrado = raioquadrado;
  }

  public double calculaArea() {
    return this.pi * this.raioquadrado;