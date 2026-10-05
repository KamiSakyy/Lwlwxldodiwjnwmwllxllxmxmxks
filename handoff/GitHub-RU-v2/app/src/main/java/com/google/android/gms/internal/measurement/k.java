package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public class k implements n, j {
    public final HashMap r = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new i(this.r.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(String str) {
        HashMap hashMap = this.r;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.r.equals(((k) obj).r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void f(String str, n nVar) {
        HashMap hashMap = this.r;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n g(String str, w51.r rVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : j.j(this, new q(str), rVar, arrayList);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean i(String str) {
        return this.r.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        k kVar = new k();
        for (Map.Entry entry : this.r.entrySet()) {
            boolean z = entry.getValue() instanceof j;
            HashMap hashMap = kVar.r;
            if (z) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).l());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.r;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i<T1,T2,T3,T4> {
        public i() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
