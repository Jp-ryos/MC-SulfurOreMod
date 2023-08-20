package jpryosblock;

import jpryosblock.item.BlockInit;
import jpryosblock.item.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JpryosBlock.MODID)
public class JpryosBlock {

  // Define mod id in a common place for everything to reference
  public static final String MODID = "jpryosblock";

  public JpryosBlock() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    ItemInit.register(modEventBus);
    BlockInit.register(modEventBus);
  }
}
