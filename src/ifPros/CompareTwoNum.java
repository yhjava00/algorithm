package ifPros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTwoNum {

	public static void main( String[] args ) throws IOException {

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine(), " " );

		int a = Integer.parseInt( st.nextToken() );
		int b = Integer.parseInt( st.nextToken() );

		String ret;
		if( a > b ) {
			ret = ">";
		}
		else if( a < b ) {
			ret = "<";
		}
		else {
			ret = "==";
		}

		System.out.println( ret );

	}

}
