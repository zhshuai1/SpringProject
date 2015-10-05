package com.zebrait.chapter10;

import org.springframework.beans.factory.annotation.Autowired;

public class Waiter {
	@Autowired
	private BeerService beerService;
	public void updateBeer(String name, Beer beer){
		beerService.updateBeer(name, beer);
	}
	public Beer getBeer(String name){
		return beerService.getBeer(name);
	}
}
