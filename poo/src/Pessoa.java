import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class Pessoa{
  private String nome;
  private int energia;
  private int fome;
  private Caneta c1;

public Caneta getC1() {
	return c1;
}


public void setC1(Caneta c1) {
	this.c1 = c1;
}


public Pessoa(String nome,String marca,String modelo, String cor){
    this.nome=nome;
    this.energia=30;
    this.fome=0;
    this.c1=new Caneta();
    c1.setMarca(marca);
    c1.setModelo(modelo);
    c1.setCor(cor);
  }

  
  public String getNome() {
  	return nome;
  }
  
  public void setNome(String nome) {
  	this.nome = nome;
  }

  public void desenhar(){
    if(this.energia>=30){
        this.c1.destaparCaneta();
        System.out.println("Estou desenhando");
        c1.desenhar();
        this.energia=this.energia-30;
    }else if(this.fome<3){
      this.descansar();
      this.c1.tamparCaneta();
    }else{
      System.out.println("Você precisa se Alimentar");
    }
  }

  public void escrever(){
    if(this.energia>=10 ) {
      this.c1.destaparCaneta();
      System.out.println("Estou escrevendo");
      c1.escrever();
      this.energia=this.energia-10;
      
    }else if(this.fome<3){
      this.descansar();
      this.c1.tamparCaneta();
    }else{
      System.out.println("Você precisa se Alimentar");
    }

  }

  private void descansar(){
    this.energia=this.energia+30;
    this.fome=this.fome+1;
  }
  
  public void status(){
    System.out.println("xxxxxxxxxxxxxxxxx");
    System.out.println("Nome: "+this.nome);
     System.out.println("Energia: "+this.energia);
    System.out.println("xxxxxxxxxxxxxxxxx");
    c1.status();
  }
    
  }