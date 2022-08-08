package com.github.reviversmc.modget.minecraft;

import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticCommandManager;
import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticCommandManager116;
import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticMessage;
import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticMessage116;
import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticText;
import com.github.reviversmc.modget.minecraft.compat.VersionAgnosticText116;

import net.fabricmc.api.ModInitializer;

public class Modget116 implements ModInitializer {

    @Override
    public void onInitialize() {
        VersionAgnosticText.set(new VersionAgnosticText116());
        VersionAgnosticMessage.set(new VersionAgnosticMessage116());
        VersionAgnosticCommandManager.set(new VersionAgnosticCommandManager116());
    }

}
