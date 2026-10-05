package com.github.rudroid.uitoolkit.utils;

import android.content.Context;
import d2.o0;
import f1.ub;
import g3.h0;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public static final g3.g a(Context context, String str, Integer num, q0 q0Var, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        q0 q0Var2;
        k71.k.g(context, "context");
        if ((i & 8) != 0) {
            sVar2 = sVar;
            q0Var2 = (q0) sVar2.j(ub.a);
        } else {
            sVar2 = sVar;
            q0Var2 = q0Var;
        }
        long j = ih.d.b(sVar2).v;
        g3.d dVar = new g3.d();
        dVar.d(g3.h.a(str, new h0(q0Var2.b(), 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65534)));
        dVar.g(" ");
        String string = context.getResources().getString(2131954676, Integer.valueOf(num.intValue()));
        k71.k.f(string, "getString(...)");
        dVar.d(g3.h.a(string, new h0(j, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65534)));
        return dVar.k();
    }

}
