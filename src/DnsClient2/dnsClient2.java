package DnsClient2;
import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Arrays;

public class dnsClient2 {

	public static void main(String[] args) throws Exception {
		
		byte[] respData = new byte[1024]; //convert this to DNS response
		int respDataOK = 0;
		
		//System.out.println(Arrays.toString(respData));
		
		String name;
		String serverIP;
		String reqType;
		String time;
		String numRetries;
		System.out.println("DnsClient sending request for " +  name + "\n"
				+ "Server: " + serverIP + "\n"
				+ "Request type: " +  reqType + "/n" 
				+ "Response received after " + time + " seconds (" 
				+ numRetries + "retries) \n");
		
		if (numAnswers.lenght() != 0) {
			System.out.println("***Answer Section ("+ numAnswers.length() + "records)*** \n")
			for (int j=0; j<numAnswers.length();j++) {
				if (type == "A") {
					System.out.println("IP	" + ipQuery + "	" + cacheTime[j] + "	" + authOrNot[j]);
					}
				if (type == "CNAME") {
					System.out.println("CNAME	" + aliasQuery + "	" + cacheTime[j] + "	" + authOrNot[j]);
					}
				if (type == "MX") {
					System.out.println("MX	" + aliasQuery + "	" + pref + "	" + cacheTime[j] + "	" + authOrNot[j]);
					}
				if (type == "NS") {
					System.out.println("NS	" + aliasQuery + "	" + cacheTime[j] + "	" + authOrNot[j]);
					}
				}
		}
		
		if ()
	    System.out.println("Done");
		

}
