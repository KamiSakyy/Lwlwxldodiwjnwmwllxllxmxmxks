package com.github.rudroid.uitoolkit.markdown.components;

import a0.s0;
import androidx.compose.foundation.layout.b0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import g3.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sy.d0;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public static final void a(final w1.r rVar, final String str, final k91.a aVar, final Map map, androidx.compose.runtime.s sVar, final int i) {
        final Map map2;
        w1.r rVar2;
        b2 t;
        j71.e eVar;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        k71.k.g(str, "content");
        k71.k.g(aVar, "node");
        sVar.e0(-1752704856);
        int i2 = (i & 6) == 0 ? (sVar.f(rVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            map2 = map;
            i2 |= sVar.h(map2) ? 2048 : 1024;
        } else {
            map2 = map;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean f = ((i2 & 112) == 32) | sVar.f(aVar);
            Object N = sVar.N();
            if (f || N == androidx.compose.runtime.n.a) {
                Iterator it = aVar.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (k71.k.b(((k91.a) obj).a, n91.b.c)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                k91.a aVar2 = (k91.a) obj;
                ArrayList d = aVar2 != null ? d(aVar2) : null;
                ArrayList arrayList2 = x61.r.r;
                if (d == null) {
                    d = arrayList2;
                }
                int size = d.size();
                y61.b i3 = d0.i();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList3.add((k91.a) x61.m.X(i4, d));
                }
                i3.add(new u(arrayList3, true));
                List a = aVar.a();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : a) {
                    if (k71.k.b(((k91.a) obj3).a, n91.b.d)) {
                        arrayList4.add(obj3);
                    }
                }
                int size2 = arrayList4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    ArrayList d2 = d((k91.a) obj4);
                    ArrayList arrayList5 = new ArrayList(size);
                    int i6 = 0;
                    while (i6 < size) {
                        arrayList5.add((k91.a) x61.m.X(i6, d2));
                        i6++;
                        size2 = size2;
                    }
                    i3.add(new u(arrayList5, false));
                    size2 = size2;
                }
                y61.b h = d0.h(i3);
                Iterator it2 = aVar.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (k71.k.b(((k91.a) obj2).a, n91.c.b)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                k91.a aVar3 = (k91.a) obj2;
                if (aVar3 != null) {
                    List g0 = t71.p.g0(k21.f.t(aVar3, str).toString(), new String[]{"|"}, 6);
                    ArrayList arrayList6 = new ArrayList(x61.n.F(g0, 10));
                    Iterator it3 = g0.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(t71.p.t0((String) it3.next()).toString());
                    }
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj5 = arrayList6.get(i7);
                        i7++;
                        if (((String) obj5).length() > 0) {
                            arrayList7.add(obj5);
                        }
                    }
                    arrayList = new ArrayList(x61.n.F(arrayList7, 10));
                    int size4 = arrayList7.size();
                    int i8 = 0;
                    while (i8 < size4) {
                        Object obj6 = arrayList7.get(i8);
                        i8++;
                        String str2 = (String) obj6;
                        boolean F = t71.w.F(str2, ":", false);
                        boolean x = t71.w.x(str2, ":", false);
                        arrayList.add(new r3.k((F && x) ? 3 : x ? 6 : 5));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList2 = arrayList;
                }
                k kVar = new k(size, arrayList2, h);
                sVar.n0(kVar);
                N = kVar;
            }
            final k kVar2 = (k) N;
            if (kVar2.a == 0) {
                t = sVar.t();
                if (t != null) {
                    final int i9 = 0;
                    eVar = new j71.e() { // from class: com.github.rudroid.uitoolkit.markdown.components.l
                        public final Object s(Object obj7, Object obj8) {
                            switch (i9) {
                                case 0:
                                    ((Integer) obj8).getClass();
                                    s.a(rVar, str, aVar, map2, (androidx.compose.runtime.s) obj7, androidx.compose.runtime.t.L(i | 1));
                                    break;
                                default:
                                    ((Integer) obj8).getClass();
                                    s.a(rVar, str, aVar, map2, (androidx.compose.runtime.s) obj7, androidx.compose.runtime.t.L(i | 1));
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    t.d = eVar;
                }
                return;
            }
            rVar2 = rVar;
            final long j = ih.d.a(sVar).F0;
            final ch.g gVar = ih.d.d(sVar).d;
            w1.r b = a2.i.b(rVar2, ih.d.e(sVar).d);
            f0.v a2 = f0.o.a(0.0f, j);
            androidx.compose.foundation.layout.b.a(f0.o.h(b, a2.a, a2.b, ih.d.e(sVar).d), (w1.e) null, r1.i.d(1149744382, new j71.f() { // from class: com.github.rudroid.uitoolkit.markdown.components.m
                public final Object f(Object obj7, Object obj8, Object obj9) {
                    b0 b0Var = (b0) obj7;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj8;
                    int intValue = ((Integer) obj9).intValue();
                    k71.k.g(b0Var, "$this$BoxWithConstraints");
                    if ((intValue & 6) == 0) {
                        intValue |= sVar2.f(b0Var) ? 4 : 2;
                    }
                    if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                        int i0 = ((s3.c) sVar2.j(g1.h)).i0(b0Var.b());
                        w1.r w = f0.o.w(w1.o.a, f0.o.v(sVar2), false);
                        final k kVar3 = k.this;
                        int i11 = kVar3.a;
                        int i12 = kVar3.d;
                        final String str3 = str;
                        final Map map3 = map;
                        s.c(w, i11, i12, i0, j, gVar, r1.i.d(2070341814, new j71.e() { // from class: com.github.rudroid.uitoolkit.markdown.components.n
                            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
                            public final Object s(Object obj10, Object obj11) {
                                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj10;
                                int intValue2 = ((Integer) obj11).intValue();
                                if (sVar3.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    k kVar4 = k.this;
                                    for (u uVar : kVar4.c) {
                                        sVar3.c0(1028628041);
                                        ArrayList arrayList8 = uVar.b;
                                        int size5 = arrayList8.size();
                                        int i13 = 0;
                                        int i14 = 0;
                                        while (i14 < size5) {
                                            Object obj12 = arrayList8.get(i14);
                                            int i15 = i14 + 1;
                                            int i16 = i13 + 1;
                                            if (i13 < 0) {
                                                d0.x();
                                                throw null;
                                            }
                                            k91.a aVar4 = (k91.a) obj12;
                                            java.util.List r2 = (java.util.List) (kVar4.b);
                                            s.b(null, str3, aVar4, ((r3.k) ((i13 < 0 || i13 >= r2.size()) ? new r3.k(5) : r2.get(i13))).a, uVar.a, map3, sVar3, 0);
                                            i14 = i15;
                                            i13 = i16;
                                        }
                                        sVar3.q(false);
                                    }
                                } else {
                                    sVar3.V();
                                }
                                return w61.a0.a;
                            }
                        }, sVar2), sVar2, 1572864);
                    } else {
                        sVar2.V();
                    }
                    return w61.a0.a;
                }
            }, sVar), sVar, 3072);
        } else {
            rVar2 = rVar;
            sVar.V();
        }
        t = sVar.t();
        if (t != null) {
            final int i11 = 1;
            final w1.r rVar3 = rVar2;
            eVar = new j71.e() { // from class: com.github.rudroid.uitoolkit.markdown.components.l
                public final Object s(Object obj7, Object obj8) {
                    switch (i11) {
                        case 0:
                            ((Integer) obj8).getClass();
                            s.a(rVar3, str, aVar, map, (androidx.compose.runtime.s) obj7, androidx.compose.runtime.t.L(i | 1));
                            break;
                        default:
                            ((Integer) obj8).getClass();
                            s.a(rVar3, str, aVar, map, (androidx.compose.runtime.s) obj7, androidx.compose.runtime.t.L(i | 1));
                            break;
                    }
                    return w61.a0.a;
                }
            };
            t.d = eVar;
        }
    }

    public static final void b(w1.r rVar, String str, k91.a aVar, int i, boolean z, Map map, androidx.compose.runtime.s sVar, int i2) {
        w1.r rVar2;
        q0 a;
        sVar.e0(1262965714);
        int i3 = i2 | 6 | (sVar.f(str) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.d(i) ? 2048 : 1024) | (sVar.g(z) ? 16384 : 8192) | (sVar.h(map) ? 131072 : 65536);
        if (sVar.S(i3 & 1, (74899 & i3) != 74898)) {
            float f = ih.a.n;
            float f2 = ih.a.l;
            w1.r rVar3 = w1.o.a;
            w1.r y = androidx.compose.foundation.layout.b.y(rVar3, f, f2);
            sVar.c0(253000270);
            g3.d dVar = new g3.d();
            if (aVar == null) {
                sVar.c0(558282313);
                sVar.q(false);
            } else if (aVar.a().isEmpty()) {
                sVar.c0(558283774);
                sVar.q(false);
                dVar.g(t71.p.t0(k21.f.t(aVar, str).toString()).toString());
            } else {
                sVar.c0(127010117);
                Iterator it = aVar.a().iterator();
                while (it.hasNext()) {
                    g.b(ih.d.d(sVar), dVar, str, map, (k91.a) it.next());
                }
                sVar.q(false);
            }
            g3.g k = dVar.k();
            sVar.q(false);
            if (z) {
                sVar.c0(-403090376);
                a = q0.a(ih.d.c(sVar).a, 0L, 0L, k3.s.y, (k3.o) null, (k3.i) null, 0L, i, 0L, (g3.z) null, (r3.i) null, 16744443);
                sVar.q(false);
            } else {
                sVar.c0(-402970096);
                a = q0.a(ih.d.c(sVar).a, 0L, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, i, 0L, (g3.z) null, (r3.i) null, 16744447);
                sVar.q(false);
            }
            a0.b(y, k, a, sVar, 0, 0);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.workflowsummary.ui.l(rVar2, str, aVar, i, z, map, i2);
        }
    }

    public static final void c(final w1.r rVar, final int i, final int i2, final int i3, final long j, final ch.g gVar, r1.d dVar, androidx.compose.runtime.s sVar, final int i4) {
        r1.d dVar2;
        sVar.e0(1577046487);
        int i5 = i4 | (sVar.f(rVar) ? 4 : 2) | (sVar.d(i) ? 32 : 16) | (sVar.d(i2) ? 256 : 128) | (sVar.d(i3) ? 2048 : 1024) | (sVar.e(j) ? 16384 : 8192) | (sVar.f(gVar) ? 131072 : 65536);
        if (sVar.S(i5 & 1, (599187 & i5) != 599186)) {
            Object N = sVar.N();
            Object obj = androidx.compose.runtime.n.a;
            if (N == obj) {
                t.Companion.getClass();
                N = androidx.compose.runtime.t.B(t.e);
                sVar.n0(N);
            }
            final f1 f1Var = (f1) N;
            boolean z = ((i5 & 57344) == 16384) | ((458752 & i5) == 131072);
            Object N2 = sVar.N();
            if (z || N2 == obj) {
                N2 = new j71.c() { // from class: com.github.rudroid.uitoolkit.markdown.components.o
                    public final Object k(Object obj2) {
                        long j2;
                        float f;
                        o oVar = this;
                        f2.d dVar3 = (f2.d) obj2;
                        k71.k.g(dVar3, "$this$drawBehind");
                        t tVar = (t) f1Var.getValue();
                        t.Companion.getClass();
                        if (!k71.k.b(tVar, t.e)) {
                            List list = tVar.a;
                            List list2 = tVar.b;
                            if (!list.isEmpty() && !list2.isEmpty()) {
                                int size = list2.size();
                                float f2 = 0.0f;
                                float f3 = 0.0f;
                                int i6 = 0;
                                while (i6 < size) {
                                    float intValue = ((Number) list2.get(i6)).intValue();
                                    ch.g gVar2 = gVar;
                                    long j3 = i6 == 0 ? gVar2.a : (i6 + (-1)) % 2 == 0 ? gVar2.b : gVar2.c;
                                    if (d2.t.c(j3, d2.t.j)) {
                                        f = intValue;
                                    } else {
                                        f = intValue;
                                        f2.d.z0(dVar3, j3, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.a() >> 32))) << 32) | (Float.floatToRawIntBits(intValue) & 4294967295L), 0.0f, 120);
                                    }
                                    f3 += f;
                                    i6++;
                                    f2 = 0.0f;
                                }
                                float W = dVar3.W(f2);
                                int size2 = list2.size();
                                float f4 = 0.0f;
                                int i7 = 0;
                                while (true) {
                                    j2 = j;
                                    if (i7 >= size2) {
                                        break;
                                    }
                                    float intValue2 = f4 + ((Number) list2.get(i7)).intValue();
                                    if (i7 < d0.m(list2)) {
                                        long floatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.a() >> 32)));
                                        dVar3 = dVar3;
                                        dVar3.w(j2, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intValue2) & 4294967295L), (Float.floatToRawIntBits(intValue2) & 4294967295L) | (floatToRawIntBits << 32), W);
                                    }
                                    i7++;
                                    oVar = this;
                                    f4 = intValue2;
                                }
                                List list3 = tVar.a;
                                float W2 = dVar3.W(0.0f);
                                int m = d0.m(list3);
                                float f5 = 0.0f;
                                int i8 = 0;
                                while (i8 < m) {
                                    float intValue3 = f5 + ((Number) list3.get(i8)).intValue();
                                    dVar3.w(j2, (Float.floatToRawIntBits(intValue3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.a() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intValue3) << 32), W2);
                                    i8++;
                                    f5 = intValue3;
                                }
                            }
                        }
                        return w61.a0.a;
                    }
                };
                sVar.n0(N2);
            }
            w1.r d = a2.i.d(rVar, (j71.c) N2);
            boolean z2 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((i5 & 896) == 256);
            Object N3 = sVar.N();
            if (z2 || N3 == obj) {
                N3 = new r(i, i3, i2, f1Var);
                sVar.n0(N3);
            }
            v0 v0Var = (v0) N3;
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, d);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, v0Var);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            dVar2 = dVar;
            s0.x(6, dVar2, sVar, true);
        } else {
            dVar2 = dVar;
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            final r1.d dVar3 = dVar2;
            t.d = new j71.e(rVar, i, i2, i3, j, gVar, dVar3, i4) { // from class: com.github.rudroid.uitoolkit.markdown.components.p
                public final /* synthetic */ w1.r r;
                public final /* synthetic */ int s;
                public final /* synthetic */ int t;
                public final /* synthetic */ int u;
                public final /* synthetic */ long v;
                public final /* synthetic */ ch.g w;
                public final /* synthetic */ r1.d x;

                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = androidx.compose.runtime.t.L(1572865);
                    s.c(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (androidx.compose.runtime.s) obj2, L);
                    return w61.a0.a;
                }
            };
        }
    }

    public static final ArrayList d(k91.a aVar) {
        List a = aVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (k71.k.b(((k91.a) obj).a, n91.c.e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
    public Object A() { return null; }
    public Object X() { return null; }
    public Object r() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object c(float p1) { return null; }
    public Object c0(int p1) { return null; }
    public Object d(int p1) { return null; }
    public Object e(long p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(boolean p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object j(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
