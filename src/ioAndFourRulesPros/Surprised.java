package ioAndFourRulesPros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Surprised {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String id = br.readLine();
		String surprised = "??!";

		System.out.println( id + surprised );

	}

}
