package com.example;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

import org.lwjgl.glfw.GLFW;

public class ExampleClient implements ClientModInitializer {

    public static KeyBinding OPEN_MENU;

    @Override
    public void onInitializeClient() {

        OPEN_MENU = KeyBindingHelper.registerKeyBinding(
                new KeyBinding(
                        "key.modid.openmenu",
                        InputUtil.Type.KEYSYM,
                        GLFW.GLFW_KEY_GRAVE_ACCENT,
                        "category.modid"
                )
        );

        ClientEvents.register();
        BlockESPRenderer.register();
    }
}
