package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ q s;
    public final /* synthetic */ MaterialCalendar t;

    public /* synthetic */ f(MaterialCalendar materialCalendar, q qVar, int i) {
        this.r = i;
        this.t = materialCalendar;
        this.s = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.r) {
            case 0:
                MaterialCalendar materialCalendar = this.t;
                int T0 = materialCalendar.A0.getLayoutManager().T0() - 1;
                Calendar a = t.a(this.s.d.r.r);
                a.add(2, T0);
                materialCalendar.s4(new m(a));
                break;
            default:
                MaterialCalendar materialCalendar2 = this.t;
                int S0 = materialCalendar2.A0.getLayoutManager().S0() + 1;
                Calendar a2 = t.a(this.s.d.r.r);
                a2.add(2, S0);
                materialCalendar2.s4(new m(a2));
                break;
        }
    }
}
