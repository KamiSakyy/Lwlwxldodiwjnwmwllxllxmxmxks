package e7;

import android.view.Window;
import android.view.WindowInsets;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
