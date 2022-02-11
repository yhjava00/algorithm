package ioAndFourRulesPros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		int a = Integer.parseInt( br.readLine() );

		String b = br.readLine();
		for( int i = b.length() - 1;  i >= 0; i-- ) {

			char ch = b.charAt( i );
			System.out.println( a * ( ch - '0' ) );

		}

		System.out.println( a * Integer.parseInt( b ) );

	}

}
