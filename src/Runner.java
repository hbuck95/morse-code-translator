
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MorseTranslator m = MorseTranslator.getInstance();

		String morse = ".--. .-. --- --. .-. .- -- -- .. -. --.  / .. ...  / ..-. ..- -.  / ";

		System.out.println(m.translateFromMorse(morse));
		System.out.println(m.translateToMorse("Programming is fun"));

	}

}
