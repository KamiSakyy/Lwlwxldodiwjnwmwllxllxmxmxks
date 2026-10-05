package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.activities.g3;
import com.github.rudroid.copilot.ui.a1;
import com.google.android.gms.internal.measurement.z3;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, Integer num, d2.t tVar, w1.r rVar2, String str, String str2, String str3, String str4, androidx.compose.runtime.s sVar, int i, int i2) {
        String str5;
        String str6;
        w1.r rVar3;
        String str7;
        b2 t;
        String str8;
        int i3;
        w1.r rVar4;
        w1.r rVar5;
        w1.r rVar6;
        String str9;
        String str10;
        w1.r rVar7;
        boolean z;
        boolean z2;
        int i4;
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(1998992185);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= sVar2.f(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= sVar2.f(tVar) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i5 | 27648;
        } else if ((i & 24576) == 0) {
            str5 = str;
            i6 |= sVar2.f(str5) ? 16384 : 8192;
            if ((196608 & i) == 0) {
                i6 |= sVar2.f(str2) ? 131072 : 65536;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    str6 = str3;
                    if (sVar2.f(str6)) {
                        i4 = 1048576;
                        i6 |= i4;
                    }
                } else {
                    str6 = str3;
                }
                i4 = 524288;
                i6 |= i4;
            } else {
                str6 = str3;
            }
            if ((12582912 & i) == 0) {
                i6 |= sVar2.f(str4) ? 8388608 : 4194304;
            }
            if (sVar2.S(i6 & 1, (4793491 & i6) == 4793490)) {
                sVar2.V();
                rVar3 = rVar2;
                str7 = str5;
            } else {
                sVar2.X();
                int i8 = i & 1;
                w1.r rVar8 = w1.o.a;
                if (i8 == 0 || sVar2.A()) {
                    if (i7 != 0) {
                        str5 = null;
                    }
                    if ((i2 & 64) != 0) {
                        str8 = str5;
                        i3 = i6 & (-3670017);
                        rVar4 = rVar8;
                        rVar5 = rVar4;
                        str6 = str2;
                    } else {
                        str8 = str5;
                        i3 = i6;
                        rVar4 = rVar8;
                        rVar5 = rVar4;
                    }
                } else {
                    sVar2.V();
                    if ((i2 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    str8 = str5;
                    i3 = i6;
                    rVar4 = rVar;
                    rVar5 = rVar2;
                }
                sVar2.r();
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, rVar4);
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
                if (num == null || tVar == null) {
                    rVar6 = rVar5;
                    str9 = str8;
                    str10 = str6;
                    rVar7 = rVar8;
                    z = false;
                    z2 = true;
                    sVar2.c0(-2129585915);
                } else {
                    sVar2.c0(-2127919851);
                    float f = 16;
                    w1.r s = p2.s(p2.f(rVar5, f), f);
                    str10 = str6;
                    rVar6 = rVar5;
                    String str11 = str8;
                    rVar7 = rVar8;
                    z2 = true;
                    z = false;
                    f0.o.c(z3.C(num.intValue(), (i3 >> 3) & 14, sVar2), str11, s, (w1.e) null, (androidx.compose.ui.layout.i) null, 0.0f, new d2.l(5, tVar.a), sVar2, ((i3 >> 9) & 112) | 8, 56);
                    str9 = str11;
                }
                sVar2.q(z);
                if (1.0f <= 0.0d) {
                    l0.a.a("invalid weight; must be greater than zero");
                }
                String str12 = str10;
                rVar = rVar4;
                ub.b(str4, androidx.compose.foundation.layout.b.B(new w1(1.0f, z2), ih.a.m, 0.0f, ih.a.l, 0.0f, 10), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, (q0) null, sVar, (i3 >> 21) & 14, 24960, 241660);
                boolean z3 = (((i3 & 3670016) ^ 1572864) > 1048576 && sVar.f(str12)) || (i3 & 1572864) == 1048576;
                Object N = sVar.N();
                if (z3 || N == androidx.compose.runtime.n.a) {
                    N = new a1(str12, 29);
                    sVar.n0(N);
                }
                ub.b(str2, d3.q.b(rVar7, false, (j71.c) N), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a((q0) sVar.j(ub.a), ih.d.b(sVar).v, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, (i3 >> 15) & 14, 0, 131068);
                sVar2 = sVar;
                sVar2.q(true);
                str6 = str12;
                rVar3 = rVar6;
                str7 = str9;
            }
            w1.r rVar9 = rVar;
            t = sVar2.t();
            if (t == null) {
                t.d = new g3(rVar9, num, tVar, rVar3, str7, str2, str6, str4, i, i2);
                return;
            }
            return;
        }
        str5 = str;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (sVar2.S(i6 & 1, (4793491 & i6) == 4793490)) {
        }
        w1.r rVar92 = rVar;
        t = sVar2.t();
        if (t == null) {
        }
    }
}
