package dark.farmtech.machines;

import java.util.Set;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.Configuration;
import dark.core.IExtraObjectInfo;
import dark.core.helpers.Pair;
import dark.farmtech.FarmTech;
import dark.prefab.BlockMachine;

/** Prefab class for all farm blocks to remove the need for some configuration of the super class
 *
 * @author Darkguardsman */
public abstract class BlockFT extends BlockMachine implements IExtraObjectInfo
{
    private boolean hasConfigFile = false;

    public BlockFT(String name, int blockID, Material material)
    {
        super(name, FarmTech.CONFIGURATION, blockID, material);
        this.setCreativeTab(FarmTech.TabFarmTech);
    }

    @Override
    public void getTileEntities(int blockID, Set<Pair<String, Class<? extends TileEntity>>> list)
    {

    }

    @Override
    public boolean hasExtraConfigs()
    {
        return hasConfigFile;
    }

    @Override
    public void loadExtraConfigs(Configuration config)
    {

    }

    @Override
    public void loadRecipes()
    {

    }

    @Override
    public void loadOreNames()
    {

    }

}
