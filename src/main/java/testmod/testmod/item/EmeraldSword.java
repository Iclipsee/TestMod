package testmod.testmod.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.ForgeTier;

public class EmeraldSword extends SwordItem {
    public EmeraldSword(Tier tier, int attackDamage, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
        //super(new ForgeTier(2, 800, 1.5f, 3, 350, new TagKey<>()), 6, 1.87f, properties);
    }
}
