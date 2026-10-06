package com.github.rudroid.uitoolkit;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a8, code lost:
    
        if (r4 == androidx.compose.runtime.n.a) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final w1.r rVar, final List list, androidx.compose.runtime.s sVar, final int i) {
        j71.e eVar;
        androidx.compose.runtime.b2 b2Var;
        int i2;
        ArrayList arrayList;
        sVar.e0(-2055754074);
        int i3 = ((i & 6) == 0 ? (sVar.f(rVar) ? 4 : 2) | i : i) | (sVar.h(list) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((o1) obj).a > 0) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                i4 += ((o1) obj2).a;
            }
            if (i4 <= 0 || arrayList2.isEmpty()) {
                b2Var = sVar.t();
                if (b2Var != null) {
                    final int i6 = 0;
                    eVar = new j71.e() { // from class: com.github.rudroid.uitoolkit.x0
                        public final Object s(Object obj3, Object obj4) {
                            int i7 = i6;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                            ((Integer) obj4).getClass();
                            switch (i7) {
                                case 0:
                                    z0.a(rVar, list, sVar2, androidx.compose.runtime.t.L(i | 1));
                                    break;
                                default:
                                    z0.a(rVar, list, sVar2, androidx.compose.runtime.t.L(i | 1));
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    b2Var.d = eVar;
                }
                return;
            }
            int size2 = arrayList2.size();
            float f = 6.0f;
            float f2 = 100.0f;
            if (arrayList2.isEmpty()) {
                i2 = 0;
            } else {
                int size3 = arrayList2.size();
                i2 = 0;
                int i7 = 0;
                while (i7 < size3) {
                    Object obj3 = arrayList2.get(i7);
                    i7++;
                    if ((((o1) obj3).a / i4) * 100.0f < 6.0f && (i2 = i2 + 1) < 0) {
                        sy.d0Shadow.w();
                        throw null;
                    }
                }
            }
            int i8 = size2 - i2;
            if (i8 < 1) {
                i8 = 1;
            }
            float f3 = i2;
            float f4 = 5.0f;
            float f5 = (f3 * 5.0f) / i8;
            ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
            int size4 = arrayList2.size();
            int i9 = 0;
            while (i9 < size4) {
                Object obj4 = arrayList2.get(i9);
                i9++;
                float f6 = f;
                int i11 = ((o1) obj4).a;
                float f7 = f2;
                float f8 = f4;
                float f9 = i4;
                boolean z3 = (((float) i11) / f9) * f7 < f6;
                float f11 = (i11 / f9) * f7;
                if (size2 > 1) {
                    f11 -= f8;
                }
                arrayList3.add(Float.valueOf(z3 ? f11 + f8 : f11 - f5));
                f2 = f7;
                f = f6;
                f4 = f8;
            }
            float f12 = f4;
            androidx.compose.ui.layout.v0 d = androidx.compose.foundation.layout.t.d(w1.c.r, false);
            int hashCode = Long.hashCode(sVar.T);
            androidx.compose.runtime.v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.q0();
            }
            androidx.compose.runtime.t.I(sVar, v2.g.f, d);
            androidx.compose.runtime.t.I(sVar, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar, v2.g.h);
            androidx.compose.runtime.t.I(sVar, v2.g.d, c);
            float f13 = size2 > 1 ? 2.5f : 0.0f;
            sVar.c0(-371613151);
            int size5 = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            float f14 = 0.0f;
            while (i13 < size5) {
                Object obj5 = arrayList2.get(i13);
                i13++;
                int i14 = i12 + 1;
                if (i12 < 0) {
                    sy.d0Shadow.x();
                    throw null;
                }
                final o1 o1Var = (o1) obj5;
                float floatValue = ((Number) arrayList3.get(i12)).floatValue();
                final float f15 = floatValue * 3.6f;
                final float f16 = ((f14 + f13) * 3.6f) + 270.0f;
                w1.r b = androidx.compose.foundation.layout.y.a.b();
                boolean f17 = sVar.f(o1Var) | sVar.c(f16) | sVar.c(f15);
                ArrayList arrayList4 = arrayList2;
                Object N = sVar.N();
                if (f17) {
                    arrayList = arrayList3;
                } else {
                    arrayList = arrayList3;
                }
                N = new j71.c() { // from class: com.github.rudroid.uitoolkit.y0
                    public final Object k(Object obj6) {
                        f2.d dVar = (f2.d) obj6;
                        k71.k.g(dVar, "$this$Canvas");
                        f2.d.o0(dVar, o1.this.b, f16, f15, false, 0L, 0L, 0.0f, new f2.h(dVar.W(2), 0.0f, 1, 0, 26), 880);
                        return w61.a0.a;
                    }
                };
                sVar.n0(N);
                f0.o.b(0, sVar, (j71.c) N, b);
                f14 += floatValue + (size2 > 1 ? f12 : 0.0f);
                z2 = true;
                z = false;
                i12 = i14;
                arrayList3 = arrayList;
                arrayList2 = arrayList4;
            }
            sVar.q(z);
            sVar.q(z2);
        } else {
            sVar.V();
        }
        b2Var = sVar.t();
        if (b2Var != null) {
            final int i15 = 1;
            eVar = new j71.e() { // from class: com.github.rudroid.uitoolkit.x0
                public final Object s(Object obj32, Object obj42) {
                    int i72 = i15;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj32;
                    ((Integer) obj42).getClass();
                    switch (i72) {
                        case 0:
                            z0.a(rVar, list, sVar2, androidx.compose.runtime.t.L(i | 1));
                            break;
                        default:
                            z0.a(rVar, list, sVar2, androidx.compose.runtime.t.L(i | 1));
                            break;
                    }
                    return w61.a0.a;
                }
            };
            b2Var.d = eVar;
        }
    }
}
