package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	int c = 0;
	private Queue<String> queue;
	private ArrayList<String> discoveredWebsiteList;

	public WebCrawler() {
		this.queue = new LinkedList<>();
		this.discoveredWebsiteList = new ArrayList<>();
	}

	public void discoverWeb(String root) {
		this.queue.add(root);
		this.discoveredWebsiteList.add(root);
		while (!queue.isEmpty()) {
			String v = this.queue.remove();
			String rawHTML = readURL(v);
			String regexp = "https://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHTML);
			System.out.println();
			System.out.println("Parent URL: " + v);
			while (matcher.find()) {
				String actualURL = matcher.group();
				if (!discoveredWebsiteList.contains(actualURL)) {
					discoveredWebsiteList.add(actualURL);
					System.out.println("Website has been found with URL: " + actualURL);
					queue.add(actualURL);
					c++;
				}
			}
			System.out.println("Number of website found: " + c);
			System.out.println("Queue Size: " + queue.size());
		}
	}

	private String readURL(String v) {
		String rawHTML = "";
		try {
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine = "";
			while ((inputLine = in.readLine()) != null) {
				rawHTML += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rawHTML;
	}
}
