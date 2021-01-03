package org.example.github.action;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class RedirectToGithubAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        BrowserUtil.browse("https://github.com/sirejik");
    }
}
