package model;

import org.junit.Test;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ModelBTest {

    @Test
    public void testGetAndSetName() {
        for(int i = 0; i < 10; i++) {
            ModelB model = new ModelB();
            String random = Utils.randomAlphaNumeric();
            model.setName(random);
            assertEquals(random, model.getName());
        }
    }

    @Test
    public void testGetAndSetValue1() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelB model = new ModelB();
            int k = random.nextInt();
            model.setValue1(k);
            assertEquals(k, model.getValue1());
        }
    }

    @Test
    public void testGetAndSetValue2() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelB model = new ModelB();
            int k = random.nextInt();
            model.setValue2(k);
            assertEquals(k, model.getValue2());
        }
    }

    @Test
    public void testGetAndSetValue3() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelB model = new ModelB();
            int k = random.nextInt();
            model.setValue3(k);
            assertEquals(k, model.getValue3());
        }
    }

    @Test
    public void testEqualsAndHashcode() {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            ModelB model1 = new ModelB();
            ModelB model2 = new ModelB();
            String name = Utils.randomAlphaNumeric();
            model1.setName(name);
            model2.setName(name);
            int value1 = random.nextInt();
            int value2 = random.nextInt();
            int value3 = random.nextInt();
            model1.setValue1(value1);
            model2.setValue1(value1);
            model1.setValue2(value2);
            model2.setValue2(value2);
            model1.setValue3(value3);
            model2.setValue3(value3);
            assertEquals(model1, model2);
            assertEquals(model1.hashCode(), model2.hashCode());
        }
    }

    @Test
    public void testToString() {
        ModelB modelB = new ModelB();
        String name = Utils.randomAlphaNumeric();
        modelB.setName(name);
        Random random = new Random();
        int value1 = random.nextInt();
        int value2 = random.nextInt();
        int value3 = random.nextInt();
        modelB.setValue1(value1);
        modelB.setValue2(value2);
        modelB.setValue3(value3);
        String expected = "ModelB{name=" + name + ", value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + "}";
        assertEquals(expected, modelB.toString());
    }
}
