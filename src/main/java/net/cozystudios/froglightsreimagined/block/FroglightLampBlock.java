package net.cozystudios.froglightsreimagined.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
//? if <1.21 {
/*import net.minecraft.util.Hand;
*///?}
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FroglightLampBlock extends Block {
    public static final BooleanProperty LIT = Properties.LIT;

    public FroglightLampBlock(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(LIT, Boolean.TRUE));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    //? if <1.21 {
    /*@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    *///?} else {
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
    //?}
        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }
        boolean newLit = !state.get(LIT);
        world.setBlockState(pos, state.with(LIT, newLit), Block.NOTIFY_ALL);
        world.playSound(null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.5F, newLit ? 0.8F : 0.6F);
        return ActionResult.SUCCESS;
    }
}
