package fh;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.n2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.agents.sessionevents.ui.h0;
import com.github.rudroid.widget.p;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d2.p0;
import f1.e8;
import f1.g2;
import f1.jb;
import f1.o5;
import f1.p5;
import f1.y1;
import f1.z1;
import g3.g0;
import l3.d0;
import l3.e0;
import l3.v;
import w1.o;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public static final void a(r rVar, boolean z, int i, boolean z2, long j, boolean z3, String str, String str2, j71.c cVar, j71.a aVar, j71.a aVar2, j71.a aVar3, e0 e0Var, boolean z4, r1.d dVar, s sVar, int i2, int i3) {
        r rVar2;
        int i4;
        boolean z5;
        e0 e0Var2;
        boolean z6;
        r rVar3;
        long j2;
        r rVar4;
        long j3;
        int i5;
        e0 e0Var3;
        boolean z7;
        boolean z8;
        r rVar5;
        k71.k.g(cVar, "onSearchTextChange");
        k71.k.g(aVar, "onSearchEnable");
        k71.k.g(aVar2, "onSearchTextClear");
        sVar.e0(-673874242);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = i2 | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        int i7 = i4 | (sVar.d(2131231434) ? 256 : 128) | (sVar.d(i) ? 2048 : 1024) | 90112 | (sVar.g(z3) ? 1048576 : 524288) | (sVar.f(str) ? 8388608 : 4194304) | (sVar.f(str2) ? 67108864 : 33554432) | (sVar.h(cVar) ? 536870912 : 268435456);
        int i8 = 196608 | (sVar.h(aVar) ? 4 : 2) | (sVar.h(aVar2) ? 32 : 16) | (sVar.h(aVar3) ? 256 : 128) | 27648;
        if (sVar.S(i7 & 1, ((i7 & 306783379) == 306783378 && (74899 & i8) == 74898) ? false : true)) {
            sVar.X();
            if ((i2 & 1) == 0 || sVar.A()) {
                rVar4 = i6 != 0 ? o.a : rVar2;
                j3 = ih.d.b(sVar).F;
                i5 = i7 & (-458753);
                e0Var3 = d0.r;
                z7 = true;
                z8 = true;
            } else {
                sVar.V();
                z7 = z2;
                j3 = j;
                e0Var3 = e0Var;
                z8 = z4;
                i5 = i7 & (-458753);
                rVar4 = rVar2;
            }
            sVar.r();
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = n.a;
            if (N == iVar) {
                int length = str2.length();
                rVar5 = rVar4;
                N = t.B(new v(4, g0.b(length, length), str2));
                sVar.n0(N);
            } else {
                rVar5 = rVar4;
            }
            f1 f1Var = (f1) N;
            v b = v.b((v) f1Var.getValue(), str2, 0L, 6);
            boolean z9 = (i5 & 1879048192) == 536870912;
            Object N2 = sVar.N();
            if (z9 || N2 == iVar) {
                N2 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 13);
                sVar.n0(N2);
            }
            j71.c cVar2 = (j71.c) N2;
            boolean z11 = (i8 & 112) == 32;
            Object N3 = sVar.N();
            Object obj = N3;
            if (z11 || N3 == iVar) {
                h0 h0Var = new h0(aVar2, f1Var, 4);
                sVar.n0(h0Var);
                obj = h0Var;
            }
            j71.a aVar4 = (j71.a) obj;
            int i9 = i5 & 8190;
            int i11 = i5 >> 3;
            r rVar6 = rVar5;
            b(rVar6, z, i, j3, z3, str, b, cVar2, aVar, aVar4, aVar3, z7, e0Var3, z8, dVar, sVar, (i11 & 3670016) | i9 | (458752 & i11) | ((i8 << 27) & 1879048192), ((i8 >> 3) & 112) | 224640);
            rVar3 = rVar6;
            j2 = j3;
            z5 = z7;
            e0Var2 = e0Var3;
            z6 = z8;
        } else {
            sVar.V();
            z5 = z2;
            e0Var2 = e0Var;
            z6 = z4;
            rVar3 = rVar2;
            j2 = j;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new g(rVar3, z, i, z5, j2, z3, str, str2, cVar, aVar, aVar2, aVar3, e0Var2, z6, dVar, i2, i3);
        }
    }

    public static final void b(r rVar, boolean z, int i, final long j, boolean z2, String str, v vVar, j71.c cVar, final j71.a aVar, j71.a aVar2, j71.a aVar3, boolean z3, e0 e0Var, boolean z4, r1.d dVar, s sVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        final int i7;
        boolean z5;
        sVar.e0(-467914031);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.d(2131231434) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= sVar.e(j) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= sVar.g(z2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 = 196608;
            i4 |= sVar.f(str) ? 1048576 : 524288;
        } else {
            i5 = 196608;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= sVar.f(vVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= sVar.h(cVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= sVar.h(aVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (sVar.h(aVar2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= sVar.h(aVar3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= sVar.g(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= sVar.f(e0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= sVar.g(z4) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i6 |= sVar.h(dVar) ? 131072 : 65536;
        }
        if (sVar.S(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 74899) == 74898) ? false : true)) {
            sVar.X();
            if ((i2 & 1) != 0 && !sVar.A()) {
                sVar.V();
            }
            sVar.r();
            r e = p2.e(rVar, 1.0f);
            androidx.compose.foundation.layout.f fVar = l.a;
            l2 a = j2.a(fVar, w1.c.A, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, e);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.q0();
            }
            v2.eShadow eVar = v2.g.f;
            t.I(sVar, eVar, a);
            v2.eShadow eVar2 = v2.g.e;
            t.I(sVar, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.eShadow eVar3 = v2.g.g;
            t.w(sVar, valueOf, eVar3);
            v2.d dVar2 = v2.g.h;
            t.E(sVar, dVar2);
            int i8 = i4;
            v2.eShadow eVar4 = v2.g.d;
            t.I(sVar, eVar4, c);
            if (z2) {
                i7 = i;
                z5 = true;
                sVar.c0(-266247775);
                float f = 0;
                f2 e2 = jb.e(jb.a, f, f, 5);
                int i9 = i8 >> 12;
                int i11 = ((i8 >> 18) & 112) | (i9 & 896) | (i9 & 57344) | ((i6 << 12) & 458752);
                int i12 = i6 << 18;
                d.c(null, vVar, str, null, cVar, aVar3, aVar2, z, z3, null, e2, e0Var, z4, sVar, i11 | (3670016 & i12) | (29360128 & (i8 << 18)) | (i12 & 234881024), (i6 >> 6) & 1008, 521);
                sVar.q(false);
            } else {
                sVar.c0(-266934890);
                r e3 = p2.e(o.a, 1.0f);
                l2 a2 = j2.a(fVar, w1.c.B, sVar, 48);
                int hashCode2 = Long.hashCode(sVar.T);
                v1 l2 = sVar.l();
                r c2 = w1.a.c(sVar, e3);
                sVar.g0();
                if (sVar.S) {
                    sVar.k(fVar2);
                } else {
                    sVar.q0();
                }
                t.I(sVar, eVar, a2);
                t.I(sVar, eVar2, l2);
                f1.e.t(hashCode2, sVar, eVar3, sVar, dVar2);
                t.I(sVar, eVar4, c2);
                dVar.f(n2.a, sVar, Integer.valueOf(6 | ((i6 >> 12) & 112)));
                i7 = i;
                t.a(f1.e.f(((y1) sVar.j(z1.a)).s, g2.a), r1.i.d(380441486, new j71.e() { // from class: fh.h
                    public final Object s(Object obj, Object obj2) {
                        s sVar2 = (s) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (sVar2.S(intValue & 1, (intValue & 3) != 2)) {
                            final int i13 = i7;
                            final long j2 = j;
                            e8.h(aVar, (r) null, false, (o5) null, (p0) null, r1.i.d(-292719056, new j71.e() { // from class: fh.e
                                public final Object s(Object obj3, Object obj4) {
                                    s sVar3 = (s) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    if (sVar3.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        p5.a(z3.C(2131231434, 0, sVar3), i4.p0(i13, sVar3), (r) null, j2, sVar3, 8, 4);
                                    } else {
                                        sVar3.V();
                                    }
                                    return a0.a;
                                }
                            }, sVar2), sVar2, 1572864, 62);
                        } else {
                            sVar2.V();
                        }
                        return a0.a;
                    }
                }, sVar), sVar, 56);
                z5 = true;
                sVar.q(true);
                sVar.q(false);
            }
            sVar.q(z5);
        } else {
            i7 = i;
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new g(rVar, z, i7, j, z2, str, vVar, cVar, aVar, aVar2, aVar3, z3, e0Var, z4, dVar, i2, i3);
        }
    }

    public static final void c(r rVar, final boolean z, final String str, int i, int i2, final int i3, boolean z2, long j, final boolean z3, final String str2, final String str3, final j71.c cVar, final j71.a aVar, final j71.a aVar2, j71.a aVar3, e0 e0Var, boolean z4, s sVar, final int i4, final int i5) {
        j71.a aVar4;
        int i6;
        final r rVar2;
        final int i7;
        final int i8;
        final boolean z5;
        final long j2;
        final e0 e0Var2;
        final boolean z6;
        final j71.a aVar5;
        int i9;
        j71.a aVar6;
        r rVar3;
        e0 e0Var3;
        long j3;
        j71.a aVar7;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        int i13;
        k71.k.g(str, "title");
        k71.k.g(cVar, "onSearchTextChange");
        k71.k.g(aVar, "onSearchEnable");
        k71.k.g(aVar2, "onSearchTextClear");
        sVar.e0(-874041383);
        int i14 = i4 | 6 | (sVar.g(z) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | 27648 | (sVar.d(2131231434) ? 131072 : 65536) | (sVar.d(i3) ? 1048576 : 524288) | 46137344 | (sVar.g(z3) ? 536870912 : 268435456);
        int i15 = 2;
        int i16 = (sVar.f(str2) ? 4 : 2) | (sVar.f(str3) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar2) ? 16384 : 8192);
        int i17 = i5 & 32768;
        if (i17 != 0) {
            i6 = i16 | 196608;
            aVar4 = aVar3;
        } else {
            aVar4 = aVar3;
            i6 = i16 | (sVar.h(aVar4) ? 131072 : 65536);
        }
        int i18 = i6 | 14155776;
        if (sVar.S(i14 & 1, ((i14 & 306783379) == 306783378 && (4793491 & i18) == 4793490) ? false : true)) {
            sVar.X();
            int i19 = i4 & 1;
            Object obj = n.a;
            if (i19 == 0 || sVar.A()) {
                i9 = i18;
                long j4 = ih.d.b(sVar).F;
                int i21 = i14 & (-234881025);
                if (i17 != 0) {
                    Object N = sVar.N();
                    if (N == obj) {
                        N = new p(15);
                        sVar.n0(N);
                    }
                    aVar6 = (j71.a) N;
                } else {
                    aVar6 = aVar4;
                }
                rVar3 = o.a;
                e0Var3 = d0.r;
                j3 = j4;
                aVar7 = aVar6;
                z7 = true;
                z8 = true;
                i11 = i21;
                i12 = 1;
            } else {
                sVar.V();
                i15 = i2;
                z7 = z2;
                j3 = j;
                e0Var3 = e0Var;
                z8 = z4;
                i9 = i18;
                aVar7 = aVar4;
                rVar3 = rVar;
                i11 = i14 & (-234881025);
                i12 = i;
            }
            sVar.r();
            Object N2 = sVar.N();
            if (N2 == obj) {
                int length = str3.length();
                i13 = i12;
                N2 = t.B(new v(4, g0.b(length, length), str3));
                sVar.n0(N2);
            } else {
                i13 = i12;
            }
            f1 f1Var = (f1) N2;
            long j5 = j3;
            v b = v.b((v) f1Var.getValue(), str3, 0L, 6);
            int i22 = i9;
            boolean z9 = (i22 & 896) == 256;
            Object N3 = sVar.N();
            if (z9 || N3 == obj) {
                N3 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 12);
                sVar.n0(N3);
            }
            j71.c cVar2 = (j71.c) N3;
            boolean z11 = (57344 & i22) == 16384;
            Object N4 = sVar.N();
            if (z11 || N4 == obj) {
                N4 = new h0(aVar2, f1Var, 3);
                sVar.n0(N4);
            }
            int i23 = i11 << 3;
            int i24 = i22 & 33496078;
            int i25 = i13;
            boolean z12 = z7;
            r rVar4 = rVar3;
            int i26 = i15;
            d(rVar4, z, str, i25, i26, z12, i3, j5, z3, str2, b, cVar2, aVar, (j71.a) N4, aVar7, e0Var3, z8, sVar, (65534 & i11) | 196608 | (3670016 & i23) | (i23 & 29360128) | (i11 & 1879048192), i24, 0);
            rVar2 = rVar4;
            j2 = j5;
            z6 = z8;
            z5 = z12;
            e0Var2 = e0Var3;
            i8 = i26;
            aVar5 = aVar7;
            i7 = i25;
        } else {
            sVar.V();
            rVar2 = rVar;
            i7 = i;
            i8 = i2;
            z5 = z2;
            j2 = j;
            e0Var2 = e0Var;
            z6 = z4;
            aVar5 = aVar4;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e(rVar2, z, str, i7, i8, i3, z5, j2, z3, str2, str3, cVar, aVar, aVar2, aVar5, e0Var2, z6, i4, i5) { // from class: fh.f
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ j71.c C;
                public final /* synthetic */ j71.a D;
                public final /* synthetic */ j71.a E;
                public final /* synthetic */ j71.a F;
                public final /* synthetic */ e0 G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ int I;
                public final /* synthetic */ r r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ String t;
                public final /* synthetic */ int u;
                public final /* synthetic */ int v;
                public final /* synthetic */ int w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ long y;
                public final /* synthetic */ boolean z;

                {
                    this.I = i5;
                }

                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = t.L(1);
                    k.c(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (s) obj2, L, this.I);
                    return a0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(r rVar, final boolean z, final String str, int i, int i2, final boolean z2, final int i3, long j, final boolean z3, final String str2, final v vVar, final j71.c cVar, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final e0 e0Var, final boolean z4, s sVar, final int i4, final int i5, final int i6) {
        r rVar2;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        long j2;
        int i15;
        int i16;
        final int i17;
        final r rVar3;
        final long j3;
        final int i18;
        b2 t;
        int i19;
        int i21;
        int i22;
        k71.k.g(str, "title");
        k71.k.g(cVar, "onSearchTextChange");
        k71.k.g(aVar, "onSearchEnable");
        k71.k.g(aVar2, "onSearchTextClear");
        sVar.e0(1684711276);
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
            z5 = z;
            i7 |= sVar.g(z5) ? 32 : 16;
        } else {
            z5 = z;
        }
        if ((i4 & 384) == 0) {
            i7 |= sVar.f(str) ? 256 : 128;
        }
        int i24 = i6 & 8;
        if (i24 != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i8 = i;
            i7 |= sVar.d(i8) ? 2048 : 1024;
            i9 = i6 & 16;
            if (i9 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i11 = i2;
                i7 |= sVar.d(i11) ? 16384 : 8192;
                if ((i4 & 196608) == 0) {
                    i7 |= sVar.g(z2) ? 131072 : 65536;
                }
                if ((i4 & 1572864) == 0) {
                    i7 |= sVar.d(2131231434) ? 1048576 : 524288;
                }
                if ((i4 & 12582912) == 0) {
                    i12 = 12582912;
                    i7 |= sVar.d(i3) ? 8388608 : 4194304;
                } else {
                    i12 = 12582912;
                }
                if ((i4 & 100663296) == 0) {
                    if ((i6 & 256) == 0) {
                        i13 = i23;
                        i14 = i24;
                        j2 = j;
                        if (sVar.e(j2)) {
                            i22 = 67108864;
                            i7 |= i22;
                        }
                    } else {
                        i13 = i23;
                        i14 = i24;
                        j2 = j;
                    }
                    i22 = 33554432;
                    i7 |= i22;
                } else {
                    i13 = i23;
                    i14 = i24;
                    j2 = j;
                }
                if ((i4 & 805306368) == 0) {
                    i15 = i13;
                    i7 |= sVar.g(z3) ? 536870912 : 268435456;
                } else {
                    i15 = i13;
                }
                if ((i5 & 6) == 0) {
                    i16 = i5 | (sVar.f(str2) ? 4 : 2);
                } else {
                    i16 = i5;
                }
                if ((i5 & 48) == 0) {
                    i16 |= sVar.f(vVar) ? 32 : 16;
                }
                if ((i5 & 384) == 0) {
                    i16 |= sVar.h(cVar) ? 256 : 128;
                }
                if ((i5 & 3072) == 0) {
                    i16 |= sVar.h(aVar) ? 2048 : 1024;
                }
                if ((i5 & 24576) == 0) {
                    i16 |= sVar.h(aVar2) ? 16384 : 8192;
                }
                if ((i5 & 196608) == 0) {
                    i16 |= sVar.h(aVar3) ? 131072 : 65536;
                }
                if ((i5 & 1572864) == 0) {
                    i16 |= sVar.f(e0Var) ? 1048576 : 524288;
                }
                if ((i5 & i12) == 0) {
                    i16 |= sVar.g(z4) ? 8388608 : 4194304;
                }
                if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i16 & 4793491) != 4793490)) {
                    sVar.X();
                    if ((i4 & 1) == 0 || sVar.A()) {
                        r rVar4 = i15 != 0 ? o.a : rVar2;
                        int i25 = i14 == 0 ? i8 : 1;
                        if (i9 != 0) {
                            i11 = 2;
                        }
                        if ((i6 & 256) != 0) {
                            j2 = ih.d.b(sVar).F;
                            i7 &= -234881025;
                        }
                        rVar2 = rVar4;
                        i19 = i11;
                        i21 = i25;
                    } else {
                        sVar.V();
                        if ((i6 & 256) != 0) {
                            i7 &= -234881025;
                        }
                        i21 = i8;
                        i19 = i11;
                    }
                    sVar.r();
                    int i26 = i7 >> 12;
                    int i27 = (i26 & 896) | (i7 & 126) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752);
                    int i28 = i16 << 18;
                    int i29 = i27 | (i28 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | (i28 & 1879048192);
                    int i31 = i16 >> 12;
                    int i32 = (i31 & 112) | (i31 & 14) | 196608 | ((i7 >> 9) & 896);
                    int i33 = i16 >> 9;
                    r rVar5 = rVar2;
                    long j4 = j2;
                    b(rVar5, z5, i3, j4, z3, str2, vVar, cVar, aVar, aVar2, aVar3, z2, e0Var, z4, r1.i.d(1688814393, new i(i19, i21, 0, str), sVar), sVar, i29, i32 | (i33 & 7168) | (57344 & i33));
                    i17 = i21;
                    rVar3 = rVar5;
                    i18 = i19;
                    j3 = j4;
                } else {
                    sVar.V();
                    i17 = i8;
                    rVar3 = rVar2;
                    j3 = j2;
                    i18 = i11;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: fh.j
                        public final Object s(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int L = t.L(i4 | 1);
                            int L2 = t.L(i5);
                            k.d(rVar3, z, str, i17, i18, z2, i3, j3, z3, str2, vVar, cVar, aVar, aVar2, aVar3, e0Var, z4, (s) obj, L, L2, i6);
                            return a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i2;
            if ((i4 & 196608) == 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            if ((i5 & 384) == 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & 196608) == 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i5 & i12) == 0) {
            }
            if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i16 & 4793491) != 4793490)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        i8 = i;
        i9 = i6 & 16;
        if (i9 == 0) {
        }
        i11 = i2;
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & 196608) == 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i5 & i12) == 0) {
        }
        if (sVar.S(i7 & 1, (i7 & 306783379) == 306783378 || (i16 & 4793491) != 4793490)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }



}
