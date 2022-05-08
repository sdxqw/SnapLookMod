package io.github.sdxqw;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class SLMKeys {
    public final KeyBinding backCam = new KeyBinding("Hold Over-sholuder View", Keyboard.KEY_F, "SLM" );
    public static SLMKeys instance = new SLMKeys();

    public void initKeyBinding() {
        ClientRegistry.registerKeyBinding( backCam );
    }
}
