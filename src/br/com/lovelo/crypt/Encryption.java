package br.com.lovelo.crypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class Encryption {

	private static final String ENCRYPT_MD5 = "MD5";
    private MessageDigest messageDigest;
    private BASE64Encoder encoder;

    public String encrypt(String value) throws NoSuchAlgorithmException{
    	return encryptByAlgorithm(ENCRYPT_MD5 , value);
    }
    
    
    private void useAlgortithm(String algorithm) throws NoSuchAlgorithmException{
    if (messageDigest == null || messageDigest.getAlgorithm() != algorithm){
        messageDigest = MessageDigest.getInstance(algorithm);
    }
        if (encoder == null) {
            encoder = new BASE64Encoder();
        }
         
    }
     
    private String encryptByAlgorithm(String algorithm, String value) throws NoSuchAlgorithmException{
        if (value == null) {
            throw new IllegalArgumentException("Value null");
        }
         
        useAlgortithm(algorithm);
        byte[] hash = messageDigest.digest(value.getBytes());
        return encoder.encode(hash);
    }
}
