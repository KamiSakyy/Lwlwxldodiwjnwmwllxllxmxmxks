package yg;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import f1.qa;
import f1.ub;
import g3.q0;
import g3.z;
import w61.a0;
import wy0.n6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, final boolean z, final j71.a aVar, final String str2, final d3.k kVar, j jVar, String str3, float f, j71.f fVar, j71.f fVar2, boolean z2, androidx.compose.runtime.s sVar, final int i, final int i2, final int i3) {
        w1.r rVar2;
        int i4;
        j jVar2;
        final String str4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        final float f2;
        final j71.f fVar3;
        final j71.f fVar4;
        final boolean z3;
        final w1.r rVar3;
        final j jVar3;
        b2 t;
        final float f3;
        w1.r rVar4;
        final j jVar4;
        final j71.f fVar5;
        final String str5;
        final j71.f fVar6;
        final boolean z4;
        long j;
        long j2;
        long j3;
        int i12;
        k71.k.g(aVar, "onClick");
        sVar.e0(-1837845736);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar.f(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= sVar.f(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                jVar2 = jVar;
                if (sVar.f(jVar2)) {
                    i12 = 1048576;
                    i4 |= i12;
                }
            } else {
                jVar2 = jVar;
            }
            i12 = 524288;
            i4 |= i12;
        } else {
            jVar2 = jVar;
        }
        int i14 = i3 & 128;
        if (i14 != 0) {
            i4 |= 12582912;
            str4 = str3;
        } else {
            str4 = str3;
            if ((i & 12582912) == 0) {
                i4 |= sVar.f(str4) ? 8388608 : 4194304;
            }
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= sVar.c(f) ? 67108864 : 33554432;
        }
        int i16 = i3 & 512;
        if (i16 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i16;
            i4 |= sVar.h(fVar) ? 536870912 : 268435456;
            i6 = i3 & 1024;
            if (i6 == 0) {
                i8 = i2 | 6;
                i7 = i6;
            } else if ((i2 & 6) == 0) {
                i7 = i6;
                i8 = i2 | (sVar.h(fVar2) ? 4 : 2);
            } else {
                i7 = i6;
                i8 = i2;
            }
            i9 = i3 & 2048;
            if (i9 == 0) {
                i8 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 = i9;
                i8 |= sVar.g(z2) ? 32 : 16;
                if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i8 & 19) != 18)) {
                    sVar.X();
                    if ((i & 1) == 0 || sVar.A()) {
                        w1.r rVar5 = i13 != 0 ? w1.o.a : rVar2;
                        j jVar5 = (i3 & 64) != 0 ? new j(null, null, null, null) : jVar2;
                        if (i14 != 0) {
                            str4 = null;
                        }
                        f3 = i15 != 0 ? ih.a.l : f;
                        j71.f fVar7 = i5 != 0 ? null : fVar;
                        rVar4 = rVar5;
                        jVar4 = jVar5;
                        fVar5 = i7 == 0 ? fVar2 : null;
                        str5 = str4;
                        fVar6 = fVar7;
                        z4 = i11 != 0 ? true : z2;
                    } else {
                        sVar.V();
                        f3 = f;
                        fVar6 = fVar;
                        fVar5 = fVar2;
                        z4 = z2;
                        jVar4 = jVar2;
                        rVar4 = rVar2;
                        str5 = str4;
                    }
                    sVar.r();
                    w1.r h = p2.h(rVar4, 28, 0.0f, 2);
                    k71.k.g(jVar4, "<this>");
                    Integer num = jVar4.a;
                    if (num != null) {
                        sVar.c0(73440406);
                        j2 = b91.g.l(num.intValue(), sVar);
                        sVar.q(false);
                    } else {
                        if (z) {
                            sVar.c0(-1383101256);
                            j = ih.d.b(sVar).o0;
                            sVar.q(false);
                        } else {
                            sVar.c0(-1383098982);
                            j = ih.d.b(sVar).k0;
                            sVar.q(false);
                        }
                        j2 = j;
                    }
                    r0.d dVar = ih.d.e(sVar).f;
                    Integer num2 = jVar4.c;
                    if (num2 != null) {
                        sVar.c0(1536697296);
                        j3 = b91.g.l(num2.intValue(), sVar);
                        sVar.q(false);
                    } else if (z) {
                        sVar.c0(1712141758);
                        j3 = ih.d.b(sVar).p0;
                        sVar.q(false);
                    } else {
                        sVar.c0(1712143904);
                        j3 = ih.d.b(sVar).l0;
                        sVar.q(false);
                    }
                    boolean z5 = z4;
                    j71.f fVar8 = fVar6;
                    j71.f fVar9 = fVar5;
                    qa.a(h, dVar, j2, 0L, 0.0f, 0.0f, f0.o.a(0.0f, j3), r1.i.d(761544947, new j71.e() { // from class: yg.l
                        public final Object s(Object obj, Object obj2) {
                            long j4;
                            boolean z6;
                            Integer num3;
                            boolean z7;
                            l lVar;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (sVar2.S(intValue & 1, (intValue & 3) != 2)) {
                                j71.a aVar2 = aVar;
                                boolean f4 = sVar2.f(aVar2);
                                Object N = sVar2.N();
                                androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                                Object obj3 = N;
                                if (f4 || N == iVar) {
                                    qd.g gVar = new qd.g(17, aVar2);
                                    sVar2.n0(gVar);
                                    obj3 = gVar;
                                }
                                w1.r m = f0.o.m(w1.o.a, z4, str2, kVar, (j71.a) obj3, 8);
                                Object N2 = sVar2.N();
                                if (N2 == iVar) {
                                    N2 = new n6(6);
                                    sVar2.n0(N2);
                                }
                                w1.r B = androidx.compose.foundation.layout.b.B(com.github.rudroid.uitoolkit.extensions.d.b(m, str5, (j71.e) N2), ih.a.l, 0.0f, f3, 0.0f, 10);
                                w1.i iVar2 = w1.c.B;
                                androidx.compose.foundation.layout.f fVar10 = androidx.compose.foundation.layout.l.a;
                                l2 a = j2.a(androidx.compose.foundation.layout.l.g(ih.a.k), iVar2, sVar2, 54);
                                int hashCode = Long.hashCode(sVar2.T);
                                v1 l = sVar2.l();
                                w1.r c = w1.a.c(sVar2, B);
                                v2.h.o.getClass();
                                v2.f fVar11 = v2.g.b;
                                sVar2.g0();
                                if (sVar2.S) {
                                    sVar2.k(fVar11);
                                } else {
                                    sVar2.q0();
                                }
                                androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                                androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                                androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                                androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                                j71.f fVar12 = fVar6;
                                boolean z8 = z;
                                if (fVar12 == null) {
                                    sVar2.c0(692875202);
                                } else {
                                    sVar2.c0(-2055859169);
                                    fVar12.f(Boolean.valueOf(z8), sVar2, 0);
                                }
                                sVar2.q(false);
                                String str6 = str;
                                if (str6 == null) {
                                    sVar2.c0(692920369);
                                    sVar2.q(false);
                                    lVar = this;
                                    z7 = false;
                                    num3 = 0;
                                    z6 = z8;
                                } else {
                                    sVar2.c0(692920370);
                                    q0 q0Var = ih.d.f(sVar2).r;
                                    Integer num4 = jVar4.b;
                                    if (num4 != null) {
                                        sVar2.c0(1498447613);
                                        j4 = b91.g.l(num4.intValue(), sVar2);
                                        sVar2.q(false);
                                    } else if (z8) {
                                        sVar2.c0(1433813169);
                                        j4 = ih.d.b(sVar2).q0;
                                        sVar2.q(false);
                                    } else {
                                        sVar2.c0(1433815251);
                                        j4 = ih.d.b(sVar2).m0;
                                        sVar2.q(false);
                                    }
                                    z6 = z8;
                                    num3 = 0;
                                    z7 = false;
                                    ub.b(str6, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 1, false, 1, 0, (j71.c) null, q0.a(q0Var, j4, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar2, 0, 24960, 110590);
                                    sVar2 = sVar2;
                                    sVar2.q(false);
                                    lVar = this;
                                }
                                j71.f fVar13 = fVar5;
                                if (fVar13 == null) {
                                    sVar2.c0(693289858);
                                } else {
                                    sVar2.c0(-2055845793);
                                    fVar13.f(Boolean.valueOf(z6), sVar2, num3);
                                }
                                sVar2.q(z7);
                                sVar2.q(true);
                            } else {
                                sVar2.V();
                            }
                            return a0.a;
                        }
                    }, sVar), sVar, 12582912, 56);
                    rVar3 = rVar4;
                    jVar3 = jVar4;
                    str4 = str5;
                    f2 = f3;
                    fVar3 = fVar8;
                    fVar4 = fVar9;
                    z3 = z5;
                } else {
                    sVar.V();
                    f2 = f;
                    fVar3 = fVar;
                    fVar4 = fVar2;
                    z3 = z2;
                    rVar3 = rVar2;
                    jVar3 = jVar2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: yg.m
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int L = androidx.compose.runtime.t.L(i | 1);
                            int L2 = androidx.compose.runtime.t.L(i2);
                            n.a(rVar3, str, z, aVar, str2, kVar, jVar3, str4, f2, fVar3, fVar4, z3, (androidx.compose.runtime.s) obj, L, L2, i3);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i9;
            if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i8 & 19) != 18)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        i5 = i16;
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i9 = i3 & 2048;
        if (i9 == 0) {
        }
        i11 = i9;
        if (sVar.S(i4 & 1, (i4 & 306783379) == 306783378 || (i8 & 19) != 18)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
