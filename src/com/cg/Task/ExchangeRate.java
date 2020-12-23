package com.cg.Task;

public class ExchangeRate {

	private String currencyAlpha;
	private double currencyValue;

	public ExchangeRate(String currencyAlpha, double currencyValue) {
		this.currencyAlpha = currencyAlpha;
		this.currencyValue = currencyValue;
	}

	public String getCurrencyAlpha() {
		return currencyAlpha;
	}

	public void setCurrencyAlpha(String currencyAlpha) {
		this.currencyAlpha = currencyAlpha;
	}

	public double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(double currencyValue) {
		this.currencyValue = currencyValue;
	}

}
