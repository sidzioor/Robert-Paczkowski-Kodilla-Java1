package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("normal")
                .burgers(2)
                .ingredients("Bacon")
                .ingredients("Cheese")
                .ingredients("Cucumber")
                .sauce("Thousand Island dressing")
                .build();
        System.out.println(bigmac);
        //when
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();
        String whatBun = bigmac.getBun();
        //then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Thousand Island dressing", whatSauce);
        Assert.assertEquals("normal", whatBun);

    }
}
