package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements n, j {
    public String r;
    public final HashMap s = new HashMap();

    public h(String str) {
        this.r = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.s.keySet().iterator());
    }

    public abstract n c(w51.r rVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(String str) {
        HashMap hashMap = this.s;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.r;
        if (str != null) {
            return str.equals(hVar.r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void f(String str, n nVar) {
        HashMap hashMap = this.s;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.r) : j.j(this, new q(str), rVar, arrayList);
    }

    public final int hashCode() {
        String str = this.r;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        return this.s.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n l() {
        return this;
    }
}
