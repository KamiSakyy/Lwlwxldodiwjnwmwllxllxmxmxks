package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r9 extends h {
    public final t5 t;
    public final HashMap u;

    public r9(t5 t5Var) {
        super("require");
        this.u = new HashMap();
        this.t = t5Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n c(w51.r rVar, List list) {
        n nVar;
        i21.a.U(1, "require", list);
        String k = ((t) rVar.t).c(rVar, (n) list.get(0)).k();
        HashMap hashMap = this.u;
        if (hashMap.containsKey(k)) {
            return (n) hashMap.get(k);
        }
        HashMap hashMap2 = (HashMap) this.t.r;
        if (hashMap2.containsKey(k)) {
            try {
                nVar = (n) ((Callable) hashMap2.get(k)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(k)));
            }
        } else {
            nVar = n.b;
        }
        if (nVar instanceof h) {
            hashMap.put(k, (h) nVar);
        }
        return nVar;
    }
}
