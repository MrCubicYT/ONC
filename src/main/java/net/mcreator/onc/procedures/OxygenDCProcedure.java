package net.mcreator.onc.procedures;

import net.minecraftforge.eventbus.api.Event;

public class OxygenDCProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Default oxygen density is: 1.43"), true);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("New oxygen density is:"), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##.##").format(DoubleArgumentType.getDouble(arguments, "density")))), false);
	}
}
