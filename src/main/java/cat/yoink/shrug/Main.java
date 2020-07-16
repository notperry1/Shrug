package cat.yoink.shrug;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * @author Katatje
 * @since 16th July 2020
 */
@Mod(modid = Main.MOD_ID, name = Main.MOD_NAME, version = Main.VERSION)
public class Main
{

    public static final String MOD_ID = "shrug";
    public static final String MOD_NAME = "shrug";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void initialize(FMLInitializationEvent event)
    {
        ClientCommandHandler.instance.registerCommand(new Shrug());
    }

}
