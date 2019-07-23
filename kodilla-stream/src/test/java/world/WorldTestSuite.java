package world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent northAmerica = new Continent();

        Country poland = new Country(new BigDecimal("123456"));
        Country germany = new Country(new BigDecimal("654321"));
        Country italy = new Country(new BigDecimal("321456"));
        Country russia = new Country(new BigDecimal("456321"));
        Country china = new Country(new BigDecimal("1234656789987"));
        Country japan = new Country(new BigDecimal("4569897"));
        Country canada = new Country(new BigDecimal("7894123"));
        Country usa = new Country(new BigDecimal("985623"));
        Country mexico = new Country(new BigDecimal("741228"));

        //When
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        europe.addCountries(poland);
        europe.addCountries(germany);
        europe.addCountries(italy);

        asia.addCountries(russia);
        asia.addCountries(china);
        asia.addCountries(japan);

        northAmerica.addCountries(canada);
        northAmerica.addCountries(usa);
        northAmerica.addCountries(mexico);

        //Then
        BigDecimal expectedPeople = new BigDecimal("1234672536412");
        Assert.assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}
