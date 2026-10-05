package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public interface j {
    static n j(j jVar, q qVar, w51.r rVar, ArrayList arrayList) {
        String str = qVar.r;
        if (jVar.i(str)) {
            n e = jVar.e(str);
            if (e instanceof h) {
                return ((h) e).c(rVar, arrayList);
            }
            throw new IllegalArgumentException(x.i.f(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(f1.e.g("Object has no function ", str));
        }
        i21.a.U(1, "hasOwnProperty", arrayList);
        return jVar.i(((t) rVar.t).c(rVar, (n) arrayList.get(0)).k()) ? n.g : n.h;
    }

    n e(String str);

    void f(String str, n nVar);

    boolean i(String str);
}
