package com.github.rudroid.utilities;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b3 {
    public static void a(View view, j71.a aVar) {
        c81.e eVar = v71.l0.a;
        w71.d dVar = a81.n.a;
        k71.k.g(view, "<this>");
        k71.k.g(dVar, "dispatcher");
        androidx.lifecycle.c0 f = androidx.lifecycle.d1.f(view);
        if (f != null) {
            v71.b0.z(androidx.lifecycle.d1.h(f.m3()), dVar, (v71.a0Shadow) null, new a3(aVar, null), 2);
        }
    }

    public static final void b(View view, int i) {
        k71.k.g(view, "<this>");
        view.setBackground(view.getContext().getDrawable(i));
    }

    public static final void c(View view, int i) {
        k71.k.g(view, "<this>");
        view.setBackgroundColor(view.getContext().getColor(i));
    }

    public static final void d(View view, int i, int i2, int i3, int i4) {
        k71.k.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k71.k.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }
}
