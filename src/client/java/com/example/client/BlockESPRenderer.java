package com.example.client;

import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;

public class BlockESPRenderer {

    public static void register() {

        WorldRenderEvents.AFTER_TRANSLUCENT.register(context -> {

            if (SelectedBlocks.BLOCKS.isEmpty())
                return;

            /*
             render boxes
             render tracers
             render distance labels
            */

        });

    }

}
