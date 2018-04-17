package com.naga.beanTest;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.beans.EmpLombokBean;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class EmpLombokBeanTest {

	private EmpLombokBean empBean;

	@Test
	public void testClientSubmissionProgress() {
		BeanTester beanTester = new BeanTester();
		beanTester.testBean(EmpLombokBean.class);
	}

	@Before
	public void setUp() throws Exception {
		empBean = new EmpLombokBean();
	}
	
	@Test
	public void equalsAndHashCodeContract() throws Exception {
		EqualsVerifier.forClass(EmpLombokBean.class).suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS);
	}

	@Test
	public void beanIsSeriliziable() {
		final byte[] serilizedMyBean = SerializationUtils.serialize(empBean);
		final EmpLombokBean deSerlizedMyBean = (EmpLombokBean) SerializationUtils.deserialize(serilizedMyBean);
		assertEquals(empBean, deSerlizedMyBean);
	}
}
