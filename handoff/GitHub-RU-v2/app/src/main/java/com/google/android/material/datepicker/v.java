package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import l7.m0;
import l7.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v extends m0 {
    public final MaterialCalendar d;

    public v(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    public final int k() {
        return this.d.v0.w;
    }

    public final void v(n1 n1Var, int i) {
        MaterialCalendar materialCalendar = this.d;
        int i2 = materialCalendar.v0.r.t + i;
        TextView textView = ((u) n1Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(t.b().get(1) == i2 ? String.format(context.getString(2131953281), Integer.valueOf(i2)) : String.format(context.getString(2131953282), Integer.valueOf(i2)));
        c cVar = materialCalendar.y0;
        if (t.b().get(1) == i2) {
            la0.d dVar = cVar.b;
        } else {
            la0.d dVar2 = cVar.a;
        }
        throw null;
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        return new u((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131559325, viewGroup, false));
    }
}
