public class Caneta{
  private String marca;
  private String modelo;
  private  String cor;
  private int cargar;
  private boolean tampada;
  //Construtor;
  public Caneta(){
    this.tampada=true;
    this.cargar=100;
  }
  //Métodos;

   public int getCargar() {
  	return cargar;
  }
  public void setCargar(int cargar) {
  	this.cargar = cargar;
  }
  public boolean isTampada() {
  	return tampada;
  }
  public void setTampada(boolean tampada) {
  	this.tampada = tampada;
  }
  public void setMarca (String marca){
      this.marca=marca;
    }
  public void setModelo(String modelo){
    this.modelo=modelo;
  }

  public void setCor(String cor){
    this.cor=cor;
  }

  public String getMarca(){
    return this.marca;
  }

  public String getModelo(){
    return this.modelo;
  }

  public String getCor(){
    return this.cor;
  }


  public void status(){
    System.out.println("------------------------------");
    System.out.printf("Marcar: %s \n Modelo: %s \n Cor: %s\n tampa: %s \n Carga: %s \n\n",       this.marca, this.modelo, this.cor, this.tampada, this.cargar);
    System.out.println("-------------------------------");
  }

  public void desenhar(){
    if(this.tampada==true || this.getCargar()<20){
      System.out.println("Caneta tampada");
    }else{
      this.cargar=getCargar()-20;
    }
  }
  public void escrever(){
    if(this.tampada==true || this.getCargar()<10){
      System.out.println("Caneta tampada");
    }else{
      this.cargar=getCargar()-10;
    }
  }

  public void destaparCaneta(){
    this.setTampada(false);
  }

  public void tamparCaneta(){
    this.setTampada(true);
  }


}