package com.kashdeya.morepaxels.proxy;

import com.kashdeya.morepaxels.recipes.Recipes;

public class CommonProxy {
	
	public void init() {
    	// Recipes
		Recipes.registerRecipes();
    }

	public void registerRenderers() {
		//unused - only called clientside
	}

}
