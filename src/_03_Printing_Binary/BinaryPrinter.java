package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		byte b = (byte) 2;
		BinaryPrinter p = new BinaryPrinter();
		short s = (short) 9;
		int r = 34;
		long l = 523;
		p.printLongBinary(l);
	}
	public void printByteBinary(byte b) {
		System.out.print((b&0b10000000)>>7);
		System.out.print((b&0b01000000)>>6);
		System.out.print((b&0b00100000)>>5);
		System.out.print((b&0b00010000)>>4);
		System.out.print((b&0b00001000)>>3);
		System.out.print((b&0b00000100)>>2);
		System.out.print((b&0b00000010)>>1);
		System.out.print(b&0b00000001);	
	}
	
	public void printShortBinary(short s) {
		byte b1 = (byte) ((s&0xff00)>>8);
		byte b2 = (byte) (s&0x00ff);
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public void printIntBinary(int i) {
		short b1 = (short) ((i&0xff00)>>16);
		short b2 = (short) (i&0x00ff);
		printShortBinary(b1);
		printShortBinary(b2);
	}
	
	public void printLongBinary(long l) {
		int b1 = (int) ((l&0xff00)>>32);
		int b2 = (int) (l&0x00ff);
		printIntBinary(b1);
		printIntBinary(b2);
	}
}
