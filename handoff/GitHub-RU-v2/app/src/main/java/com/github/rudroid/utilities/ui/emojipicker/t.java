package com.github.rudroid.utilities.ui.emojipicker;

import a0.n1;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.profile.status.ui.x;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.uitoolkit.markdown.components.v;
import com.github.rudroid.utilities.g0;
import com.github.rudroid.y;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import h0.h1Shadow;
import kotlin.NoWhenBranchMatchedException;
import n0.b0;
import n0.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(y yVar, boolean z, j71.c cVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        d2.l lVar;
        sVar.e0(1069542146);
        int i3 = i | (sVar.d(yVar.ordinal()) ? 4 : 2) | (sVar.g(z) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            w1.r o = p2.o(w1.o.a, 48);
            d3.k kVar = new d3.k(4);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object N = sVar.N();
            if (z2 || N == androidx.compose.runtime.n.a) {
                N = new c(0, cVar, yVar);
                sVar.n0(N);
            }
            w1.r b = q0.c.b(o, z, kVar, (j71.a) N);
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, b);
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
            w61.p pVar = u.a;
            k71.k.g(yVar, "<this>");
            switch (yVar.ordinal()) {
                case 0:
                    i2 = 2131231362;
                    break;
                case 1:
                    i2 = 2131231449;
                    break;
                case 2:
                    i2 = 2131231474;
                    break;
                case 3:
                    i2 = 2131231454;
                    break;
                case 4:
                    i2 = 2131231274;
                    break;
                case 5:
                    i2 = 2131231147;
                    break;
                case 6:
                    i2 = 2131231485;
                    break;
                case 7:
                    i2 = 2131231216;
                    break;
                case 8:
                    i2 = 2131231305;
                    break;
                case 9:
                    i2 = 2131231138;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            i2.b C = z3.C(i2, 0, sVar);
            if (z) {
                sVar.c0(-2109077037);
                lVar = new d2.l(5, ih.d.b(sVar).F);
                sVar.q(false);
            } else {
                sVar.c0(-2108988532);
                lVar = new d2.l(5, ih.d.b(sVar).z);
                sVar.q(false);
            }
            f0.o.c(C, i4.q0(2131953749, new Object[]{i4.p0(u.a(yVar), sVar)}, sVar), (w1.r) null, (w1.e) null, (androidx.compose.ui.layout.i) null, 0.0f, lVar, sVar, 8, 60);
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkssummary.ui.p(yVar, z, cVar, i, 11);
        }
    }

    public static final void b(String str, j71.c cVar, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        int i2;
        sVar.e0(1928820608);
        if ((i & 6) == 0) {
            i2 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            w1.r o = p2.o(w1.o.a, 48);
            String p0 = i4.p0(2131953748, sVar);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object N = sVar.N();
            if (z || N == androidx.compose.runtime.n.a) {
                N = new c(1, cVar, str);
                sVar.n0(N);
            }
            w1.r m = f0.o.m(o, false, p0, (d3.k) null, (j71.a) N, 13);
            int i3 = ((i2 << 3) & 7168) | 48;
            v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            w1.r c = w1.a.c(sVar, m);
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
            dVar.f(androidx.compose.foundation.layout.y.a, sVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            sVar.q(true);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(str, cVar, dVar, i, 4);
        }
    }

    public static final void c(String str, String str2, j71.c cVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(75869601);
        int i2 = (sVar.f(str) ? 4 : 2) | i | (sVar.f(str2) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            b(str2, cVar, r1.i.d(884726592, new ab.m(str, 13), sVar), sVar, (i3 & 112) | (i3 & 14) | 384);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new x(str, str2, cVar, i, 17);
        }
    }

    public static final void d(final j71.c cVar, j71.a aVar, w1.r rVar, androidx.compose.runtime.s sVar, int i) {
        j71.a aVar2;
        androidx.compose.runtime.s sVar2;
        k71.k.g(cVar, "onEmojiClick");
        k71.k.g(aVar, "onDismiss");
        sVar.e0(1886260221);
        int i2 = (sVar.h(cVar) ? 4 : 2) | i | 384;
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = androidx.compose.runtime.t.B(y.r);
                sVar.n0(N);
            }
            final f1 f1Var = (f1) N;
            r1.d d = r1.i.d(-802512086, new j71.f() { // from class: com.github.rudroid.utilities.ui.emojipicker.g
                public final Object f(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g((f0) obj, "$this$PrimaryDialog");
                    if (sVar3.S(intValue & 1, (intValue & 17) != 16)) {
                        z a = b0.a(0, 3, sVar3);
                        boolean f = sVar3.f(a);
                        Object N2 = sVar3.N();
                        f1 f1Var2 = f1Var;
                        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                        if (f || N2 == iVar) {
                            N2 = new i(a, f1Var2, null);
                            sVar3.n0(N2);
                        }
                        androidx.compose.runtime.t.f(sVar3, (j71.e) N2, a);
                        Object N3 = sVar3.N();
                        if (N3 == iVar) {
                            N3 = androidx.compose.runtime.t.p(sVar3);
                            sVar3.n0(N3);
                        }
                        v71.z zVar = (v71.z) N3;
                        w1.r c = p2.c(w1.o.a, 0.75f);
                        e0 a2 = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar3, 0);
                        int hashCode = Long.hashCode(sVar3.T);
                        v1 l = sVar3.l();
                        w1.r c2 = w1.a.c(sVar3, c);
                        v2.h.o.getClass();
                        v2.f fVar = v2.g.b;
                        sVar3.g0();
                        if (sVar3.S) {
                            sVar3.k(fVar);
                        } else {
                            sVar3.q0();
                        }
                        androidx.compose.runtime.t.I(sVar3, v2.g.f, a2);
                        androidx.compose.runtime.t.I(sVar3, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar3, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar3, v2.g.h);
                        androidx.compose.runtime.t.I(sVar3, v2.g.d, c2);
                        androidx.compose.foundation.layout.j g = androidx.compose.foundation.layout.l.g(0);
                        boolean h = sVar3.h(zVar) | sVar3.f(a);
                        Object N4 = sVar3.N();
                        Object obj4 = N4;
                        if (h || N4 == iVar) {
                            c6.b bVar = new c6.b(zVar, a, f1Var2, 27);
                            sVar3.n0(bVar);
                            obj4 = bVar;
                        }
                        ah.h.a(null, 0L, 0.0f, false, g, null, (j71.c) obj4, sVar3, 24576, 47);
                        k0.a(null, 0L, 0L, 0.0f, false, sVar3, 0, 31);
                        n0.a aVar3 = new n0.a(48);
                        j71.c cVar2 = cVar;
                        boolean f2 = sVar3.f(cVar2);
                        Object N5 = sVar3.N();
                        Object obj5 = N5;
                        if (f2 || N5 == iVar) {
                            n1 n1Var = new n1(17, cVar2);
                            sVar3.n0(n1Var);
                            obj5 = n1Var;
                        }
                        aa1.b.a(aVar3, (w1.r) null, a, (d2) null, (androidx.compose.foundation.layout.k) null, (androidx.compose.foundation.layout.i) null, (h1Shadow) null, false, (f0.j) null, (j71.c) obj5, sVar3, 0, 1018);
                        sVar3.q(true);
                    } else {
                        sVar3.V();
                    }
                    return a0.a;
                }
            }, sVar);
            w1.r rVar2 = w1.o.a;
            aVar2 = aVar;
            sVar2 = sVar;
            xg.t.a(rVar2, aVar2, d, sVar2, 438, 0);
            rVar = rVar2;
        } else {
            aVar2 = aVar;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new x(cVar, aVar2, rVar, i);
        }
    }

    public static final void e(final String str, final j71.c cVar, androidx.compose.runtime.s sVar, final int i) {
        sVar.e0(1865144924);
        int i2 = (sVar.f(str) ? 4 : 2) | i | (sVar.h(cVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            b(str, cVar, r1.i.d(1891237085, new d(1, g0.a(":" + str + ":")), sVar), sVar, (i2 & 112) | (i2 & 14) | 384);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e(i, cVar, str) { // from class: com.github.rudroid.utilities.ui.emojipicker.f
                public final /* synthetic */ String r;
                public final /* synthetic */ j71.c s;

                {
                    this.r = str;
                    this.s = cVar;
                }

                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(1);
                    t.e(this.r, this.s, (androidx.compose.runtime.s) obj, L);
                    return a0.a;
                }
            };
        }
    }
    public Object J(Object p1) { return null; }
}
