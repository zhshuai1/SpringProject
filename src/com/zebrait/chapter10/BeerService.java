package com.zebrait.chapter10;

public interface BeerService {
	public void updateBeer(String name, Beer beer);
	public void removeBeer(String name);
	public Beer getBeer(String name);
	public void clearBeer();
}
