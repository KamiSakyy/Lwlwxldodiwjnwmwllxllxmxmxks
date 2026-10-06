package com.github.rudroid.uitoolkit.menu;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.sessionevents.ui.o2;
import com.github.rudroid.issueorpullrequest.mergebox.ui.e0;
import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.support.u;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.uitoolkit.listitems.h0;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.rudroid.widget.p;
import com.google.android.gms.internal.measurement.i4;
import d3.q;
import f0.o;
import f1.a6;
import f1.ub;
import g3.q0;
import g3.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sy.d0Shadow;
import w1.r;
import w61.a0;
import x61.t;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List list, j71.c cVar, String str, Set set, j71.c cVar2, s sVar, int i) {
        Set set2;
        j71.c cVar3;
        Set set3;
        j71.c cVar4;
        Object obj;
        ArrayList arrayList;
        int i2;
        String str2;
        List n;
        j71.c cVar5 = cVar;
        k71.k.g(list, "items");
        k71.k.g(cVar5, "onSelect");
        sVar.e0(-958142413);
        String str3 = str;
        int i3 = i | (sVar.h(list) ? 4 : 2) | (sVar.h(cVar5) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | 27648;
        int i4 = 1;
        if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            Object N = sVar.N();
            Object obj2 = n.a;
            if (N == obj2) {
                N = new u0(16);
                sVar.n0(N);
            }
            j71.c cVar6 = (j71.c) N;
            String p0 = i4.p0(2131954108, sVar);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                set3 = t.r;
                if (!hasNext) {
                    break;
                }
                d dVar = (d) it.next();
                if (dVar instanceof d.a) {
                    set3.getClass();
                    n = d0Shadow.n(dVar);
                } else {
                    n = d0Shadow.n(dVar);
                }
                x61.m.J(arrayList2, n);
            }
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList2.get(i6);
                int i7 = i6 + 1;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    d0Shadow.x();
                    throw null;
                }
                d dVar2 = (d) obj3;
                if (dVar2 instanceof d.b) {
                    sVar.c0(2094186940);
                    c((d.b) dVar2, i5 == 0 ? i4 : 0, sVar, 0, 0);
                    sVar.q(false);
                    cVar4 = cVar6;
                    obj = obj2;
                    arrayList = arrayList2;
                    i2 = size;
                } else if (dVar2 instanceof d.g) {
                    sVar.c0(760295231);
                    float f = i4;
                    i2 = size;
                    arrayList = arrayList2;
                    obj = obj2;
                    cVar4 = cVar6;
                    k0.a(null, 0L, 0L, f, false, sVar, 3072, 23);
                    sVar.q(false);
                } else {
                    cVar4 = cVar6;
                    obj = obj2;
                    arrayList = arrayList2;
                    i2 = size;
                    if (dVar2 instanceof d.e) {
                        sVar.c0(760297343);
                        k0.a(null, 0L, 0L, 8, false, sVar, 3072, 23);
                        sVar.q(false);
                    } else if (dVar2 instanceof d.f) {
                        sVar.c0(2094452207);
                        k0.a(null, 0L, ih.d.b(sVar).a, ih.a.l, false, sVar, 3072, 19);
                        sVar.q(false);
                    } else {
                        if (dVar2 instanceof d.C0009d) {
                            sVar.c0(2094626458);
                            String str4 = p0;
                            e((d.C0009d) dVar2, cVar5, str3, str4, sVar, i3 & 1008);
                            str2 = str4;
                            sVar.q(false);
                        } else {
                            str2 = p0;
                            if (dVar2 instanceof d.c) {
                                sVar.c0(2094911131);
                                d((d.c) dVar2, sVar, 0);
                                sVar.q(false);
                            } else {
                                if (!(dVar2 instanceof d.a)) {
                                    throw f1.e.r(760290939, sVar, false);
                                }
                                sVar.c0(2095042943);
                                boolean h = sVar.h(dVar2);
                                Object N2 = sVar.N();
                                if (h || N2 == obj) {
                                    N2 = new com.github.rudroid.discussions.ui.cShadow(cVar4, (d.a) dVar2);
                                    sVar.n0(N2);
                                }
                                r m = o.m(w1.o.a, false, (String) null, (d3.k) null, (j71.a) N2, 15);
                                boolean z = i5 == 0;
                                set3.getClass();
                                b(m, null, false, z, sVar, 0);
                                sVar.q(false);
                            }
                        }
                        cVar5 = cVar;
                        str3 = str;
                        obj2 = obj;
                        p0 = str2;
                        cVar6 = cVar4;
                        i6 = i7;
                        i5 = i8;
                        size = i2;
                        arrayList2 = arrayList;
                        i4 = 1;
                    }
                }
                str2 = p0;
                cVar5 = cVar;
                str3 = str;
                obj2 = obj;
                p0 = str2;
                cVar6 = cVar4;
                i6 = i7;
                i5 = i8;
                size = i2;
                arrayList2 = arrayList;
                i4 = 1;
            }
            cVar3 = cVar6;
            set2 = set3;
        } else {
            sVar.V();
            set2 = set;
            cVar3 = cVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.j(list, cVar, str, set2, cVar3, i, 18);
        }
    }

    public static final void b(r rVar, String str, boolean z, boolean z2, s sVar, int i) {
        String str2;
        s sVar2 = sVar;
        sVar2.e0(2106391491);
        int i2 = (sVar2.f(rVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= sVar2.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar2.g(z2) ? 2048 : 1024;
        }
        if (sVar2.S(i2 & 1, (i2 & 1171) != 1170)) {
            float f = ih.a.n;
            r B = androidx.compose.foundation.layout.b.B(rVar, 0.0f, 0.0f, f, 0.0f, 11);
            l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, B);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            androidx.compose.runtime.t.E(sVar2, v2.g.h);
            androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
            float f2 = z2 ? ih.a.l : ih.a.m;
            float f3 = ih.a.l;
            w1.o oVar = w1.o.a;
            r A = androidx.compose.foundation.layout.b.A(oVar, f, f2, f, f3);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            ub.b(str2, A.f(new w1(1.0f, true)), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).l, sVar, i3 & 14, 0, 131068);
            sVar2 = sVar;
            h0.a(p2.o(oVar, 24), z, 0.0f, 90.0f, null, 0L, 2131231483, sVar2, (i3 & 112) | 3462, 48);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new f(rVar, str, z, z2, i);
        }
    }

    public static final void c(d.b bVar, boolean z, s sVar, int i, int i2) {
        boolean z2;
        int i3;
        sVar.e0(-1570899564);
        int i4 = i | (sVar.f(bVar) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (sVar.g(z2) ? 32 : 16);
        }
        if (sVar.S(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i5 != 0 ? false : z2;
            sVar.c0(-2100953876);
            long j = bVar.b;
            if (j == 16) {
                j = ih.d.b(sVar).v;
            }
            long j2 = j;
            sVar.q(false);
            float f = ih.a.n;
            ub.b(bVar.a, androidx.compose.foundation.layout.b.A(w1.o.a, f, z3 ? ih.a.l : ih.a.m, f, ih.a.l), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).v, j2, t1.C(14), k3.s.w, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777208), sVar, 0, 0, 131068);
            z2 = z3;
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new o2(bVar, z2, i, i2);
        }
    }

    public static final void d(final d.c cVar, s sVar, int i) {
        d.c cVar2;
        sVar.e0(1755406251);
        int i2 = (sVar.f(cVar) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            sVar.c0(-976737138);
            long j = cVar.f;
            if (j == 16) {
                j = ih.d.b(sVar).s;
            }
            sVar.q(false);
            sVar.c0(-976733648);
            long j2 = cVar.g;
            if (j2 == 16) {
                j2 = ih.d.b(sVar).t;
            }
            sVar.q(false);
            sVar.c0(-976730288);
            long j3 = cVar.e;
            if (j3 == 16) {
                j3 = ih.d.b(sVar).A;
            }
            sVar.q(false);
            r B = androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, 0.0f, 0.0f, cVar.i, 7);
            boolean z = (i2 & 14) == 4;
            Object N = sVar.N();
            Object obj = n.a;
            if (z || N == obj) {
                N = new u(3, cVar);
                sVar.n0(N);
            }
            r a = q.a(B, (j71.c) N);
            final long j4 = j;
            final long j5 = j2;
            final long j6 = j3;
            cVar2 = cVar;
            r1.d d = r1.i.d(-683859493, new j71.e() { // from class: com.github.rudroid.uitoolkit.menu.g
                public final Object s(Object obj2, Object obj3) {
                    s sVar2 = (s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (sVar2.S(intValue & 1, (intValue & 3) != 2)) {
                        d.c cVar3 = d.c.this;
                        com.github.rudroid.uitoolkit.text.k.b(null, cVar3.d, androidx.compose.foundation.layout.b.f(ih.a.n, ih.a.k, 0.0f, 0.0f, 12), j6, w1.c.A, null, r1.i.d(1495905290, new e(cVar3, j4, j5, 0), sVar2), sVar2, 1597824, 33);
                    } else {
                        sVar2.V();
                    }
                    return a0.a;
                }
            }, sVar);
            Object N2 = sVar.N();
            if (N2 == obj) {
                N2 = new p(15);
                sVar.n0(N2);
            }
            f1.p.b(d, (j71.a) N2, a, false, (a6) null, (d2) null, sVar, 196662, 472);
        } else {
            cVar2 = cVar;
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new e0(cVar2, i, 11);
        }
    }

    public static final void e(d.C0009d c0009d, j71.c cVar, String str, String str2, s sVar, int i) {
        int i2;
        sVar.e0(1645844440);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? sVar.f(c0009d) : sVar.h(c0009d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(str2) ? 2048 : 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 896) == 256) | (i3 == 4 || ((i2 & 8) != 0 && sVar.h(c0009d))) | ((i2 & 7168) == 2048);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = n.a;
            if (z || N == iVar) {
                N = new c6.b(c0009d, str, str2, 26);
                sVar.n0(N);
            }
            r b = q.b(w1.o.a, true, (j71.c) N);
            boolean z2 = c0009d.i;
            r1.d d = r1.i.d(348846600, new com.github.rudroid.settings.copilot.debug.q((Object) c0009d, (Object) str, false, 9), sVar);
            boolean z3 = ((i2 & 112) == 32) | (i3 == 4 || ((i2 & 8) != 0 && sVar.h(c0009d)));
            Object N2 = sVar.N();
            if (z3 || N2 == iVar) {
                N2 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(26, cVar, c0009d);
                sVar.n0(N2);
            }
            f1.p.b(d, (j71.a) N2, b, z2, (a6) null, (d2) null, sVar, 6, 472);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.a(c0009d, cVar, str, str2, i, 10);
        }
    }

}
