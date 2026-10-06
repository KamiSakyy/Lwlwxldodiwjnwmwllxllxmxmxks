package com.github.rudroid.settings.applock.usecases;

import com.google.android.gms.internal.measurement.z3;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final n5.f a;

    public d(n5.f fVar) {
        k71.k.g(fVar, "dataStore");
        this.a = fVar;
    }

    public final Object a(boolean z, a71.c cVar) {
        Object n = z3.n(this.a, new c(z, null), cVar);
        return n == b71.a.r ? n : a0.a;
    }
}
