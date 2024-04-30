package ikasayaline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {
    private ConversorTemperatura conversor ;
// Cambio punto 10 creación de rama
    @BeforeEach
    public void setUp() {
        System.out.println("Empieza el conversor de temperatura");
        conversor = new ConversorTemperatura();
    }
    @AfterEach
    public void testAfterEach(){
        System.out.println("After each");
    conversor = null;
    }
    @Test
    public void celsiusAFarenheit (){
        System.out.println("Celsius A Farenheit");
        double resultado=conversor.celsiusAFahrenheit(0);
        assertEquals(32,resultado,0.01); // Aceptamos un margen de error de 0.01
    }
    // Punto 8 cambio en inteliJ
   @Test
    public void fahrenheitACelsius (){
        System.out.println("Farenheit a Celsius ");
        double resultado =conversor.fahrenheitACelsius(32);
        assertEquals(0,resultado,0.01);// Aceptamos un margen de error de 0.01
    }

    // Punto 8 CAMBIO GITHUB
}
