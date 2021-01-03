package org.example.github.form;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ConfigureSettings {
    private JTextField githubProfile;
    private JPanel settingsPanel;

    @NotNull
    public JComponent getComponent() {
        return settingsPanel;
    }
}
