package classes;

import java.math.BigInteger;

public class BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static BigInteger add(BigInteger x, BigInteger y){ 
       return x.add(y);      
    }
	
	static BigInteger mul(BigInteger x, BigInteger y){
	    
        return x.multiply(y);
             
    }
	
	static BigInteger mod(BigInteger x, BigInteger y){
        return x.mod(y);  
    }
}
