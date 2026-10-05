package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public k(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.I;
        this.a.getClass();
        return false;
    }
}
