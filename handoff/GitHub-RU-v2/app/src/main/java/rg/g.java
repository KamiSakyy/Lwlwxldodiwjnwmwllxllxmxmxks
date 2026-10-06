package rg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import d2.a0Shadow;
import d2.p0;
import f0.v;
import f1.fa;
import f1.j5;
import f1.qa;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, float f, final j71.a aVar, long j, long j2, long j3, j71.f fVar, j71.f fVar2, final j71.e eVar, final r1.d dVar, s sVar, final int i, final int i2) {
        int i3;
        float f2;
        long j4;
        int i4;
        int i5;
        int i6;
        final r rVar2;
        final j71.f fVar3;
        final j71.f fVar4;
        final float f3;
        final long j5;
        final long j6;
        final long j7;
        b2 t;
        long j8;
        long j9;
        int i7;
        long j11;
        j71.f fVar5;
        int i8;
        r rVar3;
        j71.f fVar6;
        float f4;
        long j12;
        long j13;
        long j14;
        int i9;
        int i11;
        k71.k.g(aVar, "onNavigateUp");
        k71.k.g(eVar, "title");
        sVar.e0(730627242);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= sVar.c(f2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= sVar.h(aVar) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j;
                    if (sVar.e(j4)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    j4 = j;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                j4 = j;
            }
            if ((i & 24576) == 0) {
                i3 |= ((i2 & 16) == 0 && sVar.e(j2)) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    i4 = i12;
                    if (sVar.e(j3)) {
                        i9 = 131072;
                        i3 |= i9;
                    }
                } else {
                    i4 = i12;
                }
                i9 = 65536;
                i3 |= i9;
            } else {
                i4 = i12;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= sVar.h(fVar) ? 1048576 : 524288;
            }
            i6 = i2 & 128;
            if (i6 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= sVar.h(fVar2) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i3 |= sVar.h(eVar) ? 67108864 : 33554432;
            }
            if ((i & 805306368) == 0) {
                i3 |= sVar.h(dVar) ? 536870912 : 268435456;
            }
            if (sVar.S(i3 & 1, (i3 & 306783379) == 306783378)) {
                sVar.V();
                rVar2 = rVar;
                fVar3 = fVar;
                fVar4 = fVar2;
                f3 = f2;
                j5 = j4;
                j6 = j2;
                j7 = j3;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    r rVar4 = i4 != 0 ? o.a : rVar;
                    float f5 = i13 != 0 ? 0 : f2;
                    if ((i2 & 8) != 0) {
                        j8 = ih.d.b(sVar).c;
                        i3 &= -7169;
                    } else {
                        j8 = j4;
                    }
                    if ((i2 & 16) != 0) {
                        j9 = ih.d.b(sVar).c;
                        i3 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i2 & 32) != 0) {
                        j11 = ih.d.b(sVar).A;
                        i7 = i3 & (-458753);
                    } else {
                        i7 = i3;
                        j11 = j3;
                    }
                    j71.f fVar7 = i5 != 0 ? null : fVar;
                    fVar5 = i6 != 0 ? a.a : fVar2;
                    i8 = i7;
                    rVar3 = rVar4;
                    fVar6 = fVar7;
                    f4 = f5;
                    long j15 = j9;
                    j12 = j11;
                    j13 = j8;
                    j14 = j15;
                } else {
                    sVar.V();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    rVar3 = rVar;
                    j14 = j2;
                    fVar6 = fVar;
                    fVar5 = fVar2;
                    i8 = i3;
                    f4 = f2;
                    j13 = j4;
                    j12 = j3;
                }
                sVar.r();
                r f6 = f0.o.f(rVar3, j14, a0.b);
                j71.f fVar8 = fVar6;
                long j16 = j13;
                e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar, 48);
                int hashCode = Long.hashCode(sVar.T);
                v1 l = sVar.l();
                r c = w1.a.c(sVar, f6);
                v2.h.o.getClass();
                v2.f fVar9 = v2.g.b;
                sVar.g0();
                if (sVar.S) {
                    sVar.k(fVar9);
                } else {
                    sVar.q0();
                }
                t.I(sVar, v2.g.f, a);
                t.I(sVar, v2.g.e, l);
                t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                t.E(sVar, v2.g.h);
                t.I(sVar, v2.g.d, c);
                long j17 = j14;
                long j18 = j12;
                float f7 = f4;
                qa.a((r) null, (p0) null, j16, 0L, 0.0f, f7, (v) null, r1.i.d(-309348933, new fa(j16, j18, aVar, eVar, fVar5, fVar8), sVar), sVar, ((i8 >> 3) & 896) | 12582912 | ((i8 << 12) & 458752), 91);
                dVar.f(f0.a, sVar, Integer.valueOf(((i8 >> 24) & 112) | 6));
                sVar.q(true);
                j5 = j16;
                f3 = f7;
                fVar4 = fVar5;
                rVar2 = rVar3;
                j6 = j17;
                j7 = j18;
                fVar3 = fVar8;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: rg.e
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int L = t.L(i | 1);
                        g.a(rVar2, f3, aVar, j5, j6, j7, fVar3, fVar4, eVar, dVar, (s) obj, L, i2);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(r rVar, float f, final j71.a aVar, final String str, final g3.g gVar, final String str2, long j, long j2, long j3, final r1.d dVar, r1.d dVar2, s sVar, final int i) {
        r1.d dVar3;
        final r rVar2;
        final float f2;
        final long j4;
        final long j5;
        final long j6;
        long j7;
        long j8;
        r rVar3;
        long j9;
        float f3;
        k71.k.g(aVar, "onNavigateUp");
        k71.k.g(str, "title");
        sVar.e0(1542223022);
        int i2 = i | 54 | (sVar.h(aVar) ? 256 : 128) | (sVar.f(str) ? 2048 : 1024) | (sVar.f(gVar) ? 16384 : 8192) | (sVar.f(str2) ? 131072 : 65536) | 843579392;
        if (sVar.S(i2 & 1, (306783379 & i2) != 306783378)) {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                j7 = ih.d.b(sVar).c;
                j8 = ih.d.b(sVar).c;
                long j11 = ih.d.b(sVar).A;
                rVar3 = o.a;
                j9 = j11;
                f3 = 0;
            } else {
                sVar.V();
                rVar3 = rVar;
                f3 = f;
                j7 = j;
                j8 = j2;
                j9 = j3;
            }
            sVar.r();
            r f4 = f0.o.f(rVar3, j8, a0.b);
            e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.E, sVar, 48);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, f4);
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
            long j12 = j8;
            long j13 = j9;
            long j14 = j7;
            float f5 = f3;
            qa.a((r) null, (p0) null, j14, 0L, 0.0f, f5, (v) null, r1.i.d(-2060694401, new j5(str, gVar, str2, j7, j13, aVar, dVar), sVar), sVar, 12779520, 91);
            dVar3 = dVar2;
            dVar3.f(f0.a, sVar, 54);
            sVar.q(true);
            f2 = f5;
            j4 = j14;
            rVar2 = rVar3;
            j5 = j12;
            j6 = j13;
        } else {
            dVar3 = dVar2;
            sVar.V();
            rVar2 = rVar;
            f2 = f;
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        b2 t = sVar.t();
        if (t != null) {
            final r1.d dVar4 = dVar3;
            t.d = new j71.e(rVar2, f2, aVar, str, gVar, str2, j4, j5, j6, dVar, dVar4, i) { // from class: rg.f
                public final /* synthetic */ r1.d A;
                public final /* synthetic */ r1.d B;
                public final /* synthetic */ r r;
                public final /* synthetic */ float s;
                public final /* synthetic */ j71.a t;
                public final /* synthetic */ String u;
                public final /* synthetic */ g3.g v;
                public final /* synthetic */ String w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ long z;

                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = t.L(1);
                    g.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, (s) obj, L);
                    return w61.a0.a;
                }
            };
        }
    }

    public static Object a;
    public static final Object b = null;
    public static final Object d = null;
    public static final Object e = null;
    public static final Object f = null;
    public static final Object h = null;
}
