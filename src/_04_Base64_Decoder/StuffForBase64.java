package _04_Base64_Decoder;

public class StuffForBase64 {
public static void main(String[] args) {
	Base64Decoder b = new Base64Decoder();
	System.out.println(b.convertBase64Char('b'));
	for(byte c: b.convert4CharsTo24Bits("AAAA")) {
	System.out.print(c);
	}
}
}
