package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public la0.d a;
    public la0.d b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b4.e0(2130969465, context, MaterialCalendar.class.getCanonicalName()).data, x21.a.t);
        la0.d.a(context, obtainStyledAttributes.getResourceId(4, 0));
        la0.d.a(context, obtainStyledAttributes.getResourceId(2, 0));
        la0.d.a(context, obtainStyledAttributes.getResourceId(3, 0));
        la0.d.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList W = i4.W(context, obtainStyledAttributes, 7);
        this.a = la0.d.a(context, obtainStyledAttributes.getResourceId(9, 0));
        la0.d.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.b = la0.d.a(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(W.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
