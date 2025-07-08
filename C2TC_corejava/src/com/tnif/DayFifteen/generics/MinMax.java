package com.tnif.DayFifteen.generics;

public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}
