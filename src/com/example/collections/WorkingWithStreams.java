package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class WorkingWithStreams {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		Supplier<Stream<String>> streamSupplier = () ->myList.stream();
		streamSupplier.get().forEach(System.out::println);
		streamSupplier.get().filter(item -> item.startsWith("o")).findAny().ifPresent(System.out::println);
	}
}
