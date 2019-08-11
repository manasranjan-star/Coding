package com.walmart;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Address {
	public static final Address EMPTY_ADDRESS = new Address("", "", "", 0);
	private final String line1;
	private final String city;
	private final String country;
	private final int zipcode;

	public Address(String line1, String city, String country, int zipcode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String line1() {
		return line1;
	}

	public String city() {
		return city;
	}

	public String country() {
		return country;
	}

	public int zipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}';
	}
}

class Person {
	private String name;
	private Optional<Address> address;
	private int phone;

	public Person(String name, Optional<Address> address, int phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public Optional<Address> address() {
		return address;
	}

	public int phone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
	}

}

public class OptionalDemo {
	public static void main(String[] args) {

		Address johnaddress = new Address("52/A, 22nd Street", "Mumbai", "India", 400001);
		Person john = new Person("John", Optional.of(johnaddress), 874731232);
		Person mac = new Person("Mac", Optional.empty(), 333299911);
		Person gautam = new Person("Gautam", Optional.empty(), 533299911);
		
		List<Person> people = new ArrayList<>();
		people.add(john);
		people.add(mac);
		people.add(gautam);
		
		people.stream().forEach((p) -> {
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS));
		});

	}
}
