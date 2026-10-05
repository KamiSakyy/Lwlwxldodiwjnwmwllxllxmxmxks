package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import l7.b1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends b1 {
    public final /* synthetic */ q a;
    public final /* synthetic */ MaterialCalendar b;

    public j(MaterialCalendar materialCalendar, q qVar) {
        this.b = materialCalendar;
        this.a = qVar;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        b bVar = this.a.d;
        MaterialCalendar materialCalendar = this.b;
        int S0 = i < 0 ? materialCalendar.A0.getLayoutManager().S0() : materialCalendar.A0.getLayoutManager().T0();
        Calendar a = t.a(bVar.r.r);
        a.add(2, S0);
        m mVar = new m(a);
        materialCalendar.w0 = mVar;
        q.o oVar = materialCalendar.F0;
        Calendar a2 = t.a(bVar.r.r);
        a2.add(2, S0);
        a2.set(5, 1);
        Calendar a3 = t.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        long timeInMillis = a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = t.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        oVar.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        materialCalendar.u4(bVar.r.o(mVar));
    }


}
