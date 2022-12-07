import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class TestAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Messages.showMessageDialog("PERED COMMMITOM","Action",Messages.getInformationIcon());
    }

    @Override
    public boolean isDumbAware() {
        return super.isDumbAware();
    }
}
