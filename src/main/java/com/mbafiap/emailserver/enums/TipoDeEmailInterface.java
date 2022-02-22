package com.mbafiap.emailserver.enums;

import com.mbafiap.emailserver.dto.Email;

interface TipoDeEmailInterface {

	Email execute(Email email);
}