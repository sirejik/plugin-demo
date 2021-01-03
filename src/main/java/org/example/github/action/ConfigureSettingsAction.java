package org.example.github.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.options.ShowSettingsUtil;
import org.example.github.config.SettingConfigDialog;

public class ConfigureSettingsAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        ShowSettingsUtil.getInstance().showSettingsDialog(getEventProject(e), SettingConfigDialog.class);
    }
}
