package a5;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class r0 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return f1.f396b ? f1.a(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
