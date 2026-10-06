package b5;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public y51.c f3487a;

    public g(y51.c cVar) {
        this.f3487a = cVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f3487a.h(i, new f(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        f i10 = this.f3487a.i(i);
        if (i10 == null) {
            return null;
        }
        return i10.f3484a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f3487a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        f k10 = this.f3487a.k(i);
        if (k10 == null) {
            return null;
        }
        return k10.f3484a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i10, Bundle bundle) {
        return this.f3487a.n(i, i10, bundle);
    }
}
