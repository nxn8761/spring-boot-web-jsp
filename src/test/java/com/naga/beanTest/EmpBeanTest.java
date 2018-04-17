package com.naga.beanTest;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.beans.EmpBean;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class EmpBeanTest {

	private EmpBean empBean;

	@Test
	public void testClientSubmissionProgress() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(EmpBean.class);
	}

	@Test
	public void equalsAndHashCodeContract() throws Exception {
		EqualsVerifier.forClass(EmpBean.class).suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS);
	}

	@Test
	public void beanIsSeriliziable() {
		final byte[] serilizedMyBean = SerializationUtils.serialize(empBean);
		final EmpBean deSerlizedMyBean = (EmpBean) SerializationUtils.deserialize(serilizedMyBean);
		assertEquals(empBean, deSerlizedMyBean);
	}
}
