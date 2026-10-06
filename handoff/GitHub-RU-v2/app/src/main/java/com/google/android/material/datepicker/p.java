package com.google.android.material.datepicker;

import a5.c1;
import a5.o0;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import l7.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p extends n1 {
    public TextView u;
    public MaterialCalendarGridView v;

    public p(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131363044);
        this.u = textView;
        WeakHashMap weakHashMap = c1.a;
        new o0(2131363389, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(2131363039);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
