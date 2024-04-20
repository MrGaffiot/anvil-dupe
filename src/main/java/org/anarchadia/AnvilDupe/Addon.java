package org.anarchadia.AnvilDupe;

import org.anarchadia.AnvilDupe.modules.AnvilDupe;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Anarchadia", Items.WATER_BUCKET.getDefaultStack());

    @Override
    public void onInitialize() {
        LOG.info("Initializing Auto Anvil Duper");

        // Modules
        Modules modules = Modules.get();
        modules.add(new AnvilDupe());
    }

    @Override
    public String getPackage() {
        return "org.anarchadia";
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }
}
