package com.wastedbankspace;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Wasted Bank Space")
public interface WastedBankSpaceConfig extends Config
{
	/*Order
		PoH Storage
		Check Stash Units
		Tackle Box
		Bolt Pouch
		-- Below here is for the future and Ideas--
		Master Scroll Book
		Key Ring
		Seeds - Box or Vault
		Herb Sack
		Gem Bag
		Rune Pouch
		Fossil Island Chest

		Other storage spaces
		Looting bag
		Hespori
		Flag useless quest items
	 */
	@ConfigItem(keyName = "pohStorageCheck",
			name = "PoH Storage",
			description = "Check for items that could be in your PoH storage",
			position = 1
	)
	default boolean pohStorageCheck()
	{
		return true;
	}

	@ConfigItem(keyName = "stashUnitCheck",
			name = "Stash Units",
			description = "Check for items that could be in unused Stash Units",
			position = 2
	)
	default boolean stashUnitCheck()
	{
		return true;
	}

	@ConfigItem(keyName = "tackleBoxCheck",
			name = "Tackle Box Items",
			description = "Check for items that could be in your tackle box",
			position = 3
	)
	default boolean tackleBoxCheck()
	{
		return true;
	}

	@ConfigItem(keyName = "boltPouchCheck",
			name = "Bolt Pouch",
			description = "Check for items that could be in your bolt pouch - Hirko in eastern Keldagrim",
			position = 4
	)
	default boolean boltPouchCheck()
	{
		return true;
	}
}