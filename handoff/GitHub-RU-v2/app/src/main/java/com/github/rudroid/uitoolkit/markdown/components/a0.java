package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.p1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ch.a;
import d1.h1;
import g3.l0;
import g3.m0;
import g3.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q2.h0;
import w2.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public static final void a(w1.r rVar, g3.g gVar, q0 q0Var, androidx.compose.runtime.s sVar, int i) {
        int i2;
        g3.g gVar2;
        sVar.e0(-689901153);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gVar2 = gVar;
            i2 |= sVar.f(gVar2) ? 32 : 16;
        } else {
            gVar2 = gVar;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(q0Var) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (N == iVar) {
                p1 B = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar.n0(B);
                obj = B;
            }
            f1 f1Var = (f1) obj;
            Object N2 = sVar.N();
            Object obj2 = N2;
            if (N2 == iVar) {
                p1 B2 = androidx.compose.runtime.t.B("");
                sVar.n0(B2);
                obj2 = B2;
            }
            f1 f1Var2 = (f1) obj2;
            h1.c((w1.r) null, r1.i.d(194270748, new com.github.rudroid.actions.checkdetail.j(rVar, gVar2, q0Var, f1Var2, f1Var, 17), sVar), sVar, 48);
            if (((Boolean) f1Var.getValue()).booleanValue()) {
                sVar.c0(-1425774398);
                String str = (String) f1Var2.getValue();
                Object N3 = sVar.N();
                Object obj3 = N3;
                if (N3 == iVar) {
                    com.github.rudroid.fragments.onboarding.notifications.ui.p pVar = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 20);
                    sVar.n0(pVar);
                    obj3 = pVar;
                }
                j71.a aVar = (j71.a) obj3;
                Object N4 = sVar.N();
                Object obj4 = N4;
                if (N4 == iVar) {
                    com.github.rudroid.fragments.onboarding.notifications.ui.p pVar2 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 21);
                    sVar.n0(pVar2);
                    obj4 = pVar2;
                }
                j71.a aVar2 = (j71.a) obj4;
                Object N5 = sVar.N();
                Object obj5 = N5;
                if (N5 == iVar) {
                    com.github.rudroid.fragments.onboarding.notifications.ui.p pVar3 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 22);
                    sVar.n0(pVar3);
                    obj5 = pVar3;
                }
                xg.r.a(null, aVar, aVar2, (j71.a) obj5, str, sVar, 3504);
            } else {
                sVar.c0(-1429150205);
            }
            sVar.q(false);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(rVar, gVar, q0Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, g3.g gVar, q0 q0Var, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        q0 q0Var2;
        q0 q0Var3;
        w1.r rVar2;
        boolean z;
        Object N;
        List<g3.e> list;
        sVar.e0(40377016);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && sVar.f(q0Var)) ? 256 : 128;
        }
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                if (i4 != 0) {
                    rVar = w1.o.a;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    q0Var3 = ih.d.c(sVar).a;
                    rVar2 = rVar;
                    sVar.r();
                    z = (i3 & 112) == 32;
                    N = sVar.N();
                    if (!z || N == androidx.compose.runtime.n.a) {
                        N = gVar.b(0, "MARKDOWN_CODE_SPAN", gVar.s.length());
                        sVar.n0(N);
                    }
                    list = (List) N;
                    ch.d dVar = ih.d.d(sVar).e;
                    a.b bVar = dVar.c;
                    if (list.isEmpty()) {
                        sVar.c0(281404017);
                        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                        for (g3.e eVar : list) {
                            arrayList.add(new w61.k(Integer.valueOf(eVar.b), Integer.valueOf(eVar.c)));
                        }
                        c(rVar2, gVar, q0Var3, arrayList, dVar.b, bVar, sVar, i3 & 1022);
                        rVar = rVar2;
                        sVar.q(false);
                    } else {
                        rVar = rVar2;
                        sVar.c0(281295145);
                        a(rVar, gVar, q0Var3, sVar, i3 & 1022);
                        sVar.q(false);
                    }
                    q0Var2 = q0Var3;
                }
            } else {
                sVar.V();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            rVar2 = rVar;
            q0Var3 = q0Var;
            sVar.r();
            if ((i3 & 112) == 32) {
            }
            N = sVar.N();
            if (!z) {
            }
            N = gVar.b(0, "MARKDOWN_CODE_SPAN", gVar.s.length());
            sVar.n0(N);
            list = (List) N;
            ch.d dVar2 = ih.d.d(sVar).e;
            a.b bVar2 = dVar2.c;
            if (list.isEmpty()) {
            }
            q0Var2 = q0Var3;
        } else {
            sVar.V();
            q0Var2 = q0Var;
        }
        w1.r rVar3 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new w0(rVar3, gVar, q0Var2, i, i2, 15);
        }
    }

    public static final void c(final w1.r rVar, final g3.g gVar, final q0 q0Var, final ArrayList arrayList, final long j, a.b bVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        boolean z;
        sVar.e0(1187853058);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.f(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.h(arrayList) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.e(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(bVar) ? 131072 : 65536;
        }
        if (sVar.S(i2 & 1, (74899 & i2) != 74898)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (N == iVar) {
                p1 B = androidx.compose.runtime.t.B((Object) null);
                sVar.n0(B);
                obj = B;
            }
            final f1 f1Var = (f1) obj;
            Object N2 = sVar.N();
            Object obj2 = N2;
            if (N2 == iVar) {
                p1 B2 = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar.n0(B2);
                obj2 = B2;
            }
            final f1 f1Var2 = (f1) obj2;
            Object N3 = sVar.N();
            Object obj3 = N3;
            if (N3 == iVar) {
                p1 B3 = androidx.compose.runtime.t.B("");
                sVar.n0(B3);
                obj3 = B3;
            }
            final f1 f1Var3 = (f1) obj3;
            s3.c cVar = (s3.c) sVar.j(g1.h);
            final float W = cVar.W(bVar.a);
            final float W2 = cVar.W(bVar.b);
            final float W3 = cVar.W(bVar.c);
            h1.c((w1.r) null, r1.i.d(177633023, new j71.e() { // from class: com.github.rudroid.uitoolkit.markdown.components.y
                public final Object s(Object obj4, Object obj5) {
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if (sVar2.S(intValue & 1, (intValue & 3) != 2)) {
                        g3.g gVar2 = gVar;
                        boolean f = sVar2.f(gVar2);
                        Object N4 = sVar2.N();
                        Object obj6 = androidx.compose.runtime.n.a;
                        if (f || N4 == obj6) {
                            N4 = new com.github.rudroid.repository.fork.ui.k(gVar2, 2);
                            sVar2.n0(N4);
                        }
                        w1.r a = d3.q.a(rVar, (j71.c) N4);
                        boolean f2 = sVar2.f(gVar2);
                        Object N5 = sVar2.N();
                        final f1 f1Var4 = f1Var;
                        if (f2 || N5 == obj6) {
                            N5 = new z(gVar2, f1Var4, f1Var3, f1Var2);
                            sVar2.n0(N5);
                        }
                        w1.r a2 = h0.a(a, gVar2, (PointerInputEventHandler) N5);
                        final ArrayList arrayList2 = arrayList;
                        boolean h = sVar2.h(arrayList2);
                        final long j2 = j;
                        boolean e = h | sVar2.e(j2);
                        final float f3 = W2;
                        boolean c = e | sVar2.c(f3);
                        final float f4 = W3;
                        boolean c2 = c | sVar2.c(f4);
                        final float f5 = W;
                        boolean c3 = c2 | sVar2.c(f5);
                        Object N6 = sVar2.N();
                        if (c3 || N6 == obj6) {
                            j71.c cVar2 = new j71.c() { // from class: com.github.rudroid.uitoolkit.markdown.components.x
                                /* JADX WARN: Removed duplicated region for block: B:27:0x00c8 A[LOOP:2: B:25:0x00c2->B:27:0x00c8, LOOP_END] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object k(Object obj7) {
                                    f2.d dVar;
                                    ArrayList<c2.c> arrayList3;
                                    f2.d dVar2 = (f2.d) obj7;
                                    k71.k.g(dVar2, "$this$drawBehind");
                                    m0 m0Var = (m0) f1Var4.getValue();
                                    if (m0Var != null) {
                                        ArrayList arrayList4 = arrayList2;
                                        int size = arrayList4.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            int i4 = i3 + 1;
                                            w61.k kVar = (w61.k) arrayList4.get(i3);
                                            int intValue2 = ((Number) kVar.r).intValue();
                                            int intValue3 = ((Number) kVar.s).intValue();
                                            if (intValue2 < intValue3) {
                                                l0 l0Var = m0Var.a;
                                                g3.p pVar = m0Var.b;
                                                if (intValue3 <= l0Var.a.s.length()) {
                                                    int d = pVar.d(intValue2);
                                                    int d2 = pVar.d(intValue3 - 1);
                                                    boolean z2 = true;
                                                    q71.g gVar3 = new q71.g(d, d2, 1);
                                                    arrayList3 = new ArrayList(x61.n.F(gVar3, 10));
                                                    x61.v it = gVar3.iterator();
                                                    while (((q71.f) it).t) {
                                                        int nextInt = it.nextInt();
                                                        int h2 = m0Var.h(nextInt);
                                                        int c4 = pVar.c(nextInt, z2);
                                                        if (nextInt == d) {
                                                            h2 = intValue2;
                                                        }
                                                        f2.d dVar3 = dVar2;
                                                        int i5 = nextInt == d2 ? intValue3 : c4;
                                                        float e2 = m0Var.e(h2, z2);
                                                        float e3 = m0Var.e(i5, z2);
                                                        arrayList3.add(new c2.c(Math.min(e2, e3), pVar.f(nextInt), Math.max(e2, e3), pVar.b(nextInt)));
                                                        dVar2 = dVar3;
                                                        intValue2 = intValue2;
                                                        intValue3 = intValue3;
                                                        z2 = true;
                                                    }
                                                    dVar = dVar2;
                                                    for (c2.c cVar3 : arrayList3) {
                                                        float f6 = cVar3.a;
                                                        float f7 = cVar3.b;
                                                        float f8 = f3;
                                                        float f9 = f4;
                                                        float f11 = 2;
                                                        f2.d.L(dVar, j2, (Float.floatToRawIntBits(f6 - f8) << 32) | (Float.floatToRawIntBits(f7 - f9) & 4294967295L), (Float.floatToRawIntBits((f8 * f11) + (cVar3.c - cVar3.a)) << 32) | (Float.floatToRawIntBits((f11 * f9) + (cVar3.d - f7)) & 4294967295L), (Float.floatToRawIntBits(r1) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), (f2.e) null, 240);
                                                    }
                                                    dVar2 = dVar;
                                                    i3 = i4;
                                                }
                                            }
                                            dVar = dVar2;
                                            arrayList3 = x61.rShadow.r;
                                            while (r16.hasNext()) {
                                            }
                                            dVar2 = dVar;
                                            i3 = i4;
                                        }
                                    }
                                    return w61.a0.a;
                                }
                            };
                            sVar2.n0(cVar2);
                            N6 = cVar2;
                        }
                        w1.r d = a2.i.d(a2, (j71.c) N6);
                        Object N7 = sVar2.N();
                        if (N7 == obj6) {
                            N7 = new ab.e(f1Var4, 10);
                            sVar2.n0(N7);
                        }
                        s0.s.a(gVar2, d, q0Var, (j71.c) N7, 0, false, 0, 0, (Map) null, sVar2, 3072, 0, 2032);
                    } else {
                        sVar2.V();
                    }
                    return w61.a0.a;
                }
            }, sVar), sVar, 48);
            if (((Boolean) f1Var2.getValue()).booleanValue()) {
                sVar.c0(1097529951);
                String str = (String) f1Var3.getValue();
                Object N4 = sVar.N();
                if (N4 == iVar) {
                    N4 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var2, 17);
                    sVar.n0(N4);
                }
                j71.a aVar = (j71.a) N4;
                Object N5 = sVar.N();
                if (N5 == iVar) {
                    N5 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var2, 18);
                    sVar.n0(N5);
                }
                j71.a aVar2 = (j71.a) N5;
                Object N6 = sVar.N();
                if (N6 == iVar) {
                    N6 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var2, 19);
                    sVar.n0(N6);
                }
                j71.a aVar3 = (j71.a) N6;
                z = false;
                xg.r.a(null, aVar, aVar2, aVar3, str, sVar, 3504);
            } else {
                z = false;
                sVar.c0(1091246592);
            }
            sVar.q(z);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.uitoolkit.g(rVar, gVar, q0Var, arrayList, j, bVar, i);
        }
    }

}
