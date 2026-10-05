package q;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class u1 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z10) {
        popupWindow.setIsClippedToScreen(z10);
    }
}
