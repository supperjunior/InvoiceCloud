package com.nordicnatural.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class GenUtil {

	private static HttpURLConnection huc = null;
	private static int statusCode = 200;

	public static void validateURL(String url) {
		try {
			huc = (HttpURLConnection) (new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			statusCode = huc.getResponseCode();
			if (statusCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
