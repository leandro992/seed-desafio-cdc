package com.deveficiente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.Assert;

import java.util.List;

public class UniqueValueValidator implements ConstraintValidator<UniqueValue, Object> {

    private String domainAttribute;
    private Class<?> klass;
    @PersistenceContext
    private EntityManager entityManager;

    public void initialize(UniqueValue params){
        domainAttribute = params.fieldName();
        klass = params.domainClass();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Query query = entityManager.createQuery("select 1 from "+ klass.getName() +" where " + domainAttribute + "=:value");
        query.setParameter("value", value);
        List<?> list = query.getResultList();
        Assert.state(list.size() <=1, "Foi encontro mais de um " + klass+ " com o nome" + value);
        return list.isEmpty();
    }


}
