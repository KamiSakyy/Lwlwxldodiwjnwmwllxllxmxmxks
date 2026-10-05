package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView r;
    public final /* synthetic */ q s;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.s = qVar;
        this.r = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.r;
        n a = materialCalendarGridView.a();
        if (i < a.a() || i > a.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((MaterialCalendar) this.s.e.s).v0.t.r) {
            throw null;
        }
    }
}
