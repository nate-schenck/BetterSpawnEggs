package betterspawneggs;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		ItemStack snow = new ItemStack(Material.MONSTER_EGG, 1);
		ItemMeta snowm = (ItemMeta) snow.getItemMeta();
		snowm.setDisplayName("§rSpawn SnowGolem");
		snow.setItemMeta(snowm);
		ItemStack iron = new ItemStack(Material.MONSTER_EGG, 1);
		ItemMeta ironm = (ItemMeta) iron.getItemMeta();
		ironm.setDisplayName("§rSpawn IronGolem");
		iron.setItemMeta(ironm);
		ItemStack giant = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
		ItemMeta giantm = (ItemMeta) giant.getItemMeta();
		giantm.setDisplayName("§rSpawn Giant");
		giant.setItemMeta(giantm);
		ItemStack wither = new ItemStack(Material.MONSTER_EGG, 1, (short) 65);
		ItemMeta witherm = (ItemMeta) wither.getItemMeta();
		witherm.setDisplayName("§rSpawn Wither");
		wither.setItemMeta(witherm);
		ItemStack enderdragon = new ItemStack(Material.MONSTER_EGG, 1, (short) 58);
		ItemMeta enderdragonm = (ItemMeta) enderdragon.getItemMeta();
		enderdragonm.setDisplayName("§rSpawn EnderDragon");
		enderdragon.setItemMeta(enderdragonm);
		ShapedRecipe cowegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 92)).shape(new String[]{
				"***", "*&*", "*#*"}).setIngredient('*', Material.RAW_BEEF).setIngredient('&', Material.EGG).setIngredient('#', Material.MILK_BUCKET);
		ShapedRecipe pigegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 90)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.PORK).setIngredient('&', Material.EGG);
		ShapedRecipe chickenegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 93)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.FEATHER).setIngredient('&', Material.EGG);
		ShapedRecipe mooshyegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 96)).shape(new String[]{
				"*#*", "#&#", "*#*"}).setIngredient('*', Material.RED_MUSHROOM).setIngredient('&', Material.EGG).setIngredient('#', Material.BROWN_MUSHROOM);
		ShapedRecipe squidegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 94)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.INK_SACK).setIngredient('&', Material.EGG);
		ShapedRecipe wolfegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 95)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.BONE).setIngredient('&', Material.EGG);
		ShapedRecipe categg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 98)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.RAW_FISH).setIngredient('&', Material.EGG);
		ShapedRecipe horseegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 100)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.SADDLE).setIngredient('&', Material.EGG);
		ShapedRecipe villegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 120)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.EMERALD).setIngredient('&', Material.EGG);
		ShapedRecipe creeperegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 50)).shape(new String[]{
				"***", "*&*", "###"}).setIngredient('*', Material.SULPHUR).setIngredient('&', Material.EGG).setIngredient('#', Material.TNT);
		ShapedRecipe zombieegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 54)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.ROTTEN_FLESH).setIngredient('&', Material.EGG);
		ShapedRecipe skeletonegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 51)).shape(new String[]{
				"*#*", "*&*", "*#*"}).setIngredient('*', Material.BONE).setIngredient('&', Material.EGG).setIngredient('#', Material.BOW);
		ShapedRecipe spideregg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 52)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.SPIDER_EYE).setIngredient('&', Material.EGG);
		ShapedRecipe slimeegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 55)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.SLIME_BALL).setIngredient('&', Material.EGG);
		ShapedRecipe ghastegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 56)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.GHAST_TEAR).setIngredient('&', Material.EGG);
		ShapedRecipe pigmanegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 57)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.GOLD_INGOT).setIngredient('&', Material.EGG);
		ShapedRecipe endermanegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 58)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.ENDER_PEARL).setIngredient('&', Material.EGG);
		ShapedRecipe cavespideregg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 59)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.FERMENTED_SPIDER_EYE).setIngredient('&', Material.EGG);
		ShapedRecipe silverfish = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 60)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.MOSSY_COBBLESTONE).setIngredient('&', Material.EGG);
		ShapedRecipe blazeegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 61)).shape(new String[]{
				"*#*", "*&*", "*#*"}).setIngredient('*', Material.BLAZE_ROD).setIngredient('&', Material.EGG).setIngredient('#', Material.BLAZE_POWDER);
		ShapedRecipe magmacubeegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 62)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.MAGMA_CREAM).setIngredient('&', Material.EGG);
		ShapedRecipe bategg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 65)).shape(new String[]{
				"#*#", "#&#", "#*#"}).setIngredient('*', Material.FEATHER).setIngredient('&', Material.EGG).setIngredient('#', Material.INK_SACK);
		ShapedRecipe witchegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short) 66)).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.POTION).setIngredient('&', Material.EGG);
		ShapedRecipe snowegg = new ShapedRecipe(snow).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.SNOW_BLOCK).setIngredient('&', Material.EGG);
		ShapedRecipe ironegg = new ShapedRecipe(iron).shape(new String[]{
				"#@#", "#&#", "#*#"}).setIngredient('*', Material.IRON_BLOCK).setIngredient('&', Material.EGG).setIngredient('#', Material.IRON_INGOT).setIngredient('@', Material.PUMPKIN);
		ShapedRecipe giantegg = new ShapedRecipe(giant).shape(new String[]{
				"***", "#&#", "***"}).setIngredient('*', Material.DIAMOND_BLOCK).setIngredient('&', Material.EGG).setIngredient('#', Material.ROTTEN_FLESH);
		ShapedRecipe witheregg = new ShapedRecipe(wither).shape(new String[]{
				"***", "#&#", "***"}).setIngredient('*', Material.SOUL_SAND).setIngredient('&', Material.EGG).setIngredient('#', Material.SKULL_ITEM);
		ShapedRecipe enderdragonegg = new ShapedRecipe(enderdragon).shape(new String[]{
				"***", "*&*", "***"}).setIngredient('*', Material.EYE_OF_ENDER).setIngredient('&', Material.ENDER_PEARL);
		if (getConfig().getString("cow").equalsIgnoreCase("true")){
		getServer().addRecipe(cowegg);
		}
		if (getConfig().getString("pig").equalsIgnoreCase("true")){
		getServer().addRecipe(pigegg);
		}
		if (getConfig().getString("chicken").equalsIgnoreCase("true")){
		getServer().addRecipe(chickenegg);
		}
		if (getConfig().getString("mooshroom").equalsIgnoreCase("true")){
		getServer().addRecipe(mooshyegg);
		}
		if (getConfig().getString("squid").equalsIgnoreCase("true")){
		getServer().addRecipe(squidegg);
		}
		if (getConfig().getString("wolf").equalsIgnoreCase("true")){
		getServer().addRecipe(wolfegg);
		}
		if (getConfig().getString("creeper").equalsIgnoreCase("true")){
		getServer().addRecipe(creeperegg);
		}
		if (getConfig().getString("zombie").equalsIgnoreCase("true")){
		getServer().addRecipe(zombieegg);
		}
		if (getConfig().getString("skeleton").equalsIgnoreCase("true")){
		getServer().addRecipe(skeletonegg);
		}
		if (getConfig().getString("blaze").equalsIgnoreCase("true")){
		getServer().addRecipe(blazeegg);
		}
		if (getConfig().getString("witch").equalsIgnoreCase("true")){
		getServer().addRecipe(witchegg);
		}
		if (getConfig().getString("bat").equalsIgnoreCase("true")){
		getServer().addRecipe(bategg);
		}
		if (getConfig().getString("silverfish").equalsIgnoreCase("true")){
		getServer().addRecipe(silverfish);
		}
		if (getConfig().getString("magmacube").equalsIgnoreCase("true")){
		getServer().addRecipe(magmacubeegg);
		}
		if (getConfig().getString("cavespider").equalsIgnoreCase("true")){
		getServer().addRecipe(cavespideregg);
		}
		if (getConfig().getString("enderman").equalsIgnoreCase("true")){
		getServer().addRecipe(endermanegg);
		}
		if (getConfig().getString("pigman").equalsIgnoreCase("true")){
		getServer().addRecipe(pigmanegg);
		}
		if (getConfig().getString("ghast").equalsIgnoreCase("true")){
		getServer().addRecipe(ghastegg);
		}
		if (getConfig().getString("slime").equalsIgnoreCase("true")){
		getServer().addRecipe(slimeegg);
		}
		if (getConfig().getString("spider").equalsIgnoreCase("true")){
		getServer().addRecipe(spideregg);
		}
		if (getConfig().getString("ocelot").equalsIgnoreCase("true")){
		getServer().addRecipe(categg);
		}
		if (getConfig().getString("horse").equalsIgnoreCase("true")){
		getServer().addRecipe(horseegg);
		}
		if (getConfig().getString("villager").equalsIgnoreCase("true")){
		getServer().addRecipe(villegg);
		}
		if (getConfig().getString("snowgolem").equalsIgnoreCase("true")){
		getServer().addRecipe(snowegg);
		}
		if (getConfig().getString("irongolem").equalsIgnoreCase("true")){
		getServer().addRecipe(ironegg);
		}
		if (getConfig().getString("giant").equalsIgnoreCase("true")){
			getServer().addRecipe(giantegg);
		}
		if (getConfig().getString("wither").equalsIgnoreCase("true")){
			getServer().addRecipe(witheregg);
		}
		if (getConfig().getString("enderdragon").equalsIgnoreCase("true")){
			getServer().addRecipe(enderdragonegg);
		}
		getServer().getPluginManager().registerEvents(new IronGolemSpawn(), this);
		getServer().getPluginManager().registerEvents(new SnowGolemSpawn(), this);
		getServer().getPluginManager().registerEvents(new GiantSpawn(), this);
		getServer().getPluginManager().registerEvents(new WitherSpawn(), this);
		getServer().getPluginManager().registerEvents(new DragonSpawn(), this);
	}

}
