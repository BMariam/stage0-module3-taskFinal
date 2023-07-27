package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
		double temperatureFahrenheit = 9 * (double)temperatureCelsius / 5 + 32;
		System.out.println(temperatureFahrenheit);
    }
}
