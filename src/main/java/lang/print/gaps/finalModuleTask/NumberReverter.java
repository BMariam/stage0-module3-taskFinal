package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
		int firstDigit = number / 100;
		int thirdDigit = number % 10;
		int secondDigit = (number - firstDigit * 100) / 10;

		System.out.println(thirdDigit + "" + secondDigit + "" + firstDigit);
    }
}
