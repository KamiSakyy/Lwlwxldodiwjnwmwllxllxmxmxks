package w3;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f33289a = new m();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i10 = rect.top;
        int i11 = rect.bottom;
        return i - (i10 + (i11 > i ? i11 - i : 0));
    }
}
