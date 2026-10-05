package gh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import f1.ub;
import g3.q0;
import g3.z;
import k71.k;
import sg.j0;
import w1.o;
import w1.r;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if (r6 == androidx.compose.runtime.n.a) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, boolean z, j71.a aVar, boolean z2, r1.d dVar, s sVar, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        b2 t;
        Object obj;
        k.g(aVar, "onToggle");
        sVar.e0(-2147101642);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= sVar.g(z3) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= sVar.h(dVar) ? 16384 : 8192;
            }
            if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
                sVar.V();
                z4 = z3;
            } else {
                boolean z5 = i4 != 0 ? true : z3;
                d3.k kVar = new d3.k(3);
                boolean z6 = (i3 & 896) == 256;
                Object N = sVar.N();
                if (!z6) {
                    obj = N;
                }
                com.github.rudroid.agents.base.g gVar = new com.github.rudroid.agents.base.g(13, aVar);
                sVar.n0(gVar);
                obj = gVar;
                o oVar = o.a;
                r f = q0.c.e(oVar, z, z5, kVar, (j71.c) obj, 8).f(rVar);
                l2 a = j2.a(l.a, w1.c.B, sVar, 48);
                int hashCode = Long.hashCode(sVar.T);
                v1 l = sVar.l();
                r c = w1.a.c(sVar, f);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar.g0();
                if (sVar.S) {
                    sVar.k(fVar);
                } else {
                    sVar.q0();
                }
                t.I(sVar, v2.g.f, a);
                t.I(sVar, v2.g.e, l);
                t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                t.E(sVar, v2.g.h);
                t.I(sVar, v2.g.d, c);
                dVar.f(n2.a, sVar, Integer.valueOf(((i3 >> 9) & 112) | 6));
                androidx.compose.foundation.layout.b.g(sVar, p2.s(oVar, ih.a.n));
                j0.a(null, z, z5, null, null, sVar, (i3 & 112) | ((i3 >> 3) & 896), 25);
                sVar.q(true);
                z4 = z5;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.uitoolkit.d(rVar, z, aVar, z4, dVar, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final r rVar, final f fVar, final boolean z, q0 q0Var, q0 q0Var2, boolean z2, final j71.a aVar, long j, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        q0 q0Var3;
        q0 q0Var4;
        boolean z3;
        final q0 q0Var5;
        final boolean z4;
        final long j2;
        final q0 q0Var6;
        b2 t;
        int i4;
        final long j3;
        int i5;
        int i6;
        k.g(aVar, "onToggle");
        sVar.e0(527072824);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                q0Var3 = q0Var;
                if (sVar.f(q0Var3)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                q0Var3 = q0Var;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            q0Var3 = q0Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                q0Var4 = q0Var2;
                if (sVar.f(q0Var4)) {
                    i5 = 16384;
                    i3 |= i5;
                }
            } else {
                q0Var4 = q0Var2;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            q0Var4 = q0Var2;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z3 = z2;
            i3 |= sVar.g(z3) ? 131072 : 65536;
            if ((1572864 & i) == 0) {
                i3 |= sVar.h(aVar) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            if (sVar.S(i3 & 1, (4793491 & i3) == 4793490)) {
                sVar.V();
                q0Var5 = q0Var4;
                z4 = z3;
                j2 = j;
                q0Var6 = q0Var3;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    if ((i2 & 8) != 0) {
                        q0Var3 = ih.d.f(sVar).p;
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        q0Var4 = q0.a(ih.d.f(sVar).l, 0L, t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213);
                        i3 &= -57345;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    i4 = i3 & (-29360129);
                    j3 = ih.d.b(sVar).s;
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3 & (-29360129);
                    j3 = j;
                }
                final q0 q0Var7 = q0Var3;
                final q0 q0Var8 = q0Var4;
                final boolean z5 = z3;
                sVar.r();
                a(rVar2, z, aVar, z5, r1.i.d(1662808656, new j71.f() { // from class: gh.g
                    public final Object f(Object obj, Object obj2, Object obj3) {
                        boolean z6;
                        m2 m2Var = (m2) obj;
                        s sVar2 = (s) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        k.g(m2Var, "$this$SelectableOptionRow");
                        if ((intValue & 6) == 0) {
                            intValue |= sVar2.f(m2Var) ? 4 : 2;
                        }
                        if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                            boolean z7 = z5;
                            long j4 = j3;
                            if (!z7) {
                                j4 = d2.t.b(0.38f, j4);
                            }
                            r a = m2Var.a(o.a, 1.0f, true);
                            e0 a2 = c0.a(l.c, w1.c.D, sVar2, 0);
                            int hashCode = Long.hashCode(sVar2.T);
                            v1 l = sVar2.l();
                            r c = w1.a.c(sVar2, a);
                            v2.h.o.getClass();
                            v2.f fVar2 = v2.g.b;
                            sVar2.g0();
                            if (sVar2.S) {
                                sVar2.k(fVar2);
                            } else {
                                sVar2.q0();
                            }
                            t.I(sVar2, v2.g.f, a2);
                            t.I(sVar2, v2.g.e, l);
                            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                            t.E(sVar2, v2.g.h);
                            t.I(sVar2, v2.g.d, c);
                            f fVar3 = fVar;
                            ub.b(fVar3.b, (r) null, j4, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var7, sVar2, 0, 0, 131066);
                            s sVar3 = sVar2;
                            if (fVar3.c.length() > 0) {
                                sVar3.c0(-1156886207);
                                ub.b(fVar3.c, (r) null, j4, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var8, sVar3, 0, 0, 131066);
                                sVar3 = sVar3;
                                z6 = false;
                            } else {
                                z6 = false;
                                sVar3.c0(-1159065476);
                            }
                            sVar3.q(z6);
                            sVar3.q(true);
                        } else {
                            sVar2.V();
                        }
                        return a0.a;
                    }
                }, sVar), sVar, (i4 & 14) | 24576 | ((i4 >> 3) & 112) | ((i4 >> 12) & 896) | ((i4 >> 6) & 7168), 0);
                z4 = z5;
                j2 = j3;
                q0Var6 = q0Var7;
                q0Var5 = q0Var8;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: gh.h
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i.b(rVar, fVar, z, q0Var6, q0Var5, z4, aVar, j2, (s) obj, t.L(i | 1), i2);
                        return a0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (sVar.S(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }


}
