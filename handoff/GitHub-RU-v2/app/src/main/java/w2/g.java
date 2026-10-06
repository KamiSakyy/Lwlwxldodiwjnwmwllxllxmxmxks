package w2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public AccessibilityManager f33012a;

    public g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        k71.k.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f33012a = (AccessibilityManager) systemService;
    }
}
