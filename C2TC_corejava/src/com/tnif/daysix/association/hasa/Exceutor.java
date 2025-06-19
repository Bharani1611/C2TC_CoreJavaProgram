package com.tnif.daysix.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("leoDass1611, Vikram Colony", "Chennai", "TamilNadu", "600061");
		Person person = new Person("Bharani.K", address);
		person.displayInfo();
	}
}
