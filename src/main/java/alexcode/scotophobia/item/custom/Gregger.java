package alexcode.scotophobia.item.custom;

import alexcode.scotophobia.Scotophobia;
import alexcode.scotophobia.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.block.Blocks;

public class Gregger extends Item {
    public Gregger(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        entity.kill();
        user.giveItemStack(ModItems.GREG.getDefaultStack());

        return ActionResult.SUCCESS;
    }
}
