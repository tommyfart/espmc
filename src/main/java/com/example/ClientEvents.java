package com.example;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class ClientEvents {

    public static void register() {

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            while (ExampleClient.OPEN_MENU.wasPressed()) {

                MinecraftClient.getInstance().setScreen(
                        new BlockMenuScreen()
                );

            }

        });

    }

}
