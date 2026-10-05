package com.github.rudroid.uitoolkit.extensions;

import g3.m0;
import g3.p;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import r3.j;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static List a(m0 m0Var, int i, int i2) {
        k.g(m0Var, "<this>");
        p pVar = m0Var.b;
        if (i == i2) {
            return r.r;
        }
        int d = pVar.d(i);
        int d2 = pVar.d(i2);
        boolean z = pVar.h(t71.p.N(m0Var.a.a)) == j.r;
        ArrayList arrayList = new ArrayList((d2 - d) + 1);
        if (d <= d2) {
            int i3 = d;
            while (true) {
                arrayList.add(new c2.c(i3 == d ? m0Var.e(i, z) : m0Var.f(i3), pVar.f(i3), i3 == d2 ? m0Var.e(i2, z) : m0Var.g(i3), pVar.b(i3)));
                if (i3 == d2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

}
