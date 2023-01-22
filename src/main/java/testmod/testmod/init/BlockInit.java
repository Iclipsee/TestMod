package testmod.testmod.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import testmod.testmod.TestMod;
import testmod.testmod.block.BlackBlock;
import testmod.testmod.block.GreenBlock;
import testmod.testmod.block.WhiteBlock;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public final class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static ToIntFunction<BlockState> lightLevel = BlockState -> 15;
    public static final RegistryObject<Block> GREEN_BLOCK = register("green_block", () -> new
            GreenBlock(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel)), new Item.Properties().stacksTo(4*9*64));

    public static final RegistryObject<Block> BLACK_BLOCK = register("black_block", () -> new
            BlackBlock(BlockBehaviour.Properties.of(Material.GLASS)), new Item.Properties());

    public static final RegistryObject<Block> WHITE_BLOCK = register("white_block", () -> new
            WhiteBlock(BlockBehaviour.Properties.of(Material.GLASS)), new Item.Properties());

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

}
