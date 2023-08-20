package jpryosblock.item;

import jpryosblock.JpryosBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, JpryosBlock.MODID);

  public static final RegistryObject<DropExperienceBlock> sulfur =
      BLOCKS.register(
          "sulfur",
          () ->
              new DropExperienceBlock(
                  BlockBehaviour.Properties.of()
                      .mapColor(MapColor.STONE)
                      .strength(1.0f)
                      .instrument(NoteBlockInstrument.BANJO)
                      .requiresCorrectToolForDrops()
                      .pushReaction(PushReaction.DESTROY),
                  UniformInt.of(5, 10)));

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
