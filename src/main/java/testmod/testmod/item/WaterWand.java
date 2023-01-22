package testmod.testmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import testmod.testmod.TestMod;

import java.util.Random;

public class WaterWand extends BowItem {
    public WaterWand(Properties properties) {
        super(properties);
    }

    /*
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(hand == InteractionHand.MAIN_HAND && !level.isClientSide) {
            player.sendSystemMessage(Component.translatable(TestMod.MODID + ".waterwand.right_click"));
            player.animateHurt();
        }

        //player.startUsingItem(hand);
        return super.use(level, player, hand);
    }

     */

    @Override
    public UseAnim getUseAnimation(ItemStack itemStack) {
        UseAnim anim = UseAnim.values()[(int) ((System.currentTimeMillis() / 10000) % UseAnim.values().length)];
        LogManager.getLogger().log(Level.INFO, anim.name());
        return anim;
    }


}
