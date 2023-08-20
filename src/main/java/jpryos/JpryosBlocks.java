package jpryos;

import jpryos.item.BlockInit;
import jpryos.item.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JpryosBlocks.MODID)
public class JpryosBlocks {

  // Define mod id in a common place for everything to reference
  public static final String MODID = "jpryosblock";

  public JpryosBlocks() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    ItemInit.register(modEventBus);
    BlockInit.register(modEventBus);
  }
}
