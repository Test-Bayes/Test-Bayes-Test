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
}
