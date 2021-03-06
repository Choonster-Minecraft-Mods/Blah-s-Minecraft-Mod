package blahmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import blahmod.blocks.ModBlocks;
import blahmod.items.ModItems;

public class CreativeTabBlahBlocks extends CreativeTabs
{
	public CreativeTabBlahBlocks()
	{
		super(Main.MODID + "Blocks");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(ModBlocks.blazeBrick);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void displayAllReleventItems(List<ItemStack> items)
	{
		items.add(new ItemStack(ModBlocks.coalOre).copy());
		items.add(new ItemStack(ModBlocks.ironOre).copy());
		items.add(new ItemStack(ModBlocks.goldOre).copy());
		items.add(new ItemStack(ModBlocks.clayOre).copy());
		items.add(new ItemStack(ModBlocks.limestoneOre).copy());
		items.add(new ItemStack(ModBlocks.sulphurOre).copy());
		items.add(new ItemStack(ModBlocks.tadaniteOre).copy());
		items.add(new ItemStack(ModBlocks.uraniumOre).copy());
		items.add(new ItemStack(ModBlocks.rubyOre).copy());
		items.add(new ItemStack(ModBlocks.citrineOre).copy());
		items.add(new ItemStack(ModBlocks.topazOre).copy());
		items.add(new ItemStack(ModBlocks.sapphireOre).copy());
		items.add(new ItemStack(ModBlocks.amethystOre).copy());
		items.add(new ItemStack(ModBlocks.lumiteOre).copy());
		items.add(new ItemStack(ModBlocks.limestoneBlock).copy());
		items.add(new ItemStack(ModBlocks.sulphurBlock).copy());
		items.add(new ItemStack(ModBlocks.tadanite).copy());
		items.add(new ItemStack(ModBlocks.uraniumBlock).copy());
		items.add(new ItemStack(ModBlocks.gemBlocks[0]).copy());
		items.add(new ItemStack(ModBlocks.gemBlocks[1]).copy());
		items.add(new ItemStack(ModBlocks.gemBlocks[2]).copy());
		items.add(new ItemStack(ModBlocks.gemBlocks[3]).copy());
		items.add(new ItemStack(ModBlocks.gemBlocks[4]).copy());
		items.add(new ItemStack(ModBlocks.lumiteBlock).copy());
		items.add(new ItemStack(ModBlocks.magnetite).copy());
		items.add(new ItemStack(ModBlocks.polishedMagnetite).copy());
		items.add(new ItemStack(ModBlocks.igneousRock).copy());
		items.add(new ItemStack(ModBlocks.polishedIgneousRock).copy());
		items.add(new ItemStack(ModBlocks.saltrock).copy());
		items.add(new ItemStack(ModBlocks.polishedSaltrock).copy());
		items.add(new ItemStack(ModBlocks.hardenedLava).copy());
		items.add(new ItemStack(ModBlocks.blazeBrick).copy());
		items.add(new ItemStack(ModBlocks.cement).copy());
		items.add(new ItemStack(ModBlocks.endStoneBricks).copy());
		items.add(new ItemStack(ModBlocks.leatherBlock).copy());
		items.add(new ItemStack(ModBlocks.petrifiedWood).copy());
		items.add(new ItemStack(ModBlocks.redNetherBrick).copy());
		items.add(new ItemStack(ModBlocks.netherWartBlock).copy());
		items.add(new ItemStack(ModBlocks.boneBlock).copy());
		items.add(new ItemStack(ModBlocks.reinforcedGlass).copy());
		items.add(new ItemStack(ModBlocks.imperviousBrick).copy());
		items.add(new ItemStack(ModBlocks.netherIce).copy());
		items.add(new ItemStack(ModBlocks.netherIceBrick).copy());
		items.add(new ItemStack(ModBlocks.potatoBlock).copy());
		items.add(new ItemStack(ModBlocks.carrotBlock).copy());
		items.add(new ItemStack(ModBlocks.obsidianBrick).copy());
		items.add(new ItemStack(ModBlocks.sequoiaLog).copy());
		items.add(new ItemStack(ModBlocks.sequoiaPlanks).copy());
		items.add(new ItemStack(ModBlocks.sequoiaLeaves).copy());
		items.add(new ItemStack(ModBlocks.newWool[0]).copy());
		items.add(new ItemStack(ModBlocks.newWool[3]).copy());
		items.add(new ItemStack(ModBlocks.newWool[8]).copy());
		items.add(new ItemStack(ModBlocks.newWool[7]).copy());
		items.add(new ItemStack(ModBlocks.newWool[5]).copy());
		items.add(new ItemStack(ModBlocks.newWool[1]).copy());
		items.add(new ItemStack(ModBlocks.newWool[4]).copy());
		items.add(new ItemStack(ModBlocks.newWool[9]).copy());
		items.add(new ItemStack(ModBlocks.newWool[2]).copy());
		items.add(new ItemStack(ModBlocks.newWool[6]).copy());
		items.add(new ItemStack(ModBlocks.catalyzer).copy());
		items.add(new ItemStack(ModBlocks.tadaniteSmeltery).copy());
		items.add(new ItemStack(ModBlocks.sequoiaSapling).copy());
		items.add(new ItemStack(ModBlocks.prefabSapling).copy());
		items.add(new ItemStack(ModBlocks.palmSapling).copy());
		items.add(new ItemStack(ModBlocks.blackSand).copy());
		items.add(new ItemStack(ModBlocks.blackSandstone).copy());
		items.add(new ItemStack(ModBlocks.palmLog).copy());
		items.add(new ItemStack(ModBlocks.palmLeaves).copy());
		items.add(new ItemStack(ModBlocks.groundCoconut).copy());
		items.add(new ItemStack(ModBlocks.tropicStone).copy());
		items.add(new ItemStack(ModBlocks.tropicCobblestone).copy());
		items.add(new ItemStack(ModBlocks.tropicMud).copy());
		items.add(new ItemStack(ModBlocks.seashell).copy());
		items.add(new ItemStack(ModBlocks.largeSeashell).copy());
		super.displayAllReleventItems(items);
	}
}