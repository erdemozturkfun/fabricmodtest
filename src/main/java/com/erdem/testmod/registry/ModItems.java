package com.erdem.testmod.registry;

import com.erdem.testmod.Test;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    //blockitems
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){

        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
