package com.academia.entity.form;

public class AvaliacaoFisicaUpdateForm {

  private double peso;
  private double altura;
  
  
  public AvaliacaoFisicaUpdateForm() {
  }


public AvaliacaoFisicaUpdateForm(double peso, double altura) {
	super();
	this.peso = peso;
	this.altura = altura;
}


public double getPeso() {
	return peso;
}


public void setPeso(double peso) {
	this.peso = peso;
}


public double getAltura() {
	return altura;
}


public void setAltura(double altura) {
	this.altura = altura;
}
  
  
  
  
}
