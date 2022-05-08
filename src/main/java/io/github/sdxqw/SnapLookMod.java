package io.github.sdxqw;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = SLMReference.name,modid = SLMReference.modid, version = SLMReference.version)
public class SnapLookMod {

    @Mod.EventHandler
    public void preInitialization(FMLPreInitializationEvent event) {
        SLMKeys.instance.initKeyBinding();
        MinecraftForge.EVENT_BUS.register(new SLMEvents());
    }
}
