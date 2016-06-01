package nl.openweb.structured.data.schema.entities;

import nl.ivonet.beanunit.BuilderBeanAsserter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static nl.ivonet.beanunit.BuilderBeanAsserter.createObject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Pim Schrama on 5/18/2016.
 */
public class AdministrativeAreaTest extends AbstractEntityTest{

    @Before
    public void setUp() throws Exception {
        registerBuilderBeanAsserterDefaults();
    }

    @After
    public void tearDown() throws Exception {
        resetToDefaultTypes();
    }

    @Test
    public void testAssertPojo() throws Exception {
        BuilderBeanAsserter.assertBean(AdministrativeArea.class, "context", "type", "image", "address");
    }

    @Test
    public void testCreateObject() throws Exception {
        final AdministrativeArea thing = createObject(AdministrativeArea.class);
        assertNotNull(thing);
        assertEquals(AdministrativeArea.class.getSimpleName(), thing.getType());
    }

}