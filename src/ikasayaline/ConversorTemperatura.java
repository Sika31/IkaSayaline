package ikasayaline;
/*Conversor Temperatura:
Tomando la clase Temperatura, genera un test para la misma que pruebe:
Un test para el método CelsiusAFarenheit, con un margen de error de un 0,01.
Un test para el método FarenheitACelsius, con un margen de error de un 0,01.
Un test que cree el objeto para ser usado antes de cada test.
Un test que ponga a null el objeto al acabar cada test.*/
public class ConversorTemperatura {
        public double celsiusAFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        public double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }