package WebCrawler;

public class App {

	public static void main(String[] args) {
		WebCrawler a = new WebCrawler();
		String rootURL = "https://www.youtube.com";
		a.discoverWeb(rootURL);
		System.out.println("Done");
	}

}
