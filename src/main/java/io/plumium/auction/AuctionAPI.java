package io.plumium.auction;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface AuctionAPI {

    void putItemForSale(Player player, ItemStack item, long price) throws Exception;
}
