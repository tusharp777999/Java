package com.tushar.beans;

import java.util.Date;
import java.util.function.Supplier;

public class DateApp {
	public static void main(String[] args) {
		Supplier<Date> dateSupplier = () -> new Date();
		System.out.println(dateSupplier.get());
	}
}
