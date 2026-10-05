package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import l7.e0;
import l7.j1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.F = materialCalendar;
        this.E = i2;
    }

    public final void F0(RecyclerView recyclerView, int i) {
        r rVar = new r(recyclerView.getContext());
        ((e0) rVar).a = i;
        G0(rVar);
    }

    public final void I0(j1 j1Var, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.A0.getWidth();
            iArr[1] = materialCalendar.A0.getWidth();
        } else {
            iArr[0] = materialCalendar.A0.getHeight();
            iArr[1] = materialCalendar.A0.getHeight();
        }
    }


}
