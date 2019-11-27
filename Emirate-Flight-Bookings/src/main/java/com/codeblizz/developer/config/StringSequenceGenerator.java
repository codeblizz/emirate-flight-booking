package com.codeblizz.developer.config;

import java.io.Serializable;
import java.util.Properties;
import java.util.stream.Stream;

import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.*;

public class StringSequenceGenerator implements IdentifierGenerator, Configurable {

  private String prefix;

  @Override
  public Serializable generate(
    SharedSessionContractImplementor session, Object obj) 
    throws HibernateException {

      String query = String.format("select %s from %s", 
          session.getEntityPersister(obj.getClass().getName(), obj)
            .getIdentifierPropertyName(),
          obj.getClass().getSimpleName());

      Stream <String> ids = session.createQuery(query).stream();

      Long max = ids.map(o -> o.replace(prefix + "-", ""))
        .mapToLong(Long::parseLong)
        .max()
        .orElse(0L);

      return prefix + "-" + (max + 1);
  }

  public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) 
		  throws MappingException {
      prefix = properties.getProperty("prefix");
  }

@Override
public void configure(Properties properties) throws HibernateException {
	
}
}