package forgingaura.forgeyourworld.category;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class FYWSlab extends BlockSlab{

    public FYWSlab(String name, Material materialIn) {
        super(materialIn);

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setHardness(3f);
        this.setResistance(8f);

        IBlockState state = this.blockState.getBaseState();
        if(!this.isDouble()){
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        setDefaultState(state);
        this.useNeighborBrightness = true;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return EnumBlockHalf.BOTTOM;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {

        if(!this.isDouble()){
            return  this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        }

        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        if(this.isDouble()){
            return 0;
        }

        return (state.getValue(HALF)).ordinal() + 1;

    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{HALF});
    }
}

