package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: /home/user/work/p/classes4.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int I = 0;
    public final Chip H;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.google.android.material.chip.Chip] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.view.View, com.google.android.material.chip.Chip] */
    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j jVar = new j(this);
        LayoutInflater.from(context).inflate(2131559306, (ViewGroup) this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131363002);
        materialButtonToggleGroup.B.add(new i());
        com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) ((Chip) findViewById(2131363007));
        com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) ((Chip) findViewById(2131363004));
        this.H = r0;
        l lVar = new l(new GestureDetector(getContext(), new k(this)));
        r5.setOnTouchListener(lVar);
        r0.setOnTouchListener(lVar);
        r5.setTag(2131363310, 12);
        r0.setTag(2131363310, 10);
        r5.setOnClickListener(jVar);
        r0.setOnClickListener(jVar);
        r5.setAccessibilityClassName("android.view.View");
        r0.setAccessibilityClassName("android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onVisibilityChanged(View view, int i) {
        super/*android.view.View*/.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.H.sendAccessibilityEvent(8);
        }
    }

    public static Object findViewById(Object... a) {
        return null;
    }

    public static Object getContext(Object... a) {
        return null;
    }
}
