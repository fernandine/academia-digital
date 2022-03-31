package com.academia.entity.form;

import javax.validation.constraints.NotNull;


public class MatriculaForm {

  @NotNull(message = "Preencha o campo corretamente.")
 
  private Long alunoId;
  
  public MatriculaForm() {
  }

public MatriculaForm(@NotNull(message = "Preencha o campo corretamente.") Long alunoId) {
	super();
	this.alunoId = alunoId;
}

public Long getAlunoId() {
	return alunoId;
}

public void setAlunoId(Long alunoId) {
	this.alunoId = alunoId;
}
  
  
}
