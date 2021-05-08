
public interface Criptazione {

	public static String criptazione(String frase, int incremento) {
		frase = frase.toLowerCase();
		StringBuilder builder = new StringBuilder();
		if (incremento >=26) {
			incremento %= 26;
		}
		for (int i = 0; i < frase.length(); i++) {
			int a = frase.charAt(i);
			char c = '1';
			if (a >= 97 && a < 123) {
				if (a + incremento <= 122) {
					c = (char) (frase.charAt(i) + incremento);
				} else {
					int resto = (a + incremento) - 123;
					c = (char) (97 + resto);

				}
			}
			
			else {
				c = (char) (frase.charAt(i));
			}
			builder.append(c);

		}
		String fraseModificata = builder.toString();
		return fraseModificata;
	}

}
