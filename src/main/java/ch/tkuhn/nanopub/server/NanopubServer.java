package ch.tkuhn.nanopub.server;

public class NanopubServer {

	public static void main(String[] args) {
		System.out.println("Nanopub Server");
		System.out.println("==============");
		System.out.println("");
		long c = ServerConf.getInfo().getNextNanopubNo();
		System.out.println("Number of stored nanopubs: " + c);
	}

}
