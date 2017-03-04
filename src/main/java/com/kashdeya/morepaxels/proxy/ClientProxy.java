package com.kashdeya.morepaxels.proxy;

import com.kashdeya.morepaxels.handlers.RenderHandler;

public class ClientProxy extends CommonProxy{

    @Override
	public void registerRenderers() {
    	// Renders
    	RenderHandler.initItems();
	}
    
}
