package Business;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encoding {
	 private static byte[] digest(byte[] input) {
	        MessageDigest md;
	        try {
	            md = MessageDigest.getInstance("MD5");
	        } catch (NoSuchAlgorithmException e) {
	            throw new IllegalArgumentException(e);
	        }
	        byte[] result = md.digest(input);
	        return result;
	    }

	    public static String md5(String word) {
	    	byte[] bytes = digest(word.getBytes(StandardCharsets.UTF_8));
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(String.format("%02x", b));
	        }
	        return sb.toString();
	    }
}
