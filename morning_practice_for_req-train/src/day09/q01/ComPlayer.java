package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable {

	public int doJanken() throws IOException {
		int num =(int)(Math.random()*3);
		System.out.println("コンピュータは"+num+"を選んだ");
		return num ;
	}

}
