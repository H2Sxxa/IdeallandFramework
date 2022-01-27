package com.somebody.idlframewok.blocks.tileEntity.builder;

import com.somebody.idlframewok.blocks.tileEntity.builder.builderAction.BuilderActionBase;
import com.somebody.idlframewok.blocks.tileEntity.builder.builderAction.BuilderActionBlock;
import com.somebody.idlframewok.blocks.ModBlocks;

import java.util.Vector;

public class TileEntityBuilderOne extends TileEntityBuilderBase {

	public void InitTaskQueue(){
		int radius = 10;
		list = new Vector<BuilderActionBase>();
		for (int x = -radius; x <= radius; x++)
			for (int z = -radius; z <= radius; z++) {
				list.add(new BuilderActionBlock(ModBlocks.CONSTRUCTION_SITE, x,-1,z));
			}
	}

	static
	{
		register("idlframewok:builder.builder_one", TileEntityBuilderOne.class);
	}
}
