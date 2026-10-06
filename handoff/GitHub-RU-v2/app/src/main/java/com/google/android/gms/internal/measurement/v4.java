package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v4 extends k {
    public a5.s s;

    public v4(a5.s sVar) {
        this.s = sVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.n
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        int hashCode = str.hashCode();
        a5.s sVar = this.s;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    i21.a.U(0, "getEventName", arrayList);
                    return new q(((b) sVar.u).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    i21.a.U(0, "getTimestamp", arrayList);
                    return new g(Double.valueOf(((b) sVar.u).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    i21.a.U(1, "getParamValue", arrayList);
                    String k = ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k();
                    HashMap hashMap = ((b) sVar.u).c;
                    return k21.f.O(hashMap.containsKey(k) ? hashMap.get(k) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    i21.a.U(0, "getParams", arrayList);
                    HashMap hashMap2 = ((b) sVar.u).c;
                    k kVar = new k();
                    for (String str2 : hashMap2.keySet()) {
                        kVar.f(str2, k21.f.O(hashMap2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    i21.a.U(2, "setParamValue", arrayList);
                    String k2 = ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k();
                    n c = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                    b bVar = (b) sVar.u;
                    Object d0 = i21.a.d0(c);
                    HashMap hashMap3 = bVar.c;
                    if (d0 == null) {
                        hashMap3.remove(k2);
                        return c;
                    }
                    hashMap3.put(k2, b.b(k2, hashMap3.get(k2), d0));
                    return c;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    i21.a.U(1, "setEventName", arrayList);
                    n c2 = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                    if (n.b.equals(c2) || n.c.equals(c2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) sVar.u).a = c2.k();
                    return new q(c2.k());
                }
                break;
        }
        return super.g(str, rVar, arrayList);
    }
}
