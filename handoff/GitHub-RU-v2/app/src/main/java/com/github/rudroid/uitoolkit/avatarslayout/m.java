package com.github.rudroid.uitoolkit.avatarslayout;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.uitoolkit.y1;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import g3.z;
import java.util.Iterator;
import java.util.List;
import sy.d0Shadow;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final void a(final w1.r rVar, final List list, final int i, float f, float f2, androidx.compose.runtime.s sVar, final int i2) {
        int i3;
        final float f3;
        final float f4;
        sVar.e0(-1320063327);
        if ((i2 & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.d(i) ? 256 : 128;
        }
        int i4 = i3 | 1797120;
        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
            float f5 = 10;
            final float f6 = ih.a.x;
            boolean z = (458752 & i4) == 131072;
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new u0(6);
                sVar.n0(N);
            }
            p.a(d3.q.b(rVar, false, (j71.c) N), f5, r1.i.d(1659256118, new j71.e() { // from class: com.github.rudroid.uitoolkit.avatarslayout.i
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Iterable, java.lang.Object] */
                public final Object s(Object obj, Object obj2) {
                    final float f7;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i5 = 1;
                    if (sVar2.S(intValue & 1, (intValue & 3) != 2)) {
                        sVar2.c0(1112264357);
                        java.util.List r1 = (java.util.List) (list);
                        int i6 = i;
                        Iterator it = x61.m.x0((Iterable) r1, i6).iterator();
                        List list2 = r1;
                        while (true) {
                            boolean hasNext = it.hasNext();
                            f7 = f6;
                            if (!hasNext) {
                                break;
                            }
                            h hVar = (h) it.next();
                            boolean z2 = hVar.c != null ? i5 : 0;
                            boolean f8 = sVar2.f(hVar);
                            Object N2 = sVar2.N();
                            Object obj3 = androidx.compose.runtime.n.a;
                            if (f8 || N2 == obj3) {
                                N2 = new k(hVar, 0);
                                sVar2.n0(N2);
                            }
                            w1.r a = com.github.rudroid.uitoolkit.extensions.d.a(w1.o.a, z2, (j71.c) N2);
                            boolean f9 = sVar2.f((Object) null) | sVar2.f(hVar);
                            Object N3 = sVar2.N();
                            if (f9 || N3 == obj3) {
                                N3 = new k(hVar, 1);
                                sVar2.n0(N3);
                            }
                            long j = ih.d.b(sVar2).b;
                            r0.d dVar = r0.e.a;
                            y1.a(a2.i.b(androidx.compose.foundation.layout.b.x(f0.o.g(p2.o(com.github.rudroid.uitoolkit.extensions.d.a(a, false, (j71.c) N3), f7), i5, j, dVar), (float) 0.5d), dVar), hVar.b, null, d0Shadow.n(new u9.a()), false, null, null, null, null, true, sVar2, 0, 6, 1012);
                            i5 = i5;
                            i6 = i6;
                            list2 = list2;
                        }
                        sVar2.q(false);
                        final int size = list2.size() - i6;
                        if (size > 0) {
                            sVar2.c0(121322965);
                            ub.a(q0.a(ih.d.f(sVar2).b, ih.d.b(sVar2).v, t1.C(11), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777212), r1.i.d(336993962, new j71.e() { // from class: com.github.rudroid.uitoolkit.avatarslayout.l
                                public final Object s(Object obj4, Object obj5) {
                                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (sVar3.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        com.github.rudroid.uitoolkit.j.b(p2.o(w1.o.a, f7), null, i4.q0(2131953411, new Object[]{Integer.valueOf(size)}, sVar3), 0.0f, null, null, 0, ih.d.b(sVar3).a, ih.d.b(sVar3).b, 0.0f, null, 0L, null, sVar3, 0, 384, 3706);
                                    } else {
                                        sVar3.V();
                                    }
                                    return a0.a;
                                }
                            }, sVar2), sVar2, 48);
                        } else {
                            sVar2.c0(118600204);
                        }
                        sVar2.q(false);
                    } else {
                        sVar2.V();
                    }
                    return a0.a;
                }
            }, sVar), sVar, ((i4 >> 6) & 112) | 384, 0);
            f3 = f5;
            f4 = f6;
        } else {
            sVar.V();
            f3 = f;
            f4 = f2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.avatarslayout.j
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m.a(rVar, list, i, f3, f4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i2 | 1));
                    return a0.a;
                }
            };
        }
    }
}
