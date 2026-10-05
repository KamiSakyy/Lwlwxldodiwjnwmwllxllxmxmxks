package com.google.android.gms.measurement.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 extends l7.z1 {
    public final /* synthetic */ int h = 2;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i1 i1Var) {
        super(20);
        this.i = i1Var;
    }

    public Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.h) {
            case 0:
                String str = (String) obj;
                c21.u.d(str);
                i1 i1Var = (i1) this.i;
                i1Var.A();
                c21.u.d(str);
                o oVar = i1Var.t.t;
                o4.U(oVar);
                a5.s F0 = oVar.F0(str);
                if (F0 == null) {
                    return null;
                }
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) i1Var).s).w;
                o1.m(s0Var);
                s0Var.F.b(str, "Populate EES config from database on cache miss. appId");
                i1Var.H(str, i1Var.I(str, (byte[]) F0.t));
                f1 f1Var = i1Var.B;
                synchronized (((m90.c) ((l7.z1) f1Var).g)) {
                    Set entrySet = ((aa.u) ((l7.z1) f1Var).f).a.entrySet();
                    k71.k.f(entrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(entrySet.size());
                    Set<Map.Entry> entrySet2 = ((aa.u) ((l7.z1) f1Var).f).a.entrySet();
                    k71.k.f(entrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : entrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (com.google.android.gms.internal.measurement.e0) linkedHashMap.get(str);
            case 1:
                String str2 = (String) obj;
                k71.k.g(str2, "key");
                return ((o7.g) this.i).r.F0(str2);
            default:
                return super.c(obj);
        }
    }

    public void d(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.h) {
            case 1:
                String str = (String) obj;
                v7.c cVar = (v7.c) obj2;
                k71.k.g(str, "key");
                k71.k.g(cVar, "oldValue");
                cVar.close();
                super.d(z, str, cVar, (v7.c) obj3);
                break;
            case 2:
                p9.d dVar = (p9.d) obj2;
                ((b21.v) ((l7.x1) this.i).r).v((p9.a) obj, dVar.a, dVar.b, dVar.c);
                break;
            default:
                super.d(z, obj, obj2, obj3);
                break;
        }
    }

    public int o(Object obj, Object obj2) {
        switch (this.h) {
            case 2:
                return ((p9.d) obj2).c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i, l7.x1 x1Var) {
        super(i);
        this.i = x1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(o7.g gVar) {
        super(25);
        this.i = gVar;
    }







}
