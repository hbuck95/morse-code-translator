import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	private static MorseTranslator instance = null;
	private Map<String, Character> morseMap = new HashMap<String, Character>();

	private MorseTranslator() {
		morseMap.put(".-", 'a');
		morseMap.put("-...", 'b');
		morseMap.put("-.-.", 'c');
		morseMap.put("-..", 'd');
		morseMap.put(".", 'e');
		morseMap.put("..-.", 'f');
		morseMap.put("--.", 'g');
		morseMap.put("....", 'h');
		morseMap.put("..", 'i');
		morseMap.put(".---", 'j');
		morseMap.put("-.-", 'k');
		morseMap.put(".-..", 'l');
		morseMap.put("--", 'm');
		morseMap.put("-.", 'n');
		morseMap.put("---", 'o');
		morseMap.put(".--.", 'p');
		morseMap.put("--.-", 'q');
		morseMap.put(".-.", 'r');
		morseMap.put("...", 's');
		morseMap.put("-", 't');
		morseMap.put("..-", 'u');
		morseMap.put("...-", 'v');
		morseMap.put(".--", 'w');
		morseMap.put("-..-", 'x');
		morseMap.put("-.--", 'y');
		morseMap.put("--..", 'z');
		morseMap.put(".----", '1');
		morseMap.put("..---", '2');
		morseMap.put("...--", '3');
		morseMap.put("....-", '4');
		morseMap.put(".....", '5');
		morseMap.put("-....", '6');
		morseMap.put("--...", '7');
		morseMap.put("---..", '8');
		morseMap.put("----.", '9');
		morseMap.put("-----", '0');
	}

	public static MorseTranslator getInstance() {
		if (instance == null)
			instance = new MorseTranslator();
		return instance;
	}

	public String translateFromMorse(String morseString) {
		String[] words = morseString.toLowerCase().split(" / ");
		StringBuilder sb = new StringBuilder();

		for (String s : words) {
			String[] letters = s.split(" ");
			for (String l : letters)
				sb.append(getCharFromMorse(l));
			sb.append(" ");

		}

		sb.insert(0, Character.toUpperCase(sb.charAt(0))); // Used for making the first character uppercase.
		sb.deleteCharAt(1); // As above.

		return sb.toString();

	}

	public String translateToMorse(String sentence) {
		String[] words = sentence.toLowerCase().split(" ");
		StringBuilder sb = new StringBuilder();
		for (String s : words) {
			String[] letters = s.split("");
			for (String l : letters)
				sb.append(getMorseFromChar(l.charAt(0)) + " ");
			sb.append(" / ");
		}

		return sb.toString();

	}

	private char getCharFromMorse(String morse) {
		return morseMap.get(morse);
	}

	private String getMorseFromChar(char c) {
		for (Map.Entry<String, Character> entry : morseMap.entrySet()) {
			if (entry.getValue() == c)
				return entry.getKey();
		}

		return "";

	}

}
