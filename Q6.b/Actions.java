import java.lang.String;

import java.io.*;
import java.util.*;


public class Actions {
	
	public static void main(String[] args){
		Client1 client = new Client1(10,2);
		double reduc = client.checkDiscount();
		System.out.println("reduc client : "+reduc);
		Client client2 = new Client(121);
		GoldClient goldclient = new GoldClient(131);
		SilverClient silverclient = new SilverClient(145);
		System.out.println("client "+client2.checkDiscount()+" gold : "+goldclient.checkDiscount()+" silver : "+ silverclient.checkDiscount());
	}
}


