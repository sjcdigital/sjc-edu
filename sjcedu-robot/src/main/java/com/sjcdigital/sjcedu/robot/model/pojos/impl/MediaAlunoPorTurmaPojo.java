package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.MediaAlunoPorTurma;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class MediaAlunoPorTurmaPojo implements Pojo {

	@JsonProperty("Educação infantil")
	private String educacaoInfantil;

	@JsonProperty("Anos iniciais")
	private String anosIniciais;

	@JsonProperty("Anos finais")
	private String anosFinais;

	@JsonProperty("Ensino médio")
	private String ensinoMedio;

	public String getEducacaoInfantil() {
		return educacaoInfantil;
	}

	public void setEducacaoInfantil(String educacaoInfantil) {
		this.educacaoInfantil = educacaoInfantil;
	}

	public String getAnosIniciais() {
		return anosIniciais;
	}

	public void setAnosIniciais(String anosIniciais) {
		this.anosIniciais = anosIniciais;
	}

	public String getAnosFinais() {
		return anosFinais;
	}

	public void setAnosFinais(String anosFinais) {
		this.anosFinais = anosFinais;
	}

	public String getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(String ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}

	@Override
	public MediaAlunoPorTurma paraEntidade() {
		return new MediaAlunoPorTurma(educacaoInfantil, anosIniciais, anosFinais, ensinoMedio);
	}

}
