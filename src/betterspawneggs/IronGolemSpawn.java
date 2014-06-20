package betterspawneggs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class IronGolemSpawn implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerClick(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if (e.getPlayer().getItemInHand().getType() == Material.MONSTER_EGG && e.getPlayer().getItemInHand().getItemMeta().getDisplayName() == "§rSpawn IronGolem"){
			Location bloc = e.getClickedBlock().getLocation();
			e.getPlayer().getWorld().spawnCreature(bloc.add(0, 1, 0), EntityType.IRON_GOLEM);
			if (e.getPlayer().getItemInHand().getAmount() == 1){
				e.getPlayer().setItemInHand(new ItemStack(Material.AIR));
				return;
			}
			e.getPlayer().getItemInHand().setAmount(e.getPlayer().getItemInHand().getAmount() - 1);
		}
		}
	}

}
