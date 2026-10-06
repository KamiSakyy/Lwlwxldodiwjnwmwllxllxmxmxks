package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView r;

    public b(ClockFaceView clockFaceView) {
        this.r = clockFaceView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.google.android.material.timepicker.ClockFaceView, com.google.android.material.timepicker.h] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView r0 = this.r;
        if (!r0.isShown()) {
            return true;
        }
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((r0.getHeight() / 2) - r0.K.u) - r0.S;
        if (height != r0.I) {
            r0.I = height;
            r0.o();
            ClockHandView clockHandView = r0.K;
            clockHandView.C = r0.I;
            clockHandView.invalidate();
        }
        return true;
    }
}
