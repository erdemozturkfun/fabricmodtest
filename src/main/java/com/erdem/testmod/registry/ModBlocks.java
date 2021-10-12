package com.erdem.testmod.registry;

import com.erdem.testmod.Test;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(3.0f, 500.0f)
            .sounds(BlockSoundGroup.CALCITE)
            .luminance(1));

    public static void registerItems(){
        Registry.register(Registry.BLOCK, new Identifier(Test.MOD_ID, "ruby_block"), RUBY_BLOCK);

    }
}
