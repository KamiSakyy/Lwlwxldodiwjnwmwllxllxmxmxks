package com.github.rudroid.uitoolkit.pager;

import a2.i;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.a2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.m0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d3.q;
import f1.p5;
import k71.k;
import o0.x;
import v2.h;
import v71.z;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final r rVar, final int i, final int i2, final long j, final long j2, final float f, final float f2, String str, j71.c cVar, s sVar, final int i3, final int i4) {
        int i5;
        String str2;
        int i6;
        j71.c cVar2;
        final j71.c cVar3;
        final String str3;
        b2 t;
        String str4;
        j71.c cVar4;
        int i7;
        boolean z;
        String str5;
        String q0;
        int i8 = i;
        int i9 = i2;
        sVar.e0(1972793095);
        if ((i3 & 6) == 0) {
            i5 = (sVar.f(rVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= sVar.d(i8) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= sVar.d(i9) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= sVar.e(j) ? 2048 : 1024;
        }
        long j3 = j2;
        if ((i3 & 24576) == 0) {
            i5 |= sVar.e(j3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= sVar.c(f) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= sVar.c(f2) ? 1048576 : 524288;
        }
        int i11 = i4 & 128;
        if (i11 != 0) {
            i5 |= 12582912;
        } else if ((12582912 & i3) == 0) {
            str2 = str;
            i5 |= sVar.f(str2) ? 8388608 : 4194304;
            i6 = i4 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
            } else if ((100663296 & i3) == 0) {
                cVar2 = cVar;
                i5 |= sVar.h(cVar2) ? 67108864 : 33554432;
                if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
                    sVar.X();
                    if ((i3 & 1) == 0 || sVar.A()) {
                        if (i11 != 0) {
                            str2 = null;
                        }
                        if (i6 != 0) {
                            str4 = str2;
                            cVar4 = null;
                            sVar.r();
                            androidx.compose.foundation.layout.f fVar = l.a;
                            l2 a = j2.a(new j(f2, true, new a00.a(10, (byte) 0)), w1.c.A, sVar, 0);
                            int hashCode = Long.hashCode(sVar.T);
                            v1 l = sVar.l();
                            r c = w1.a.c(sVar, rVar);
                            h.o.getClass();
                            v2.f fVar2 = v2.g.b;
                            sVar.g0();
                            if (sVar.S) {
                                sVar.q0();
                            } else {
                                sVar.k(fVar2);
                            }
                            t.I(sVar, v2.g.f, a);
                            t.I(sVar, v2.g.e, l);
                            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                            t.E(sVar, v2.g.h);
                            t.I(sVar, v2.g.d, c);
                            sVar.c0(601334357);
                            i7 = 0;
                            while (i7 < i9) {
                                boolean z2 = i8 == i7;
                                int i12 = i7 + 1;
                                String q02 = i4.q0(2131954000, new Object[]{Integer.valueOf(i12), Integer.valueOf(i9)}, sVar);
                                if (z2 && str4 != null && str4.length() != 0) {
                                    q02 = f1.e.h(str4, " ", q02);
                                }
                                if (z2) {
                                    sVar.c0(1462248627);
                                    z = false;
                                    sVar.q(false);
                                    str5 = str4;
                                    q0 = null;
                                } else {
                                    z = false;
                                    sVar.c0(1462294476);
                                    str5 = str4;
                                    q0 = i4.q0(2131953799, new Object[]{Integer.valueOf(i12)}, sVar);
                                    sVar.q(false);
                                }
                                String d = z2 ? m0.d(sVar, 1462526356, 2131953825, sVar, z) : m0.d(sVar, 1462662322, 2131953826, sVar, z);
                                o oVar = o.a;
                                r b = i.b(p2.o(oVar, 2 * f), ih.d.e(sVar).h);
                                boolean f3 = sVar.f(q02) | sVar.f(d);
                                Object N = sVar.N();
                                int i13 = i5;
                                Object obj = n.a;
                                if (f3 || N == obj) {
                                    N = new b(1, q02, d);
                                    sVar.n0(N);
                                }
                                r b2 = q.b(b, false, (j71.c) N);
                                boolean z3 = cVar4 != null;
                                boolean f4 = sVar.f(q0) | ((i13 & 234881024) == 67108864) | sVar.d(i7);
                                Object N2 = sVar.N();
                                if (f4 || N2 == obj) {
                                    N2 = new a2(q0, cVar4, i7, 3);
                                    sVar.n0(N2);
                                }
                                r a2 = com.github.rudroid.uitoolkit.extensions.d.a(b2, z3, (j71.c) N2);
                                v0 d2 = androidx.compose.foundation.layout.t.d(w1.c.v, false);
                                int hashCode2 = Long.hashCode(sVar.T);
                                v1 l2 = sVar.l();
                                r c2 = w1.a.c(sVar, a2);
                                h.o.getClass();
                                v2.f fVar3 = v2.g.b;
                                sVar.g0();
                                if (sVar.S) {
                                    sVar.k(fVar3);
                                } else {
                                    sVar.q0();
                                }
                                t.I(sVar, v2.g.f, d2);
                                t.I(sVar, v2.g.e, l2);
                                t.w(sVar, Integer.valueOf(hashCode2), v2.g.g);
                                t.E(sVar, v2.g.h);
                                t.I(sVar, v2.g.d, c2);
                                p5.a(z3.C(2131231238, 0, sVar), (String) null, p2.d(oVar, 1.0f), z2 ? j : j3, sVar, 440, 0);
                                sVar.q(true);
                                i8 = i;
                                i9 = i2;
                                j3 = j2;
                                str4 = str5;
                                i7 = i12;
                                i5 = i13;
                            }
                            sVar.q(false);
                            sVar.q(true);
                            str3 = str4;
                            cVar3 = cVar4;
                        }
                    } else {
                        sVar.V();
                    }
                    cVar4 = cVar2;
                    str4 = str2;
                    sVar.r();
                    androidx.compose.foundation.layout.f fVar4 = l.a;
                    l2 a3 = j2.a(new j(f2, true, new a00.a(10, (byte) 0)), w1.c.A, sVar, 0);
                    int hashCode3 = Long.hashCode(sVar.T);
                    v1 l3 = sVar.l();
                    r c3 = w1.a.c(sVar, rVar);
                    h.o.getClass();
                    v2.f fVar22 = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                    }
                    t.I(sVar, v2.g.f, a3);
                    t.I(sVar, v2.g.e, l3);
                    t.w(sVar, Integer.valueOf(hashCode3), v2.g.g);
                    t.E(sVar, v2.g.h);
                    t.I(sVar, v2.g.d, c3);
                    sVar.c0(601334357);
                    i7 = 0;
                    while (i7 < i9) {
                    }
                    sVar.q(false);
                    sVar.q(true);
                    str3 = str4;
                    cVar3 = cVar4;
                } else {
                    sVar.V();
                    cVar3 = cVar2;
                    str3 = str2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.pager.d
                        public final Object s(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            g.a(rVar, i, i2, j, j2, f, f2, str3, cVar3, (s) obj2, t.L(i3 | 1), i4);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            cVar2 = cVar;
            if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str2 = str;
        i6 = i4 & 256;
        if (i6 == 0) {
        }
        cVar2 = cVar;
        if (sVar.S(i5 & 1, (i5 & 38347923) != 38347922)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r rVar, final x xVar, final long j, final long j2, float f, float f2, boolean z, String str, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        float f3;
        float f4;
        int i4;
        boolean z2;
        int i5;
        int i6;
        final String str2;
        final r rVar3;
        final boolean z3;
        final float f5;
        final float f6;
        b2 t;
        boolean z4;
        float f7;
        float f8;
        String str3;
        Object N;
        Object obj;
        boolean z5;
        int i7;
        k.g(xVar, "pagerState");
        sVar.e0(1118599008);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.e(j2) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f3 = f;
            i3 |= sVar.c(f3) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f4 = f2;
                    if (sVar.c(f4)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    f4 = f2;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                f4 = f2;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    i3 |= sVar.g(z2) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i6 = i5;
                i3 |= sVar.f(str) ? 8388608 : 4194304;
                if (sVar.S(i3 & 1, (i3 & 4793491) != 4793490)) {
                    sVar.X();
                    j71.c cVar = null;
                    if ((i & 1) == 0 || sVar.A()) {
                        if (i8 != 0) {
                            rVar2 = p2.e(o.a, 1.0f);
                        }
                        if (i9 != 0) {
                            f3 = 8;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            f4 = f3;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            z4 = z2;
                            f7 = f3;
                            f8 = f4;
                            str3 = null;
                            sVar.r();
                            N = sVar.N();
                            obj = n.a;
                            if (N == obj) {
                                N = t.p(sVar);
                                sVar.n0(N);
                            }
                            z zVar = (z) N;
                            int y = ((m1) xVar.d.t).y();
                            int i11 = i3;
                            int m = xVar.m();
                            if (z4) {
                                z5 = z4;
                                sVar.c0(-467230298);
                                sVar.q(false);
                            } else {
                                sVar.c0(-467324569);
                                z5 = z4;
                                boolean h = sVar.h(zVar) | ((i11 & 112) == 32);
                                Object N2 = sVar.N();
                                if (h || N2 == obj) {
                                    N2 = new b(0, zVar, xVar);
                                    sVar.n0(N2);
                                }
                                cVar = (j71.c) N2;
                                sVar.q(false);
                            }
                            int i12 = i11 << 3;
                            r rVar4 = rVar2;
                            a(rVar4, y, m, j, j2, f7, f8, str3, cVar, sVar, (i11 & 14) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016) | (29360128 & i11), 0);
                            z3 = z5;
                            rVar3 = rVar4;
                            f5 = f7;
                            f6 = f8;
                            str2 = str3;
                        }
                    } else {
                        sVar.V();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                    z4 = z2;
                    f7 = f3;
                    f8 = f4;
                    str3 = str;
                    sVar.r();
                    N = sVar.N();
                    obj = n.a;
                    if (N == obj) {
                    }
                    z zVar2 = (z) N;
                    int y2 = ((m1) xVar.d.t).y();
                    int i112 = i3;
                    int m2 = xVar.m();
                    if (z4) {
                    }
                    int i122 = i112 << 3;
                    r rVar42 = rVar2;
                    a(rVar42, y2, m2, j, j2, f7, f8, str3, cVar, sVar, (i112 & 14) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (i122 & 3670016) | (29360128 & i112), 0);
                    z3 = z5;
                    rVar3 = rVar42;
                    f5 = f7;
                    f6 = f8;
                    str2 = str3;
                } else {
                    sVar.V();
                    str2 = str;
                    rVar3 = rVar2;
                    z3 = z2;
                    f5 = f3;
                    f6 = f4;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.pager.c
                        public final Object s(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            g.b(rVar3, xVar, j, j2, f5, f6, z3, str2, (s) obj2, t.L(i | 1), i2);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i5;
            if (sVar.S(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        f3 = f;
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i5;
        if (sVar.S(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x<T1,T2,T3,T4> {
        public x() {
        }
    }
}
