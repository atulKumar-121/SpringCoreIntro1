package com.learn.springcoreone.properties;

import java.util.Properties;

public class CountriesAndLangs {
	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLangs [countryAndLang=" + countryAndLang + "]";
	}
}
