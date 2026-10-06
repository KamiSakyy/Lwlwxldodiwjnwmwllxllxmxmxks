package com.github.rudroid.client;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
final class h implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public vz0.e f8809r;

    public h(String str, vz0.c cVar) {
        k.g(cVar, "loopAction");
        this.f8809r = new vz0.e(str, TimeUnit.SECONDS.toMillis(20L), cVar);
    }

    public final Object k(Object obj) {
        Set set = (Set) obj;
        k.g(set, "changedRecordKeys");
        this.f8809r.a(set);
        return a0.a;
    }
}
