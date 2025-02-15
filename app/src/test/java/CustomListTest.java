import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(),listSize+1);
    }
    @Test
    public void testHasCity(){
        int listSize = list.getCount();
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(list.getCount(),listSize+1);
        assertTrue(list.hasCity(city));
    }
    @Test
     public void testDelete(){
        int listSize = list.getCount();
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(list.getCount(),listSize+1);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize);

    }
    @Test
     public void testCountCities(){
        int listSize = list.getCount();
        City city = new City("Edmonton","AB");
        City city2 = new City("Vancouver","BC");
        list.addCity(city);
        assertEquals(list.countCities(),listSize+1);
        list.addCity(city2);
        assertEquals(list.countCities(),listSize+2);

    }

}
