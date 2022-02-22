package com.mbafiap.emailserver.enums;

import java.util.HashMap;

import com.mbafiap.emailserver.component.ConteudoEmailStatusEntrega;
import com.mbafiap.emailserver.dto.Email;

public enum TipoDeEmail implements TipoDeEmailInterface {
	
	OBRIGADO_AVALIACAO {

		@Override
		public Email execute(Email email) {
			
			email.setTitulo("Seja Bem Vindo(a) " + email.getNomeDoUsuario());
			email.setFileName("obrigadoAvaliacao.html");

			return email;
		}
	},
	BOAS_VINDAS_CLIENTE {

		@Override
		public Email execute(Email email) {
			
			email.setTitulo("Seja Bem Vindo(a) " + email.getNomeDoUsuario());
			email.setFileName("boasvindas.html");

			return email;
		}
	},
	ENTREGA {

		@Override
		public Email execute(Email email) {
			
			HashMap<String, String> contentReplace = email.getContentReplace();
			
			String status = contentReplace.get("**status**");
			
			ConteudoEmailStatusEntrega titulo = ConteudoEmailStatusEntrega.valueOf(status);
			
			email.setTitulo(titulo.toString());
			email.setFileName("statusDeEntrega.html");

			return email;
		}
	},
	Multiply {

		@Override
		public Email execute(Email email) {
			
			email.setTitulo("Sua encomenda foi atualizada, veja mais detalhes");
			email.setFileName("boasvindas.html");

			return email;
		}
	};
}