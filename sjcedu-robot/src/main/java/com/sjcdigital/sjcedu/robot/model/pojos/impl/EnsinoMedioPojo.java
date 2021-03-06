package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.EnsinoMedio;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class EnsinoMedioPojo implements Pojo {

	@JsonProperty("Grupo 1[strHint035]")
	private String grupo1;

	@JsonProperty("Grupo 2[strHint036]")
	private String grupo2;

	@JsonProperty("Grupo 3[strHint037]")
	private String grupo3;

	@JsonProperty("Grupo 4[strHint038]")
	private String grupo4;

	@JsonProperty("Grupo 5[strHint039]")
	private String grupo5;

	public String getGrupo1() {
		return grupo1;
	}

	public void setGrupo1(String grupo1) {
		this.grupo1 = grupo1;
	}

	public String getGrupo2() {
		return grupo2;
	}

	public void setGrupo2(String grupo2) {
		this.grupo2 = grupo2;
	}

	public String getGrupo3() {
		return grupo3;
	}

	public void setGrupo3(String grupo3) {
		this.grupo3 = grupo3;
	}

	public String getGrupo4() {
		return grupo4;
	}

	public void setGrupo4(String grupo4) {
		this.grupo4 = grupo4;
	}

	public String getGrupo5() {
		return grupo5;
	}

	public void setGrupo5(String grupo5) {
		this.grupo5 = grupo5;
	}

	@Override
	public EnsinoMedio paraEntidade() {
		return new EnsinoMedio(grupo1, grupo2, grupo3, grupo4, grupo5);
	}

}
