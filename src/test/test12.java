package test;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class test12 {
	public static void main(String[] args){
		final String value = System.getenv("PE_CONF_PWD");
		System.out.println(value);
		String version = System.getProperty("java.version");
		System.out.println(version);
		System.out.println("test");
		  InetAddress ip;
	        String hostname;
	        try {
	            ip = InetAddress.getLocalHost();
	            hostname = InetAddress.getLocalHost().getHostName();
	            System.out.println("Your current IP address : " + ip);
	            System.out.println("Your current Hostname : " + hostname);
	            InetAddress IP=InetAddress.getLocalHost();
		        System.out.println("safdasdf"+IP.toString());
		        InetAddress addr = InetAddress.getLocalHost();
		        ip = addr.getHostAddress();
		        System.out.println("Ip: " + ip);

	        } catch (UnknownHostException e) {

	            e.printStackTrace();
	        }
	        
	       
	    }
		
		
	}

