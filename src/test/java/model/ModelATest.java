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

}
