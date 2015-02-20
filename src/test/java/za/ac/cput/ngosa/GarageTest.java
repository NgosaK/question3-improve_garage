package za.ac.cput.ngosa;

import junit.framework.TestCase;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.ngosa.config.AppConfig;
import za.ac.cput.ngosa.garageServices.Implementation.GarageInterface;

/**
 * Created by User on 2015/02/20.
 */
public class GarageTest extends TestCase {

   private ApplicationContext contxt;
    GarageInterface garage;

    @Before
    public void setUp() throws Exception
    {
         contxt= new AnnotationConfigApplicationContext(AppConfig.class);
         garage = (GarageInterface) contxt.getBean("tesla");
    }


    @org.junit.Test
    public  void testName()
    {
        assertEquals("zonda",garage.name("huayra"));
    }

    @org.junit.Test
    public  void testCate()
    {
        assertEquals("exotic", garage.category("hybrid"));
    }

    @org.junit.Test
    public  void testValue()
    {
        assertEquals(5000,garage.value(654));
    }

    @org.junit.Test
    public  void testBHP()
    {
        assertEquals(500, garage.bhp(544));
    }

    @org.junit.Test
    public  void testColor()
    {
        assertEquals("yellow",garage.colour("blue"));
    }

}
