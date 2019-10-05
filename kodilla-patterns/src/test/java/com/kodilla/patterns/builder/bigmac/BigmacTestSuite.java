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
        //then
        Assert.assertEquals(3, howManyIngredients);
    }
}
