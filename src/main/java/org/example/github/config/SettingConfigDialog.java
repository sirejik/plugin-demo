package org.example.github.config;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import org.example.github.form.ConfigureSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SettingConfigDialog implements Configurable {
    @Nullable
    private ConfigureSettings form = null;

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return null;
    }

    @Override
    public @Nullable JComponent createComponent() {
        return getForm().getComponent();
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    @NotNull
    public ConfigureSettings getForm() {
        if (form == null) {
            form = new ConfigureSettings();
        }

        return form;
    }
}
