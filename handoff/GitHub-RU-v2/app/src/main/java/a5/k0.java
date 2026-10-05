package a5;

import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k0 {
    public static final void a(CursorAnchorInfo.Builder builder, g3.m0 m0Var, c2.c cVar) {
        if (cVar.g()) {
            return;
        }
        g3.p pVar = m0Var.f24661b;
        int i = pVar.f24679f - 1;
        if (i < 0) {
            i = 0;
        }
        int v4 = aa1.b.v(pVar.e(cVar.f4061b), 0, i);
        int v10 = aa1.b.v(pVar.e(cVar.f4063d), 0, i);
        if (v4 > v10) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(m0Var.f(v4), pVar.f(v4), m0Var.g(v4), pVar.b(v4));
            if (v4 == v10) {
                return;
            } else {
                v4++;
            }
        }
    }

    public static JobScheduler b(JobScheduler jobScheduler) {
        JobScheduler forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        k71.k.f(forNamespace, "forNamespace(...)");
        return forNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int g(ViewConfiguration viewConfiguration, int i, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i10, i11);
    }

    public static int h(ViewConfiguration viewConfiguration, int i, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i10, i11);
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean j(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void k(AccessibilityEvent accessibilityEvent, boolean z10) {
        accessibilityEvent.setAccessibilityDataSensitive(z10);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
    }

    public static void m(TextView textView, int i, float f6) {
        textView.setLineHeight(i, f6);
    }
}
