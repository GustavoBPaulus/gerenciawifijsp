package teste;

import java.security.NoSuchAlgorithmException;

import util.Md5Converte;

public class retornaSenhaMd5 {
	
	
	public static void main(String[] args) {
		try {
			System.out.println(Md5Converte.converte("123"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
