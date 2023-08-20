package jpryosblock.item;

import jpryosblock.JpryosBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, JpryosBlock.MODID);

  public static final RegistryObject<BlockItem> sulfur_item =
      ITEMS.register("sulfur", () -> new BlockItem(BlockInit.sulfur.get(), new Item.Properties()));

  public static final RegistryObject<Item> sulfur_powder =
      ITEMS.register("sulfur_powder", () -> new Item(new Item.Properties().stacksTo(64)));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
