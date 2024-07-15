
package net.mcreator.onc.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BasicTileBlock extends Block {
	public BasicTileBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}