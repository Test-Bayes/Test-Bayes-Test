package model;

import org.junit.Test;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ModelATest {

    @Test
    public void testGetAndSetName() {
        for(int i = 0; i < 10; i++) {
            ModelA model = new ModelA();
            String random = Utils.randomAlphaNumeric();
            model.setName(random);
            assertEquals(random, model.getName());
        }
    }

    @Test
    public void testGetAndSetValue() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelA model = new ModelA();
            int k = random.nextInt();
            model.setValue(k);
            assertEquals(k, model.getValue());
        }
    }

    @Test
    public void testEqualsAndHashcode() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelA model1 = new ModelA();
            ModelA model2 = new ModelA();
            String name = Utils.randomAlphaNumeric();
            model1.setName(name);
            model2.setName(name);
            int value = random.nextInt();
            model1.setValue(value);
            model2.setValue(value);
            assertEquals(model1, model2);
            assertEquals(model1.hashCode(), model2.hashCode());
        }
    }

    @Test
    public void testToString() {
        ModelA modelA = new ModelA();
        String name = Utils.randomAlphaNumeric();
        modelA.setName(name);
        Random random = new Random();
        int value = random.nextInt();
        modelA.setValue(value);
        String expected = "ModelA{name=" + name + ", value=" + value + "}";
        assertEquals(expected, modelA.toString());
    }

}
