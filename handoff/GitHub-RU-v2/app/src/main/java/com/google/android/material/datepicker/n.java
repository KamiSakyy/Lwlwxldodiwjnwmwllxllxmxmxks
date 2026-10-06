package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends BaseAdapter {
    public static final int u = t.c(null).getMaximum(4);
    public static final int v = (t.c(null).getMaximum(7) + t.c(null).getMaximum(5)) - 1;
    public m r;
    public c s;
    public b t;

    public n(m mVar, b bVar) {
        this.r = mVar;
        this.t = bVar;
        throw null;
    }

    public final int a() {
        int i = this.t.v;
        m mVar = this.r;
        Calendar calendar = mVar.r;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + mVar.u : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int a = (i - a()) + 1;
        Calendar a2 = t.a(this.r.r);
        a2.set(5, a);
        return Long.valueOf(a2.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.r.v) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return v;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.r.u;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.s == null) {
            this.s = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131559316, viewGroup, false);
        }
        int a = i - a();
        if (a >= 0) {
            m mVar = this.r;
            if (a < mVar.v) {
                textView.setTag(mVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                t.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            t.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
