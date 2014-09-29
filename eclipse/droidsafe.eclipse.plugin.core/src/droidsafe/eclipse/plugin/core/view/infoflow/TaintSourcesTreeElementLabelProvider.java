package droidsafe.eclipse.plugin.core.view.infoflow;

import java.util.Set;

import org.eclipse.swt.graphics.Image;

import droidsafe.eclipse.plugin.core.specmodel.TreeElement;
import droidsafe.eclipse.plugin.core.util.DroidsafePluginUtilities;
import droidsafe.eclipse.plugin.core.view.DroidsafeImages;
import droidsafe.eclipse.plugin.core.view.DroidsafeInfoTreeElementLabelProvider;
import droidsafe.speclang.model.CallLocationModel;
import droidsafe.speclang.model.MethodArgumentModel;
import droidsafe.speclang.model.MethodModel;

public class TaintSourcesTreeElementLabelProvider extends DroidsafeInfoTreeElementLabelProvider {
    /**
     * Returns the label for the tree node to display in the tree outline view.
     * 
     * @param element The element to display in the tree node.
     * @return The text for the node label.
     */
    @Override
    public String getText(Object element) {
        if (element instanceof TreeElement<?, ?>) {
            TreeElement<?, ?> treeElement = (TreeElement<?, ?>) element;
            Object data = treeElement.getData();
            if (data instanceof CallLocationModel) {
                CallLocationModel loc = (CallLocationModel) data;
                return "<call> " + DroidsafePluginUtilities.removeCloneSuffix(loc.toString());
            }
        }
        return super.getText(element);
    }

    public String getToolTipText(Object obj) {
        if (obj instanceof TreeElement<?, ?>) {
          TreeElement<?, ?> element = (TreeElement<?, ?>) obj;
          Object data = element.getData();
          if (data instanceof CallLocationModel) {
              CallLocationModel loc = (CallLocationModel) data;
              Set<String> infoKinds = loc.getInfoKinds();
              if (infoKinds != null)
                  return infoKinds.toString();
           }
        }
        return null;
      }

    /**
     * Returns the icon image for the tree node.
     * 
     * @param element The tree node element to display.
     * @return The icon image to display together with the label in the outline view.
     */
    public Image getImage(Object element) {
        if (element instanceof TreeElement<?, ?>) {
            TreeElement<?, ?> treeElement = (TreeElement<?, ?>) element;
            Object data = treeElement.getData();
            if (data instanceof CallLocationModel) {
                return DroidsafeImages.SOURCE_IMAGE;
            }
        }
        return null;
    }

    
}
