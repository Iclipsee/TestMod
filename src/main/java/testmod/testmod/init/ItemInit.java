package testmod.testmod.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import testmod.testmod.TestMod;
import testmod.testmod.item.EmeraldSword;
import testmod.testmod.item.WaterWand;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> EMERALD_SWORD_ITEM = ITEMS.register("emerald_sword", () -> new EmeraldSword(ToolTiers.EXAMPLE, 420-2, 1.87f-4f, new Item.Properties()));

    public static final RegistryObject<Item> WATER_WAND_ITEM = ITEMS.register("water_wand", () -> new WaterWand(new Item.Properties()));




    public static class Foods {
        public static final FoodProperties EXAMPLE_FOOD = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6f)
                .meat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 3), 0.9f)
                .build();
    }

    public static final RegistryObject<Item> EMERALD = RegistryObject.create(new ResourceLocation("minecraft:emerald"), ForgeRegistries.ITEMS);

    public static class ToolTiers {
        public static final Tier EXAMPLE = new ForgeTier(
                2,
                800,
                0f,
                1,
                350,
                null,
                () -> Ingredient.of(EMERALD.get()));
    }


}
