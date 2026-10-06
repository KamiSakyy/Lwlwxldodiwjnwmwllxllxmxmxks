package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.agents.sessionevents.ui.m0;
import com.google.android.gms.internal.measurement.z3;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, int i, j71.a aVar, w1.r rVar, Integer num, String str2, String str3, long j, androidx.compose.runtime.s sVar, int i2, int i3) {
        int i4;
        w1.r rVar2;
        int i5;
        Integer num2;
        int i6;
        String str4;
        int i7;
        int i8;
        String str5;
        int i9;
        int i11;
        String str6;
        String str7;
        w1.r rVar3;
        Integer num3;
        b2 t;
        String str8;
        boolean z;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "title");
        sVar2.e0(1531269060);
        if ((i2 & 6) == 0) {
            i4 = (sVar2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i4 | (sVar2.d(i) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i12 |= sVar2.h(aVar) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i5 = i12 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i5 = i12 | (sVar2.f(rVar2) ? 2048 : 1024);
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            num2 = num;
            i5 |= sVar2.f(num2) ? 16384 : 8192;
            i6 = i3 & 32;
            if (i6 == 0) {
                i7 = i5 | 196608;
                str4 = str2;
            } else {
                str4 = str2;
                i7 = i5 | (sVar2.f(str4) ? 131072 : 65536);
            }
            i8 = i3 & 64;
            if (i8 == 0) {
                i9 = i7 | 1572864;
                str5 = str3;
            } else {
                str5 = str3;
                i9 = i7 | (sVar2.f(str5) ? 1048576 : 524288);
            }
            i11 = i9 | (!sVar2.e(j) ? 8388608 : 4194304);
            if (sVar2.S(i11 & 1, (i11 & 4793491) == 4793490)) {
                sVar2.V();
                str6 = str4;
                str7 = str5;
                rVar3 = rVar2;
                num3 = num2;
            } else {
                w1.r rVar4 = w1.o.a;
                w1.r rVar5 = i13 != 0 ? rVar4 : rVar2;
                Integer num4 = i14 != 0 ? null : num2;
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    str5 = null;
                }
                boolean z2 = aVar != null;
                boolean z3 = ((3670016 & i11) == 1048576) | ((i11 & 896) == 256);
                Object N = sVar2.N();
                Object obj = androidx.compose.runtime.n.a;
                if (z3 || N == obj) {
                    N = new m0(str5, aVar, 3);
                    sVar2.n0(N);
                }
                String str9 = str4;
                w1.r f = f0.o.f(p2.e(com.github.rudroid.uitoolkit.extensions.d.a(rVar5, z2, (j71.c) N), 1.0f), ih.d.b(sVar2).b, d2.a0Shadow.b);
                float f2 = ih.a.m;
                float f3 = ih.a.n;
                w1.r A = androidx.compose.foundation.layout.b.A(f, f3, f2, f3, f2);
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                w1.r rVar6 = rVar5;
                String str10 = str5;
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, A);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                v2.eShadow eVar = v2.g.f;
                androidx.compose.runtime.t.I(sVar2, eVar, a);
                v2.eShadow eVar2 = v2.g.e;
                androidx.compose.runtime.t.I(sVar2, eVar2, l);
                Integer valueOf = Integer.valueOf(hashCode);
                v2.eShadow eVar3 = v2.g.g;
                androidx.compose.runtime.t.w(sVar2, valueOf, eVar3);
                v2.d dVar = v2.g.h;
                androidx.compose.runtime.t.E(sVar2, dVar);
                v2.eShadow eVar4 = v2.g.d;
                androidx.compose.runtime.t.I(sVar2, eVar4, c);
                w1.r o = p2.o(f0.o.f(rVar4, j, ih.d.e(sVar2).c), 32);
                v0 d = androidx.compose.foundation.layout.t.d(w1.c.v, false);
                int hashCode2 = Long.hashCode(sVar2.T);
                v1 l2 = sVar2.l();
                w1.r c2 = w1.a.c(sVar2, o);
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                androidx.compose.runtime.t.I(sVar2, eVar, d);
                androidx.compose.runtime.t.I(sVar2, eVar2, l2);
                f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
                androidx.compose.runtime.t.I(sVar2, eVar4, c2);
                f0.o.c(z3.C(i, (i11 >> 3) & 14, sVar2), (String) null, p2.o(rVar4, 16), (w1.e) null, (androidx.compose.ui.layout.i) null, 0.0f, new d2.l(5, ih.d.a(sVar2).e), sVar2, 440, 56);
                sVar2.q(true);
                w1.r B = androidx.compose.foundation.layout.b.B(rVar4, f3, 0.0f, 0.0f, 0.0f, 14);
                if (1.0f <= 0.0d) {
                    l0.a.a("invalid weight; must be greater than zero");
                }
                ub.b(str, B.f(new w1(1.0f, true)), ih.d.b(sVar2).s, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 2, 0, (j71.c) null, ih.d.f(sVar2).d, sVar, i11 & 14, 24960, 110584);
                sVar2 = sVar;
                if (num4 != null) {
                    sVar2.c0(-84535374);
                    Object N2 = sVar2.N();
                    if (N2 == obj) {
                        N2 = new com.github.rudroid.uitoolkit.banner.o(10);
                        sVar2.n0(N2);
                    }
                    str8 = str9;
                    ub.b(String.valueOf(num4.intValue()), androidx.compose.foundation.layout.b.B(com.github.rudroid.uitoolkit.extensions.d.b(rVar4, str9, (j71.e) N2), f3, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).v, sVar, 0, 0, 131068);
                    sVar2 = sVar;
                    z = false;
                } else {
                    str8 = str9;
                    z = false;
                    sVar2.c0(-87725894);
                }
                sVar2.q(z);
                sVar2.q(true);
                str6 = str8;
                num3 = num4;
                rVar3 = rVar6;
                str7 = str10;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new com.github.rudroid.fragments.onboarding.notifications.ui.f(str, i, aVar, rVar3, num3, str6, str7, j, i2, i3);
                return;
            }
            return;
        }
        num2 = num;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i11 = i9 | (!sVar2.e(j) ? 8388608 : 4194304);
        if (sVar2.S(i11 & 1, (i11 & 4793491) == 4793490)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
