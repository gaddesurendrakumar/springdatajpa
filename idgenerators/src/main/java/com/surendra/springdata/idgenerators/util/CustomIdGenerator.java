package com.surendra.springdata.idgenerators.util;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor si, Object object) throws HibernateException {
		Random random = new Random();
		
		return  Long.valueOf(random.nextInt(10000000));
	}

}
