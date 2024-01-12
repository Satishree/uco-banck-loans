package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

import javax.print.DocFlavor.BYTE_ARRAY;

public class PWDUtils {
  public String encodPwd(String pwd) {
	Encoder encoder= Base64.getEncoder();	
	 byte[] encode =encoder.encode(pwd.getBytes());
	 String encodedPwd= new String(encode);
	 return encodedPwd;
  }
}
