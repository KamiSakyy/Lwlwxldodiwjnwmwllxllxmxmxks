package w2;

import android.view.accessibility.AccessibilityManager;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class v0 {
    public static int a(AccessibilityManager accessibilityManager, int i, int i10) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i10);
    }
}
