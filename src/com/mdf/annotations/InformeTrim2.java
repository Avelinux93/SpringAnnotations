package com.mdf.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeTrim2 implements ICreacionInforme {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Reporte de trimestre 2.";
	}

}
