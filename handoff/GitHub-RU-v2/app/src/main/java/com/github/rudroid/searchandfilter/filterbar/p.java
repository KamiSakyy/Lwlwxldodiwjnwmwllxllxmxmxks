package com.github.rudroid.searchandfilter.filterbar;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.copilot.ui.v0;
import com.github.rudroid.searchandfilter.filterbar.d;
import com.github.rudroid.searchandfilter.filterbar.f;
import com.github.rudroid.uitoolkit.menu.d;
import d2.a0;
import d2.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import w1.r;
import yg.q;
import z.n0;
import z.x;
import z.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public static final void a(r rVar, f.b.a aVar, s sVar, int i) {
        r rVar2;
        s sVar2;
        sVar.e0(37087895);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.f(aVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            rVar2 = rVar;
            sVar2 = sVar;
            yg.o.a((i2 << 9) & 7168, sVar2, aVar.g, aVar.b, aVar.e, rVar2);
        } else {
            rVar2 = rVar;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(rVar2, aVar, i, 26);
        }
    }

    public static final void b(r rVar, f.b.C0002b c0002b, s sVar, int i) {
        Object obj;
        sVar.e0(-2105266985);
        int i2 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.h(c0002b) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = t.B(Boolean.FALSE);
                sVar.n0(N);
            }
            f1 f1Var = (f1) N;
            List<f.b.C0002b.a> list = c0002b.g;
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            for (f.b.C0002b.a aVar : list) {
                if (aVar instanceof f.b.C0002b.a.C0003a) {
                    String str = ((f.b.C0002b.a.C0003a) aVar).b;
                    obj = new d.C0009d(str, str, (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092);
                } else {
                    if (!(aVar instanceof f.b.C0002b.a.C0004b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj = d.g.a;
                }
                arrayList.add(obj);
            }
            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
            String str2 = c0002b.h.b;
            boolean h = sVar.h(c0002b);
            Object N2 = sVar.N();
            if (h || N2 == iVar) {
                N2 = new com.github.rudroid.repositories.repositoryownerrepositories.d(c0002b, f1Var, 5);
                sVar.n0(N2);
            }
            j71.c cVar = (j71.c) N2;
            Object N3 = sVar.N();
            if (N3 == iVar) {
                N3 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 10);
                sVar.n0(N3);
            }
            com.github.rudroid.uitoolkit.menu.l.a(rVar, booleanValue, arrayList, str2, cVar, (j71.a) N3, 0L, 0L, false, r1.i.d(-338067751, new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(22, c0002b, f1Var), sVar), sVar, (i2 & 14) | 805502976, 448);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(rVar, c0002b, i, 23);
        }
    }

    public static final void c(r rVar, f.b.c cVar, s sVar, int i) {
        sVar.e0(854330825);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.f(cVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            d dVar = cVar.h;
            if (dVar instanceof d.a) {
                sVar.c0(-606441083);
                q.c(((d.a) dVar).a, (i2 << 12) & 57344, 0, sVar, cVar.g, cVar.b, cVar.e, rVar, cVar.c);
                sVar.q(false);
            } else if (dVar instanceof d.b) {
                sVar.c0(-606147110);
                q.d(g.a(((d.b) dVar).a), (i2 << 12) & 57344, 0, sVar, cVar.g, cVar.b, cVar.e, rVar, cVar.c);
                sVar.q(false);
            } else {
                if (dVar != null) {
                    throw f1.e.r(673172980, sVar, false);
                }
                sVar.c0(-605847712);
                int i3 = (i2 << 12) & 57344;
                q.a(i3, 0, sVar, cVar.g, cVar.b, cVar.e, rVar, cVar.c);
                sVar.q(false);
            }
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(rVar, cVar, i, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(r rVar, long j, final List list, final boolean z, int i, List list2, s sVar, final int i2, final int i3) {
        final r rVar2;
        int i4;
        long j2;
        final int i5;
        List list3;
        final long j3;
        final int i6;
        final List list4;
        b2 t;
        int i7;
        int i8;
        final List list5;
        final r rVar3;
        final long j4;
        int i9;
        int i11;
        k71.k.g(list, "filters");
        sVar.e0(1267694818);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j2 = j;
                if (sVar.e(j2)) {
                    i11 = 32;
                    i4 |= i11;
                }
            } else {
                j2 = j;
            }
            i11 = 16;
            i4 |= i11;
        } else {
            j2 = j;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.h(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                if (sVar.d(i5)) {
                    i9 = 16384;
                    i4 |= i9;
                }
            } else {
                i5 = i;
            }
            i9 = 8192;
            i4 |= i9;
        } else {
            i5 = i;
        }
        int i13 = i3 & 32;
        if (i13 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            list3 = list2;
            i4 |= sVar.h(list3) ? 131072 : 65536;
            if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
                sVar.V();
                j3 = j2;
                i6 = i5;
                list4 = list3;
            } else {
                sVar.X();
                int i14 = i2 & 1;
                r rVar4 = w1.o.a;
                int i15 = -57345;
                if (i14 == 0 || sVar.A()) {
                    if (i12 != 0) {
                        rVar2 = rVar4;
                    }
                    if ((i3 & 2) != 0) {
                        j2 = ih.d.b(sVar).b;
                        i4 &= -113;
                    }
                    if ((i3 & 16) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof f.b) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            i7 = 0;
                        } else {
                            int size = arrayList.size();
                            int i16 = 0;
                            i7 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList.get(i16);
                                i16++;
                                int i17 = i15;
                                if (((f.b) obj2).c && (i7 = i7 + 1) < 0) {
                                    d0.w();
                                    throw null;
                                }
                                i15 = i17;
                            }
                        }
                        i4 &= i15;
                    } else {
                        i7 = i5;
                    }
                    if (i13 != 0) {
                        i8 = i4;
                        i5 = i7;
                        long j5 = j2;
                        list5 = x61.r.r;
                        rVar3 = rVar2;
                        j4 = j5;
                        sVar.r();
                        long j6 = j4;
                        x.e(z, f0.o.f(rVar4, j4, a0.b), n0.m(), n0.o(), (String) null, r1.i.d(-1828480246, new j71.f() { // from class: com.github.rudroid.searchandfilter.filterbar.h
                            /* JADX WARN: Type inference failed for: r1v13 */
                            /* JADX WARN: Type inference failed for: r1v7 */
                            /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
                            public final Object f(Object obj3, Object obj4, Object obj5) {
                                long j7;
                                int r1;
                                Object obj6;
                                int i18;
                                long j8;
                                long j9;
                                s sVar2 = (s) obj4;
                                ((Integer) obj5).getClass();
                                k71.k.g((y) obj3, "$this$AnimatedVisibility");
                                w1.o oVar = w1.o.a;
                                l0 l0Var = a0.b;
                                long j11 = j4;
                                r f = f0.o.f(oVar, j11, l0Var).f(rVar3);
                                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                                l2 a = j2.a(androidx.compose.foundation.layout.l.g(ih.a.l), w1.c.A, sVar2, 0);
                                int hashCode = Long.hashCode(sVar2.T);
                                v1 l = sVar2.l();
                                r c = w1.a.c(sVar2, f);
                                v2.h.o.getClass();
                                v2.f fVar2 = v2.g.b;
                                sVar2.g0();
                                if (sVar2.S) {
                                    sVar2.k(fVar2);
                                } else {
                                    sVar2.q0();
                                }
                                t.I(sVar2, v2.g.f, a);
                                t.I(sVar2, v2.g.e, l);
                                t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                                t.E(sVar2, v2.g.h);
                                t.I(sVar2, v2.g.d, c);
                                List<e> list6 = list5;
                                boolean isEmpty = list6.isEmpty();
                                Object obj7 = androidx.compose.runtime.n.a;
                                if (isEmpty || (i18 = i5) <= 0) {
                                    j7 = j11;
                                    r1 = 0;
                                    obj6 = obj7;
                                    sVar2.c0(-409553348);
                                } else {
                                    sVar2.c0(-405940732);
                                    Object N = sVar2.N();
                                    if (N == obj7) {
                                        N = t.B(Boolean.FALSE);
                                        sVar2.n0(N);
                                    }
                                    f1 f1Var = (f1) N;
                                    sVar2.c0(402550156);
                                    long j12 = j11;
                                    ArrayList arrayList2 = new ArrayList(x61.n.F(list6, 10));
                                    for (e eVar : list6) {
                                        String str = eVar.a;
                                        j71.a aVar = eVar.b;
                                        if (aVar == null) {
                                            sVar2.c0(-788661282);
                                            j8 = j12;
                                            j9 = ih.d.b(sVar2).c0;
                                            sVar2.q(false);
                                        } else {
                                            j8 = j12;
                                            sVar2.c0(-788554084);
                                            sVar2.q(false);
                                            j9 = d2.t.k;
                                        }
                                        arrayList2.add(new d.C0009d(str, str, (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, j9, 0L, 0L, aVar != null, false, 0, 3804));
                                        j12 = j8;
                                    }
                                    long j13 = j12;
                                    sVar2.q(false);
                                    boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
                                    boolean h = sVar2.h(list6);
                                    Object N2 = sVar2.N();
                                    if (h || N2 == obj7) {
                                        N2 = new com.github.rudroid.repositories.repositoryownerrepositories.d(list6, f1Var, 6);
                                        sVar2.n0(N2);
                                    }
                                    j71.c cVar = (j71.c) N2;
                                    Object N3 = sVar2.N();
                                    if (N3 == obj7) {
                                        N3 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 8);
                                        sVar2.n0(N3);
                                    }
                                    obj6 = obj7;
                                    r1 = 0;
                                    j7 = j13;
                                    com.github.rudroid.uitoolkit.menu.l.a(null, booleanValue, arrayList2, null, cVar, (j71.a) N3, 0L, 0L, false, r1.i.d(2097822317, new v0(i18, f1Var, 5), sVar2), sVar2, 805502976, 457);
                                }
                                sVar2.q((boolean) r1);
                                androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.l.a;
                                androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(ih.a.l);
                                List list7 = list;
                                boolean h2 = sVar2.h(list7);
                                Object N4 = sVar2.N();
                                if (h2 || N4 == obj6) {
                                    N4 = new j((int) r1, list7);
                                    sVar2.n0(N4);
                                }
                                ah.h.a(null, j7, 0.0f, z, g, null, (j71.c) N4, sVar2, 0, 37);
                                sVar2.q(true);
                                return w61.a0.a;
                            }
                        }, sVar), sVar, ((i8 >> 9) & 14) | 200064, 16);
                        rVar2 = rVar3;
                        j3 = j6;
                        i6 = i5;
                        list4 = list5;
                    } else {
                        i8 = i4;
                        i5 = i7;
                    }
                } else {
                    sVar.V();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i8 = i4;
                }
                long j7 = j2;
                rVar3 = rVar2;
                j4 = j7;
                list5 = list3;
                sVar.r();
                long j62 = j4;
                x.e(z, f0.o.f(rVar4, j4, a0.b), n0.m(), n0.o(), (String) null, r1.i.d(-1828480246, new j71.f() { // from class: com.github.rudroid.searchandfilter.filterbar.h
                    /* JADX WARN: Type inference failed for: r1v13 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
                    public final Object f(Object obj3, Object obj4, Object obj5) {
                        long j72;
                        int r1;
                        Object obj6;
                        int i18;
                        long j8;
                        long j9;
                        s sVar2 = (s) obj4;
                        ((Integer) obj5).getClass();
                        k71.k.g((y) obj3, "$this$AnimatedVisibility");
                        w1.o oVar = w1.o.a;
                        l0 l0Var = a0.b;
                        long j11 = j4;
                        r f = f0.o.f(oVar, j11, l0Var).f(rVar3);
                        androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                        l2 a = j2.a(androidx.compose.foundation.layout.l.g(ih.a.l), w1.c.A, sVar2, 0);
                        int hashCode = Long.hashCode(sVar2.T);
                        v1 l = sVar2.l();
                        r c = w1.a.c(sVar2, f);
                        v2.h.o.getClass();
                        v2.f fVar2 = v2.g.b;
                        sVar2.g0();
                        if (sVar2.S) {
                            sVar2.k(fVar2);
                        } else {
                            sVar2.q0();
                        }
                        t.I(sVar2, v2.g.f, a);
                        t.I(sVar2, v2.g.e, l);
                        t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                        t.E(sVar2, v2.g.h);
                        t.I(sVar2, v2.g.d, c);
                        List<e> list6 = list5;
                        boolean isEmpty = list6.isEmpty();
                        Object obj7 = androidx.compose.runtime.n.a;
                        if (isEmpty || (i18 = i5) <= 0) {
                            j72 = j11;
                            r1 = 0;
                            obj6 = obj7;
                            sVar2.c0(-409553348);
                        } else {
                            sVar2.c0(-405940732);
                            Object N = sVar2.N();
                            if (N == obj7) {
                                N = t.B(Boolean.FALSE);
                                sVar2.n0(N);
                            }
                            f1 f1Var = (f1) N;
                            sVar2.c0(402550156);
                            long j12 = j11;
                            ArrayList arrayList2 = new ArrayList(x61.n.F(list6, 10));
                            for (e eVar : list6) {
                                String str = eVar.a;
                                j71.a aVar = eVar.b;
                                if (aVar == null) {
                                    sVar2.c0(-788661282);
                                    j8 = j12;
                                    j9 = ih.d.b(sVar2).c0;
                                    sVar2.q(false);
                                } else {
                                    j8 = j12;
                                    sVar2.c0(-788554084);
                                    sVar2.q(false);
                                    j9 = d2.t.k;
                                }
                                arrayList2.add(new d.C0009d(str, str, (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, j9, 0L, 0L, aVar != null, false, 0, 3804));
                                j12 = j8;
                            }
                            long j13 = j12;
                            sVar2.q(false);
                            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
                            boolean h = sVar2.h(list6);
                            Object N2 = sVar2.N();
                            if (h || N2 == obj7) {
                                N2 = new com.github.rudroid.repositories.repositoryownerrepositories.d(list6, f1Var, 6);
                                sVar2.n0(N2);
                            }
                            j71.c cVar = (j71.c) N2;
                            Object N3 = sVar2.N();
                            if (N3 == obj7) {
                                N3 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 8);
                                sVar2.n0(N3);
                            }
                            obj6 = obj7;
                            r1 = 0;
                            j72 = j13;
                            com.github.rudroid.uitoolkit.menu.l.a(null, booleanValue, arrayList2, null, cVar, (j71.a) N3, 0L, 0L, false, r1.i.d(2097822317, new v0(i18, f1Var, 5), sVar2), sVar2, 805502976, 457);
                        }
                        sVar2.q((boolean) r1);
                        androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.l.a;
                        androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(ih.a.l);
                        List list7 = list;
                        boolean h2 = sVar2.h(list7);
                        Object N4 = sVar2.N();
                        if (h2 || N4 == obj6) {
                            N4 = new j((int) r1, list7);
                            sVar2.n0(N4);
                        }
                        ah.h.a(null, j72, 0.0f, z, g, null, (j71.c) N4, sVar2, 0, 37);
                        sVar2.q(true);
                        return w61.a0.a;
                    }
                }, sVar), sVar, ((i8 >> 9) & 14) | 200064, 16);
                rVar2 = rVar3;
                j3 = j62;
                i6 = i5;
                list4 = list5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: com.github.rudroid.searchandfilter.filterbar.i
                    public final Object s(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        p.d(rVar2, j3, list, z, i6, list4, (s) obj3, t.L(i2 | 1), i3);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        list3 = list2;
        if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void e(r rVar, f.b.d dVar, s sVar, int i) {
        r rVar2;
        s sVar2;
        sVar.e0(-646140577);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.f(dVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            rVar2 = rVar;
            sVar2 = sVar;
            yg.r.a(rVar2, dVar.b, dVar.c, g.a(dVar.h.a), dVar.g, dVar.i, dVar.e, sVar2, i2 & 14, 0);
        } else {
            rVar2 = rVar;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(rVar2, dVar, i, 24);
        }
    }

    public static final void f(r rVar, s sVar, int i) {
        sVar.e0(-1233709442);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            yg.s.a(i2 & 14, 0, sVar, rVar);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new androidx.compose.foundation.layout.r(i, 11, rVar);
        }
    }

    public static final void g(r rVar, f.b.e eVar, s sVar, int i) {
        r rVar2;
        s sVar2;
        sVar.e0(-1301336931);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i | (sVar.f(eVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            rVar2 = rVar;
            sVar2 = sVar;
            yg.t.a(rVar2, eVar.b, eVar.c, eVar.d, eVar.g, eVar.e, sVar2, i2 & 14, 0);
        } else {
            rVar2 = rVar;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.r(rVar2, eVar, i, 25);
        }
    }

}
