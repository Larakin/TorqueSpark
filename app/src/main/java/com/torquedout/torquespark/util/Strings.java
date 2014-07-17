package com.torquedout.torquespark.util;


public class Strings {

	public static String getRedacted(String value) {
		return (value == null)
				? "<null>"
				: String.format("[  REDACTED  (length: %d) ]", value.length());
	}

}
