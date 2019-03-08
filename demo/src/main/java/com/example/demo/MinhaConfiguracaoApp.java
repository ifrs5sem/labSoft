package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="minhaconfig")
public class MinhaConfiguracaoApp {
	private String nomeAplicacao;
	private String descricao;
	private String primeiroNome;
	private String ultimoNome;
	private String emailAdmin;

	@Override
	public String toString() {
		return "MinhaConfiguracaoApp "
				+ "[nomeAplicacao=" + nomeAplicacao +
				", descricao=" + descricao +
				", primeiroNome=" + primeiroNome +
				", ultimoNome=" + ultimoNome +
				", emailAdmin=" + emailAdmin + "]";
	}

	public String getNomeAplicacao() {
		return nomeAplicacao;
	}
	public void setNomeAplicacao(String nomeAplicacao) {
		this.nomeAplicacao = nomeAplicacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
}