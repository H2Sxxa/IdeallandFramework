package com.somebody.idlframewok.world.biome;

import com.somebody.idlframewok.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class BiomeForDimOne extends BiomeBase {

    protected static final WorldGenAbstractTree TREE = new WorldGenBigTree(false);

    public BiomeForDimOne() {
        super(new BiomePropertiesModified("dim_one").setBaseHeight(-1.5f).setHeightVariation(1.2f).setTemperature(0.5f).setWaterColor(0xff3333));

        topBlock = ModBlocks.GRID_BLOCK_2.getDefaultState();
        fillerBlock = ModBlocks.GRID_BLOCK_1.getDefaultState();

        decorator.coalGen = new WorldGenMinable(Blocks.PLANKS.getDefaultState(), 10);

        decorator.treesPerChunk = 2;

        this.spawnableCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();

       // this.spawnableCreatureList.add(new SpawnListEntry(EntityGhast.class, 5, 1,2));
    }

    public BiomeForDimOne(BiomePropertiesModified properties) {
        super(properties);
    }


    @Override
    public WorldGenAbstractTree getRandomTreeFeature(Random random)
    {
        return TREE;
    }
}
