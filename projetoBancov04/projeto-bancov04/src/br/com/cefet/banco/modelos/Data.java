package br.com.cefet.banco.modelos;

public class Data {
	private String dia,mes,ano;
	
	public String getDataBr() {
		return this.dia+"/"+this.mes+"/"+this.ano;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return this.mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return this.ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void setData(String dia, String mes, String ano) {
		this.setDia(dia);
	}
}
