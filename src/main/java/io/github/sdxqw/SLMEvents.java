package io.github.sdxqw;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class SLMEvents {

    public boolean backCam = false;;

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();

        if(SLMKeys.instance.backCam.isKeyDown()) {
            backCam = false;
            mc.gameSettings.thirdPersonView = 1;
        } else if (!backCam) {
            backCam = true;
            mc.gameSettings.thirdPersonView = 0;
        }
    }
}
