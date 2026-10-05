package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends a5.b {
    public final /* synthetic */ ClockFaceView u;

    public c(ClockFaceView clockFaceView) {
        this.u = clockFaceView;
    }

    public final void d(View view, b5.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.a;
        ((a5.b) this).r.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(2131363014)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.u.O.get(intValue - 1));
        }
        fVar.l(b5.e.b(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        fVar.b(b5.b.e);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.u;
        view.getHitRect(clockFaceView.L);
        float centerX = clockFaceView.L.centerX();
        float centerY = clockFaceView.L.centerY();
        clockFaceView.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
