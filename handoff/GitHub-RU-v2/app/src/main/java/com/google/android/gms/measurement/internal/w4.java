package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.r7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w4 {
    public String a;
    public boolean b;
    public com.google.android.gms.internal.measurement.m3 c;
    public BitSet d;
    public BitSet e;
    public x.e f;
    public x.e g;
    public final /* synthetic */ d h;

    public w4(d dVar, String str, com.google.android.gms.internal.measurement.m3 m3Var, BitSet bitSet, BitSet bitSet2, x.e eVar, x.e eVar2) {
        this.h = dVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = eVar;
        this.g = new x.e(0);
        Iterator it = eVar2.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = m3Var;
    }

    public final void a(c cVar) {
        int b = cVar.b();
        if (((Boolean) cVar.c) != null) {
            this.e.set(b, true);
        }
        Boolean bool = (Boolean) cVar.d;
        if (bool != null) {
            this.d.set(b, bool.booleanValue());
        }
        if (((Long) cVar.e) != null) {
            Integer valueOf = Integer.valueOf(b);
            x.e eVar = this.f;
            Long l = (Long) eVar.get(valueOf);
            long longValue = ((Long) cVar.e).longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (((Long) cVar.f) != null) {
            Integer valueOf2 = Integer.valueOf(b);
            x.e eVar2 = this.g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            if (cVar.c()) {
                list.clear();
            }
            r7.a();
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this.h).s;
            h hVar = o1Var.u;
            b0 b0Var = c0.F0;
            String str = this.a;
            if (hVar.J(str, b0Var) && cVar.d()) {
                list.clear();
            }
            r7.a();
            if (!o1Var.u.J(str, b0Var)) {
                list.add(Long.valueOf(((Long) cVar.f).longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(((Long) cVar.f).longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final com.google.android.gms.internal.measurement.t2 b(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.s2 w = com.google.android.gms.internal.measurement.t2.w();
        w.b();
        ((com.google.android.gms.internal.measurement.t2) w.s).x(i);
        w.b();
        ((com.google.android.gms.internal.measurement.t2) w.s).A(this.b);
        com.google.android.gms.internal.measurement.m3 m3Var = this.c;
        if (m3Var != null) {
            w.b();
            ((com.google.android.gms.internal.measurement.t2) w.s).z(m3Var);
        }
        com.google.android.gms.internal.measurement.l3 x = com.google.android.gms.internal.measurement.m3.x();
        ArrayList h0 = w0.h0(this.d);
        x.b();
        ((com.google.android.gms.internal.measurement.m3) x.s).B(h0);
        ArrayList h02 = w0.h0(this.e);
        x.b();
        ((com.google.android.gms.internal.measurement.m3) x.s).z(h02);
        x.e eVar = this.f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(((x.q0) eVar).t);
            Iterator it = eVar.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) eVar.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.y2 t = com.google.android.gms.internal.measurement.z2.t();
                    t.b();
                    ((com.google.android.gms.internal.measurement.z2) t.s).u(intValue);
                    long longValue = l.longValue();
                    t.b();
                    ((com.google.android.gms.internal.measurement.z2) t.s).v(longValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.z2) t.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            x.b();
            ((com.google.android.gms.internal.measurement.m3) x.s).D(arrayList);
        }
        x.e eVar2 = this.g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(((x.q0) eVar2).t);
            Iterator it2 = eVar2.keySet().iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.n3 u = com.google.android.gms.internal.measurement.o3.u();
                int intValue2 = num2.intValue();
                u.b();
                ((com.google.android.gms.internal.measurement.o3) u.s).v(intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u.b();
                    ((com.google.android.gms.internal.measurement.o3) u.s).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.o3) u.e());
            }
            list = arrayList3;
        }
        x.b();
        ((com.google.android.gms.internal.measurement.m3) x.s).F(list);
        w.b();
        ((com.google.android.gms.internal.measurement.t2) w.s).y((com.google.android.gms.internal.measurement.m3) x.e());
        return (com.google.android.gms.internal.measurement.t2) w.e();
    }

    public w4(d dVar, String str) {
        this.h = dVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new x.e(0);
        this.g = new x.e(0);
    }
}
