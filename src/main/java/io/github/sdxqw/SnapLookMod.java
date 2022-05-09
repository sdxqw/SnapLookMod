package io.github.sdxqw;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(name = SLMReference.name, modid = SLMReference.modid, version = SLMReference.version)
public class SnapLookMod {

    public static Logger LOGGER = LogManager.getLogger();

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event) {
        SLMKeys.instance.initKeyBinding();
        MinecraftForge.EVENT_BUS.register(new SLMEvents());
    }

    @Mod.EventHandler
    public void postInitialization(FMLPostInitializationEvent event) {
        DiscordIPC.INSTANCE.init();
    }

    public static void info(final Object msg, final Object... obj) {
        LOGGER.info("$[SLM] " + msg, obj);
    }

    public static void error(final Object msg, final Object... obj) {
        LOGGER.error("$[SLM] " + msg, obj);
    }
}

