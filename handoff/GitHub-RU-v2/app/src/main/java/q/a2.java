package q;

import android.transition.Transition;
import android.widget.PopupWindow;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a2 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
