package qg;

import androidx.compose.foundation.layout.b3;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.q0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.achievements.ui.b0;
import com.github.rudroid.agents.copilothome.ui.w;
import com.github.rudroid.utilities.k1;
import d2.a0;
import f0.v;
import f1.g2;
import f1.qa;
import f1.ub;
import f1.y1;
import f1.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public static final float a;
    public static final float b;
    public static final w1.r c;

    static {
        float f = 4;
        a = f;
        b = f;
        c = p2.s(w1.o.a, 16 - f);
    }

    public static final void a(final w1.r rVar, b3 b3Var, final long j, final long j2, final float f, final f2 f2Var, final r1.d dVar, androidx.compose.runtime.s sVar, final int i) {
        int i2;
        final b3 b3Var2;
        b3 q0Var;
        int i3;
        sVar.e0(-753182470);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.c(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.f(f2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= sVar.h(dVar) ? 1048576 : 524288;
        }
        if (sVar.S(i2 & 1, (599187 & i2) != 599186)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                float f2 = 0;
                q0Var = new q0(f2, f2, f2, f2);
                i3 = i2 & (-113);
            } else {
                sVar.V();
                i3 = i2 & (-113);
                q0Var = b3Var;
            }
            sVar.r();
            qa.a(rVar, a0.b, j, j2, 0.0f, f, (v) null, r1.i.d(-664640427, new hf.f(q0Var, f2Var, dVar, 4), sVar), sVar, (i3 & 14) | 12582960 | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 80);
            b3Var2 = q0Var;
        } else {
            sVar.V();
            b3Var2 = b3Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: qg.o
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.a(rVar, b3Var2, j, j2, f, f2Var, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1));
                    return w61.a0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, long j, final j71.a aVar, int i, int i2, float f, float f2, j71.f fVar, final j71.e eVar, androidx.compose.runtime.s sVar, final int i3, final int i4) {
        w1.r rVar2;
        int i5;
        long j2;
        int i6;
        int i7;
        float f3;
        int i8;
        final float f4;
        int i9;
        int i11;
        final w1.r rVar3;
        final long j3;
        final int i12;
        final float f5;
        final j71.f fVar2;
        final float f6;
        final int i13;
        b2 t;
        final j71.f fVar3;
        int i14;
        w1.r rVar4;
        int i15;
        float f7;
        long j4;
        final r1.d dVar;
        int i16;
        int i17;
        int i18;
        k71.k.g(eVar, "text");
        sVar.e0(-325227468);
        int i19 = i4 & 1;
        if (i19 != 0) {
            i5 = i3 | 6;
            rVar2 = rVar;
        } else if ((i3 & 6) == 0) {
            rVar2 = rVar;
            i5 = (sVar.f(rVar2) ? 4 : 2) | i3;
        } else {
            rVar2 = rVar;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i4 & 2) == 0) {
                j2 = j;
                if (sVar.e(j2)) {
                    i18 = 32;
                    i5 |= i18;
                }
            } else {
                j2 = j;
            }
            i18 = 16;
            i5 |= i18;
        } else {
            j2 = j;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                i6 = i;
                if (sVar.d(i6)) {
                    i17 = 2048;
                    i5 |= i17;
                }
            } else {
                i6 = i;
            }
            i17 = 1024;
            i5 |= i17;
        } else {
            i6 = i;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                i7 = i2;
                if (sVar.d(i7)) {
                    i16 = 16384;
                    i5 |= i16;
                }
            } else {
                i7 = i2;
            }
            i16 = 8192;
            i5 |= i16;
        } else {
            i7 = i2;
        }
        int i21 = i4 & 32;
        if (i21 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            f3 = f;
            i5 |= sVar.c(f3) ? 131072 : 65536;
            i8 = i4 & 64;
            if (i8 == 0) {
                i5 |= 1572864;
                f4 = f2;
            } else {
                f4 = f2;
                if ((i3 & 1572864) == 0) {
                    i5 |= sVar.c(f4) ? 1048576 : 524288;
                }
            }
            i9 = i4 & 128;
            if (i9 == 0) {
                i5 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i11 = i9;
                i5 |= sVar.h(fVar) ? 8388608 : 4194304;
                if ((i3 & 100663296) == 0) {
                    i5 |= sVar.h(eVar) ? 67108864 : 33554432;
                }
                if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
                    sVar.X();
                    if ((i3 & 1) == 0 || sVar.A()) {
                        if (i19 != 0) {
                            rVar2 = w1.o.a;
                        }
                        if ((i4 & 2) != 0) {
                            j2 = ih.d.b(sVar).b;
                            i5 &= -113;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                            i6 = 2131231114;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                            i7 = 2131953801;
                        }
                        if (i21 != 0) {
                            f3 = a;
                        }
                        if (i8 != 0) {
                            f4 = 0;
                        }
                        if (i11 != 0) {
                            w1.r rVar5 = rVar2;
                            fVar3 = c.a;
                            i14 = i6;
                            rVar4 = rVar5;
                            i15 = i7;
                            f7 = f3;
                            j4 = j2;
                            sVar.r();
                            if (aVar != null) {
                                sVar.c0(595297933);
                                sVar.q(false);
                                dVar = null;
                            } else {
                                sVar.c0(595297934);
                                r1.d d = r1.i.d(-569743907, new com.github.rudroid.agents.agenttasks.c(aVar, i14, i15, 10), sVar);
                                sVar.q(false);
                                dVar = d;
                            }
                            a(rVar4, null, j4, z1.b(j4, sVar), f7, androidx.compose.foundation.layout.b.d(2, b), r1.i.d(1871169989, new j71.f() { // from class: qg.m
                                public final Object f(Object obj, Object obj2, Object obj3) {
                                    m2 m2Var = (m2) obj;
                                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    float f8 = p.a;
                                    w1.i iVar = w1.c.B;
                                    k71.k.g(m2Var, "$this$CustomHeightTopBar");
                                    int i22 = 2;
                                    if ((intValue & 6) == 0) {
                                        intValue |= sVar2.f(m2Var) ? 4 : 2;
                                    }
                                    if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                                        w1.o oVar = w1.o.a;
                                        j71.e eVar2 = dVar;
                                        if (eVar2 == null) {
                                            sVar2.c0(-355353144);
                                            androidx.compose.foundation.layout.b.g(sVar2, p.c);
                                            sVar2.q(false);
                                        } else {
                                            sVar2.c0(-355282216);
                                            w1.r z = androidx.compose.foundation.layout.b.z(p2.w(oVar, 3), p.b, 0.0f, 2);
                                            l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, iVar, sVar2, 48);
                                            int hashCode = Long.hashCode(sVar2.T);
                                            v1 l = sVar2.l();
                                            w1.r c2 = w1.a.c(sVar2, z);
                                            v2.h.o.getClass();
                                            v2.f fVar4 = v2.g.b;
                                            sVar2.g0();
                                            if (sVar2.S) {
                                                sVar2.k(fVar4);
                                            } else {
                                                sVar2.q0();
                                            }
                                            androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
                                            androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                                            androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                                            androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                            androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
                                            androidx.compose.runtime.t.a(f1.e.f(((y1) sVar2.j(z1.a)).q, g2.a), eVar2, sVar2, 8);
                                            sVar2.q(true);
                                            sVar2.q(false);
                                        }
                                        w1.r u = androidx.compose.foundation.layout.b.u(m2Var.a(p2.u(oVar), 1.0f, true), f4);
                                        l2 a3 = j2.a(androidx.compose.foundation.layout.l.a, iVar, sVar2, 48);
                                        int hashCode2 = Long.hashCode(sVar2.T);
                                        v1 l2 = sVar2.l();
                                        w1.r c3 = w1.a.c(sVar2, u);
                                        v2.h.o.getClass();
                                        v2.f fVar5 = v2.g.b;
                                        sVar2.g0();
                                        if (sVar2.S) {
                                            sVar2.k(fVar5);
                                        } else {
                                            sVar2.q0();
                                        }
                                        androidx.compose.runtime.t.I(sVar2, v2.g.f, a3);
                                        androidx.compose.runtime.t.I(sVar2, v2.g.e, l2);
                                        androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode2), v2.g.g);
                                        androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                        androidx.compose.runtime.t.I(sVar2, v2.g.d, c3);
                                        ub.a(ih.d.f(sVar2).C, r1.i.d(-2067709744, new k1(i22, eVar), sVar2), sVar2, 48);
                                        sVar2.q(true);
                                        androidx.compose.runtime.t.a(f1.e.f(((y1) sVar2.j(z1.a)).s, g2.a), r1.i.d(759401733, new d6.c(fVar3, 1), sVar2), sVar2, 56);
                                    } else {
                                        sVar2.V();
                                    }
                                    return w61.a0.a;
                                }
                            }, sVar), sVar, 1769472 | (i5 & 14) | ((i5 << 3) & 896) | (57344 & (i5 >> 3)));
                            f6 = f4;
                            fVar2 = fVar3;
                            f5 = f7;
                            i13 = i14;
                            i12 = i15;
                            rVar3 = rVar4;
                            j3 = j4;
                        }
                    } else {
                        sVar.V();
                        if ((i4 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                    }
                    i14 = i6;
                    i15 = i7;
                    f7 = f3;
                    rVar4 = rVar2;
                    j4 = j2;
                    fVar3 = fVar;
                    sVar.r();
                    if (aVar != null) {
                    }
                    a(rVar4, null, j4, z1.b(j4, sVar), f7, androidx.compose.foundation.layout.b.d(2, b), r1.i.d(1871169989, new j71.f() { // from class: qg.m
                        public final Object f(Object obj, Object obj2, Object obj3) {
                            m2 m2Var = (m2) obj;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            float f8 = p.a;
                            w1.i iVar = w1.c.B;
                            k71.k.g(m2Var, "$this$CustomHeightTopBar");
                            int i22 = 2;
                            if ((intValue & 6) == 0) {
                                intValue |= sVar2.f(m2Var) ? 4 : 2;
                            }
                            if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                                w1.o oVar = w1.o.a;
                                j71.e eVar2 = dVar;
                                if (eVar2 == null) {
                                    sVar2.c0(-355353144);
                                    androidx.compose.foundation.layout.b.g(sVar2, p.c);
                                    sVar2.q(false);
                                } else {
                                    sVar2.c0(-355282216);
                                    w1.r z = androidx.compose.foundation.layout.b.z(p2.w(oVar, 3), p.b, 0.0f, 2);
                                    l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, iVar, sVar2, 48);
                                    int hashCode = Long.hashCode(sVar2.T);
                                    v1 l = sVar2.l();
                                    w1.r c2 = w1.a.c(sVar2, z);
                                    v2.h.o.getClass();
                                    v2.f fVar4 = v2.g.b;
                                    sVar2.g0();
                                    if (sVar2.S) {
                                        sVar2.k(fVar4);
                                    } else {
                                        sVar2.q0();
                                    }
                                    androidx.compose.runtime.t.I(sVar2, v2.g.f, a2);
                                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
                                    androidx.compose.runtime.t.a(f1.e.f(((y1) sVar2.j(z1.a)).q, g2.a), eVar2, sVar2, 8);
                                    sVar2.q(true);
                                    sVar2.q(false);
                                }
                                w1.r u = androidx.compose.foundation.layout.b.u(m2Var.a(p2.u(oVar), 1.0f, true), f4);
                                l2 a3 = j2.a(androidx.compose.foundation.layout.l.a, iVar, sVar2, 48);
                                int hashCode2 = Long.hashCode(sVar2.T);
                                v1 l2 = sVar2.l();
                                w1.r c3 = w1.a.c(sVar2, u);
                                v2.h.o.getClass();
                                v2.f fVar5 = v2.g.b;
                                sVar2.g0();
                                if (sVar2.S) {
                                    sVar2.k(fVar5);
                                } else {
                                    sVar2.q0();
                                }
                                androidx.compose.runtime.t.I(sVar2, v2.g.f, a3);
                                androidx.compose.runtime.t.I(sVar2, v2.g.e, l2);
                                androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode2), v2.g.g);
                                androidx.compose.runtime.t.E(sVar2, v2.g.h);
                                androidx.compose.runtime.t.I(sVar2, v2.g.d, c3);
                                ub.a(ih.d.f(sVar2).C, r1.i.d(-2067709744, new k1(i22, eVar), sVar2), sVar2, 48);
                                sVar2.q(true);
                                androidx.compose.runtime.t.a(f1.e.f(((y1) sVar2.j(z1.a)).s, g2.a), r1.i.d(759401733, new d6.c(fVar3, 1), sVar2), sVar2, 56);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, 1769472 | (i5 & 14) | ((i5 << 3) & 896) | (57344 & (i5 >> 3)));
                    f6 = f4;
                    fVar2 = fVar3;
                    f5 = f7;
                    i13 = i14;
                    i12 = i15;
                    rVar3 = rVar4;
                    j3 = j4;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    j3 = j2;
                    i12 = i7;
                    f5 = f3;
                    fVar2 = fVar;
                    f6 = f4;
                    i13 = i6;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: qg.n
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.b(rVar3, j3, aVar, i13, i12, f5, f6, fVar2, eVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i9;
            if ((i3 & 100663296) == 0) {
            }
            if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        f3 = f;
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i11 = i9;
        if ((i3 & 100663296) == 0) {
        }
        if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, final String str, String str2, long j, j71.a aVar, int i, float f, float f2, int i2, int i3, j71.f fVar, androidx.compose.runtime.s sVar, final int i4, final int i5, final int i6) {
        w1.r rVar2;
        int i7;
        String str3;
        long j2;
        int i8;
        j71.a aVar2;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        final int i15;
        final int i16;
        final w1.r rVar3;
        final String str4;
        final long j3;
        final j71.a aVar3;
        final int i17;
        final float f3;
        final float f4;
        final j71.f fVar2;
        b2 t;
        w1.r rVar4;
        j71.a aVar4;
        int i18;
        int i19;
        float f5;
        float f6;
        long j4;
        j71.f fVar3;
        int i21;
        long j5;
        int i22;
        k71.k.g(str, "title");
        sVar.e0(-2035503258);
        int i23 = i6 & 1;
        if (i23 != 0) {
            i7 = i4 | 6;
            rVar2 = rVar;
        } else if ((i4 & 6) == 0) {
            rVar2 = rVar;
            i7 = (sVar.f(rVar2) ? 4 : 2) | i4;
        } else {
            rVar2 = rVar;
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= sVar.f(str) ? 32 : 16;
        }
        int i24 = i6 & 4;
        if (i24 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            str3 = str2;
            i7 |= sVar.f(str3) ? 256 : 128;
            if ((i4 & 3072) != 0) {
                if ((i6 & 8) == 0) {
                    j2 = j;
                    if (sVar.e(j2)) {
                        i22 = 2048;
                        i7 |= i22;
                    }
                } else {
                    j2 = j;
                }
                i22 = 1024;
                i7 |= i22;
            } else {
                j2 = j;
            }
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                aVar2 = aVar;
                i7 |= sVar.h(aVar2) ? 16384 : 8192;
                if ((196608 & i4) == 0) {
                    i7 |= 65536;
                }
                i9 = i6 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= sVar.c(f) ? 1048576 : 524288;
                }
                i11 = i7 | 918552576;
                i12 = i6 & 1024;
                if (i12 != 0) {
                    i14 = 6;
                    i13 = i23;
                } else if ((i5 & 6) == 0) {
                    i13 = i23;
                    i14 = i5 | (sVar.h(fVar) ? 4 : 2);
                } else {
                    i13 = i23;
                    i14 = i5;
                }
                int i25 = 1;
                if ((i11 & 306783379) != 306783378 && (i14 & 3) == 2) {
                    z = false;
                    if (sVar.S(i11 & 1, z)) {
                        sVar.X();
                        if ((i4 & 1) == 0 || sVar.A()) {
                            rVar4 = i13 != 0 ? w1.o.a : rVar2;
                            if (i24 != 0) {
                                str3 = null;
                            }
                            if ((i6 & 8) != 0) {
                                j2 = ih.d.b(sVar).b;
                                i11 &= -7169;
                            }
                            j71.a aVar5 = i8 == 0 ? aVar2 : null;
                            int i26 = (-458753) & i11;
                            float f7 = i9 != 0 ? a : f;
                            float f8 = 0;
                            if (i12 != 0) {
                                i19 = 2;
                                j4 = j2;
                                i21 = i26;
                                fVar3 = c.b;
                                aVar4 = aVar5;
                                i18 = 2131231114;
                                f5 = f7;
                                f6 = f8;
                            } else {
                                aVar4 = aVar5;
                                i18 = 2131231114;
                                i19 = 2;
                                f5 = f7;
                                f6 = f8;
                                j4 = j2;
                                fVar3 = fVar;
                                i21 = i26;
                            }
                            j5 = j4;
                        } else {
                            sVar.V();
                            if ((i6 & 8) != 0) {
                                i11 &= -7169;
                            }
                            int i27 = i11 & (-458753);
                            f5 = f;
                            f6 = f2;
                            i25 = i2;
                            i19 = i3;
                            j5 = j2;
                            aVar4 = aVar2;
                            fVar3 = fVar;
                            i21 = i27;
                            rVar4 = rVar2;
                            i18 = i;
                        }
                        sVar.r();
                        w1.r rVar5 = rVar4;
                        String str5 = str3;
                        int i28 = i19;
                        int i29 = i21 >> 6;
                        int i31 = i21 >> 3;
                        int i32 = (i29 & 896) | (i29 & 112) | 100663296 | (458752 & i31) | (i31 & 3670016) | ((i14 << 21) & 29360128);
                        float f9 = f6;
                        b(null, j5, aVar4, i18, 0, f5, f9, fVar3, r1.i.d(936074508, new w(i28, i25, str, str5, rVar5), sVar), sVar, i32, 17);
                        f4 = f9;
                        fVar2 = fVar3;
                        i16 = i28;
                        i15 = i25;
                        i17 = i18;
                        f3 = f5;
                        j3 = j5;
                        aVar3 = aVar4;
                        rVar3 = rVar5;
                        str4 = str5;
                    } else {
                        sVar.V();
                        i15 = i2;
                        i16 = i3;
                        rVar3 = rVar2;
                        str4 = str3;
                        j3 = j2;
                        aVar3 = aVar2;
                        i17 = i;
                        f3 = f;
                        f4 = f2;
                        fVar2 = fVar;
                    }
                    t = sVar.t();
                    if (t != null) {
                        t.d = new j71.e() { // from class: qg.l
                            public final Object s(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int L = androidx.compose.runtime.t.L(i4 | 1);
                                int L2 = androidx.compose.runtime.t.L(i5);
                                p.c(rVar3, str, str4, j3, aVar3, i17, f3, f4, i15, i16, fVar2, (androidx.compose.runtime.s) obj, L, L2, i6);
                                return w61.a0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z = true;
                if (sVar.S(i11 & 1, z)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            aVar2 = aVar;
            if ((196608 & i4) == 0) {
            }
            i9 = i6 & 64;
            if (i9 != 0) {
            }
            i11 = i7 | 918552576;
            i12 = i6 & 1024;
            if (i12 != 0) {
            }
            int i252 = 1;
            if ((i11 & 306783379) != 306783378) {
                z = false;
                if (sVar.S(i11 & 1, z)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            z = true;
            if (sVar.S(i11 & 1, z)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str3 = str2;
        if ((i4 & 3072) != 0) {
        }
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        aVar2 = aVar;
        if ((196608 & i4) == 0) {
        }
        i9 = i6 & 64;
        if (i9 != 0) {
        }
        i11 = i7 | 918552576;
        i12 = i6 & 1024;
        if (i12 != 0) {
        }
        int i2522 = 1;
        if ((i11 & 306783379) != 306783378) {
        }
        z = true;
        if (sVar.S(i11 & 1, z)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    public static final void d(w1.r rVar, final String str, final g3.g gVar, final String str2, final long j, final j71.a aVar, final int i, final float f, float f2, int i2, int i3, final r1.d dVar, androidx.compose.runtime.s sVar, final int i4, final int i5) {
        final w1.r rVar2;
        final float f3;
        final int i6;
        final int i7;
        w1.r rVar3;
        int i8;
        float f4;
        boolean z;
        int i9;
        k71.k.g(str, "title");
        sVar.e0(1512937187);
        int i11 = i4 | 6;
        if ((i4 & 48) == 0) {
            i11 |= sVar.f(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i11 |= sVar.f(gVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i11 |= sVar.f(str2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i11 |= sVar.e(j) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i11 |= sVar.h(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i11 |= sVar.d(i) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i11 |= sVar.c(f) ? 8388608 : 4194304;
        }
        int i12 = i11 | 905969664;
        int i13 = i5 | 6;
        if ((i5 & 48) == 0) {
            i13 |= sVar.h(dVar) ? 32 : 16;
        }
        int i14 = i13;
        if (sVar.S(i12 & 1, ((306783379 & i12) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            sVar.X();
            if ((i4 & 1) == 0 || sVar.A()) {
                rVar3 = w1.o.a;
                i8 = 2;
                f4 = 0;
                z = 18;
                i9 = 1;
            } else {
                sVar.V();
                rVar3 = rVar;
                f4 = f2;
                i8 = i3;
                z = 18;
                i9 = i2;
            }
            sVar.r();
            w1.r rVar4 = rVar3;
            r1.d d = r1.i.d(678967433, new b0(rVar3, str, i8, i9, str2, gVar), sVar);
            int i15 = i12 >> 9;
            int i16 = i12 >> 6;
            b(null, j, aVar, i, 0, f, f4, dVar, d, sVar, (i15 & 7168) | (i15 & 112) | 100663296 | (i15 & 896) | (458752 & i16) | (i16 & 3670016) | (29360128 & (i14 << 18)), 17);
            f3 = f4;
            rVar2 = rVar4;
            i6 = i9;
            i7 = i8;
        } else {
            sVar.V();
            rVar2 = rVar;
            f3 = f2;
            i6 = i2;
            i7 = i3;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: qg.k
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i4 | 1);
                    int L2 = androidx.compose.runtime.t.L(i5);
                    p.d(rVar2, str, gVar, str2, j, aVar, i, f, f3, i6, i7, dVar, (androidx.compose.runtime.s) obj, L, L2);
                    return w61.a0.a;
                }
            };
        }
    }
}
