package com.zebrait.chapter10;

import java.util.HashMap;
import java.util.Map;

public class TsingtaoBeerService implements BeerService{
	
	Map<String, Beer> beerMap=new HashMap<>();
	@Override
	public void updateBeer(String name, Beer beer) {
		// TODO Auto-generated method stub
		beerMap.put(name, beer);
		
	}

	@Override
	public void removeBeer(String name) {
		// TODO Auto-generated method stub
		beerMap.remove(name);
		
	}

	@Override
	public Beer getBeer(String name) {
		// TODO Auto-generated method stub
		return beerMap.get(name);
	}

	@Override
	public void clearBeer() {
		// TODO Auto-generated method stub
		beerMap.clear();
	}

}
