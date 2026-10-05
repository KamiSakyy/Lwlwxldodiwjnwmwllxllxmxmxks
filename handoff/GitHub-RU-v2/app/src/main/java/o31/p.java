package o31;

import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p {
    public static Rect a(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }
}
