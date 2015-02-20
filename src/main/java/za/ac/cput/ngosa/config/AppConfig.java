package za.ac.cput.ngosa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.ngosa.AeroImpl;
import za.ac.cput.ngosa.PaganiImpl;
import za.ac.cput.ngosa.TeslaImpl;
import za.ac.cput.ngosa.garageServices.Implementation.GarageInterface;

/**
 * Created by User on 2015/02/20.
 */
@Configuration
public class AppConfig {

    @Bean(name = "tesla")
    public GarageInterface getTes()
    {
        return new TeslaImpl();
    }

    @Bean(name= "pagani")
    public GarageInterface getPag()
    {
        return new PaganiImpl();
    }

    @Bean(name= "aero")
    public GarageInterface getAero()
    {
        return new AeroImpl();
    }

}
