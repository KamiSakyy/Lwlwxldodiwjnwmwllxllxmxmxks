package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.internal.x3;
import java.util.Calendar;
import l7.m0;
import l7.n1;
import l7.x0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends m0 {
    public b d;
    public x3 e;
    public int f;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, x3 x3Var) {
        m mVar = bVar.r;
        m mVar2 = bVar.s;
        m mVar3 = bVar.u;
        if (mVar.r.compareTo(mVar3.r) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVar3.r.compareTo(mVar2.r) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (contextThemeWrapper.getResources().getDimensionPixelSize(2131166111) * n.u) + (MaterialDatePicker.C4(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131166111) : 0);
        this.d = bVar;
        this.e = x3Var;
        D(true);
    }

    public final int k() {
        return this.d.x;
    }

    public final long l(int i) {
        Calendar a = t.a(this.d.r.r);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = t.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    public final void v(n1 n1Var, int i) {
        p pVar = (p) n1Var;
        b bVar = this.d;
        Calendar a = t.a(bVar.r.r);
        a.add(2, i);
        m mVar = new m(a);
        pVar.u.setText(mVar.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.v.findViewById(2131363039);
        if (materialCalendarGridView.a() == null || !mVar.equals(materialCalendarGridView.a().r)) {
            new n(mVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131559321, viewGroup, false);
        if (!MaterialDatePicker.C4(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new p(linearLayout, false);
        }
        linearLayout.setLayoutParams(new x0(-1, this.f));
        return new p(linearLayout, true);
    }
    public Object D(boolean p1) { return null; }
}
