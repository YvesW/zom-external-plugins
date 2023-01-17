package com.zom;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup(AFKGuardiansPlugin.CONFIG_GROUP)
public interface AFKGuardiansConfig extends Config
{
	@ConfigItem(
		keyName = "timeWasting",
		name = "Time to wait",
		description = "Amount of time before the round starts to notify",
		position = 1
	)
	default int timeWasting()
	{
		return 105;
	}

	@ConfigItem(
		keyName = "alertOnRed",
		name = "Alert on Fire/Death/Blood",
		description = "Notify that a overpowered altar is available",
		position = 2
	)
	default boolean alertOnRed()
	{
		return true;
	}
}
