package me.jurre.tcs.listener;

import me.jurre.tcs.Tcs;
import me.jurre.tcs.customfeature.CustomItems;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Skull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {

    private Tcs plugin;

    public BlockBreakListener(Tcs plugin) {
        this.plugin = plugin;
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onBreak(BlockBreakEvent e) {

        if (e.getBlock().getType().equals(Material.PLAYER_HEAD) || e.getBlock().getType().equals(Material.PLAYER_WALL_HEAD)) {

            Block block = e.getBlock();
            BlockState blockState = block.getState();
            Skull skull = (Skull) blockState;

            if (skull.getOwner() == null) {
                return;
            }

            CustomItems customItems = plugin.getCustomItems();

            switch (skull.getOwner()) {
                case "MHF_Pig":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.pigHead);
                    break;
                case "MHF_Cow":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.cowHead);
                    break;
                case "MHF_Chicken":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.chickenHead);
                    break;
                case "MHF_Sheep":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.sheepHead);
                    break;
                case "MHF_Squid":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.squidHead);
                    break;

                case "MHF_Skeleton":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.skeletonHead);
                    break;
                case "MHF_Zombie":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.zombieHead);
                    break;
                case "MHF_Witch":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.witchHead);
                    break;
                case "MHF_Enderman":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.endermanHead);
                    break;
                case "MHF_Ocelot":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.ocelotHead);
                    break;
                case "0l1v3_01l":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.drownedHead);
                    break;

                case "MHF_Villager":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.villagerHead);
                    break;
                case "MHF_Slime":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.slimeHead);
                    break;
                case "MHF_LavaSlime":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.magmaCubeHead);
                    break;
                case "MHF_Blaze":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.blazeHead);
                    break;
                case "MHF_Guardian":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.guardianHead);
                    break;
                case "GrinningSkeleton":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.caveSpiderHead);
                    break;

                case "MHF_EGuardian":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.elderGuardianHead);
                    break;
                case "MHF_Wither":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.witherHead);
                    break;
                case "MHF_Golem":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.ironGolemHead);
                    break;
                case "MHF_Ghast":
                    e.setDropItems(false);
                    block.getLocation().getWorld().dropItemNaturally(block.getLocation(), customItems.ghastHead);
                    break;
            }
        }
    }
}