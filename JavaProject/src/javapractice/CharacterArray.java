package javapractice;

import java.util.Arrays;

public class CharacterArray {

	public static void main(String[] args) {


		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1]='m';
		ch[2]='n';
		ch[3]='z';
		ch[4]='y';
		
		
		
		char ch1[] = Arrays.copyOf(ch, 3);
		
		for(char d :ch1) {
			System.out.println(d);
		}

	}

}
