package com.mbafiap.emailserver.dto;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Email {

	private String nomeDoUsuario;
	
	private String emailDestinatario;
	
	private String titulo;
	
	private String fileName;
	
	private String tipoDeEmail;

	private HashMap<String, String> contentReplace;

}
