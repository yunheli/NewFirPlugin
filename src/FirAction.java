import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import fir.im.dialog.FirDialog;
import fir.im.utils.Provider;

/**
 * Created with IntelliJ IDEA.
 * User: will
 * Date: 15/11/2
 * Time: 上午10:56
 * To change this template use File | Settings | File Templates.
 */
public class FirAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {

        FirDialog.getInstance().setVisible(true);
        FirDialog.getInstance().setIdeEnvironmentEclipse(true);
        Provider.getInstance().setProviderIde("eclipse");

    }
}
