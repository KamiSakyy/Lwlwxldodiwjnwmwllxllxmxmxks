package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 extends h {
    public final /* synthetic */ int t = 0;
    public final Object u;

    public j4(a5.s sVar) {
        super("internal.eventLogger");
        this.u = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n c(w51.r rVar, List list) {
        TreeMap treeMap;
        switch (this.t) {
            case 0:
                i21.a.U(3, this.r, list);
                String k = ((t) rVar.t).c(rVar, (n) list.get(0)).k();
                n nVar = (n) list.get(1);
                t tVar = (t) rVar.t;
                long c0 = (long) i21.a.c0(tVar.c(rVar, nVar).d().doubleValue());
                n c = tVar.c(rVar, (n) list.get(2));
                HashMap e0 = c instanceof k ? i21.a.e0((k) c) : new HashMap();
                a5.s sVar = (a5.s) this.u;
                sVar.getClass();
                HashMap hashMap = new HashMap();
                for (String str : e0.keySet()) {
                    HashMap hashMap2 = ((b) sVar.t).c;
                    hashMap.put(str, b.b(str, hashMap2.containsKey(str) ? hashMap2.get(str) : null, e0.get(str)));
                }
                ((ArrayList) sVar.s).add(new b(k, c0, hashMap));
                return n.b;
            case 1:
                i21.a.U(2, "getValue", list);
                n c2 = ((t) rVar.t).c(rVar, (n) list.get(0));
                n c3 = ((t) rVar.t).c(rVar, (n) list.get(1));
                String k2 = c2.k();
                b1.m mVar = (b1.m) this.u;
                Map map = (Map) ((com.google.android.gms.measurement.internal.i1) mVar.t).v.get((String) mVar.s);
                String str2 = (map == null || !map.containsKey(k2)) ? null : (String) map.get(k2);
                return str2 != null ? new q(str2) : c3;
            case 2:
                return n.b;
            case 3:
                try {
                    return k21.f.O(((com.google.android.gms.measurement.internal.g1) this.u).call());
                } catch (Exception unused) {
                    return n.b;
                }
            default:
                i21.a.U(3, this.r, list);
                ((t) rVar.t).c(rVar, (n) list.get(0)).k();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) rVar.t;
                n c4 = tVar2.c(rVar, nVar2);
                if (!(c4 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n c5 = tVar2.c(rVar, (n) list.get(2));
                if (!(c5 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) c5;
                HashMap hashMap3 = kVar.r;
                if (!hashMap3.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String k3 = kVar.e("type").k();
                int b0 = hashMap3.containsKey("priority") ? i21.a.b0(kVar.e("priority").d().doubleValue()) : 1000;
                t tVar3 = (t) this.u;
                m mVar2 = (m) c4;
                tVar3.getClass();
                if ("create".equals(k3)) {
                    treeMap = (TreeMap) tVar3.b;
                } else {
                    if (!"edit".equals(k3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(k3)));
                    }
                    treeMap = (TreeMap) tVar3.a;
                }
                if (treeMap.containsKey(Integer.valueOf(b0))) {
                    b0 = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(b0), mVar2);
                return n.b;
        }
    }

    public j4(t tVar) {
        super("internal.registerCallback");
        this.u = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(r5 r5Var, b1.m mVar) {
        super("getValue");
        this.u = mVar;
    }

    public j4(com.google.android.gms.measurement.internal.g1 g1Var) {
        super("internal.appMetadata");
        this.u = g1Var;
    }

    public j4(y51.c cVar) {
        super("internal.logger");
        this.u = cVar;
        this.s.put("log", new q9(this, false, true));
        this.s.put("silent", new r5("silent", 1));
        ((h) this.s.get("silent")).f("log", new q9(this, true, true));
        this.s.put("unmonitored", new r5("unmonitored", 2));
        ((h) this.s.get("unmonitored")).f("log", new q9(this, false, false));
    }
}
