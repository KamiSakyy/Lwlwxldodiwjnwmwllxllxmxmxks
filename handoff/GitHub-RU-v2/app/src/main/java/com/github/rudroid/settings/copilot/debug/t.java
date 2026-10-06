package com.github.rudroid.settings.copilot.debug;

import a0.n1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.m0;
import com.github.rudroid.main.s1;
import d2.p0;
import f1.a5;
import f1.gb;
import f1.nb;
import g3.q0;
import s0.l0;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(final boolean z, final nj.d dVar, final j71.c cVar, final j71.a aVar, final j71.c cVar2, final j71.c cVar3, final j71.c cVar4, final j71.c cVar5, final j71.c cVar6, final j71.c cVar7, final j71.c cVar8, final j71.c cVar9, final j71.c cVar10, w1.r rVar, androidx.compose.runtime.s sVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        final w1.r rVar2;
        float f;
        w1.r rVar3;
        boolean z2;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(dVar, "overrides");
        k71.k.g(cVar, "onEnableChange");
        k71.k.g(aVar, "onResetAll");
        k71.k.g(cVar2, "onLicenseTypeSelect");
        k71.k.g(cVar3, "onMobileChatEnableChange");
        k71.k.g(cVar4, "onCodingAgentEnableChange");
        k71.k.g(cVar5, "onCanSubscribeLimitedChange");
        k71.k.g(cVar6, "onUserLimitsEnableChange");
        k71.k.g(cVar7, "onLimitsHasRemainingQuotaChange");
        k71.k.g(cVar8, "onLimitsQuotaPercentageChange");
        k71.k.g(cVar9, "onLimitsOverageChargeEnableChange");
        k71.k.g(cVar10, "onLimitsCurrentOverageCountChange");
        sVar2.e0(1591687175);
        if ((i & 6) == 0) {
            i4 = (sVar2.g(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i12 = i4 | (sVar2.h(dVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 = i12 | (sVar2.h(cVar) ? 256 : 128);
        } else {
            i5 = i12;
        }
        int i13 = i5;
        if ((i & 3072) == 0) {
            i6 = i13 | (sVar2.h(aVar) ? 2048 : 1024);
        } else {
            i6 = i13;
        }
        int i14 = i6;
        if ((i & 24576) == 0) {
            i7 = i14 | (sVar2.h(cVar2) ? 16384 : 8192);
        } else {
            i7 = i14;
        }
        if ((i & 196608) == 0) {
            i7 |= sVar2.h(cVar3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i7 |= sVar2.h(cVar4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i7 |= sVar2.h(cVar5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i7 |= sVar2.h(cVar6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= sVar2.h(cVar7) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i8 = i2 | (sVar2.h(cVar8) ? 4 : 2);
        } else {
            i8 = i2;
        }
        if ((i2 & 48) == 0) {
            i8 |= sVar2.h(cVar9) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i8 |= sVar2.h(cVar10) ? 256 : 128;
        }
        int i15 = i8;
        int i16 = i3 & 8192;
        if (i16 != 0) {
            i11 = i15 | 3072;
            i9 = i16;
        } else {
            i9 = i16;
            i11 = i15 | (sVar2.f(rVar) ? 2048 : 1024);
        }
        if (sVar2.S(i7 & 1, ((i7 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            w1.r rVar4 = w1.o.a;
            w1.r rVar5 = i9 != 0 ? rVar4 : rVar;
            w1.r w = f0.o.w(p2.d(rVar5, 1.0f), f0.o.v(sVar2), true);
            float f2 = ih.a.n;
            w1.r z3 = androidx.compose.foundation.layout.b.z(w, 0.0f, f2, 1);
            e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.g(f2), w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, z3);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            w1.r rVar6 = rVar5;
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
            eh.e.a(null, "Override Control", null, null, r1.i.d(1848219022, new s1(z, cVar, aVar, 2), sVar2), sVar2, 24624, 13);
            if (z) {
                sVar2.c0(-121164192);
                eh.e.a(null, "License", null, null, r1.i.d(18672019, new com.github.rudroid.settings.codeoptions.g(3, dVar, cVar2), sVar2), sVar2, 24624, 13);
                eh.e.a(null, "Feature Flags", null, null, r1.i.d(168830972, new bd.f(dVar, cVar3, cVar4, cVar5, 13), sVar2), sVar2, 24624, 13);
                rVar3 = rVar4;
                z2 = false;
                f = f2;
                r1.d d = r1.i.d(693637083, new com.github.rudroid.issueorpullrequest.ui.copilot.codereview.d(dVar, cVar6, cVar7, cVar8, cVar9, cVar10, 2), sVar2);
                sVar2 = sVar2;
                eh.e.a(null, "User Limits (CopilotConsumptiveInfo)", null, null, d, sVar2, 24624, 13);
            } else {
                f = f2;
                rVar3 = rVar4;
                z2 = false;
                sVar2.c0(-124822223);
            }
            sVar2.q(z2);
            m0.C(rVar3, f, sVar2, true);
            rVar2 = rVar6;
        } else {
            sVar2.V();
            rVar2 = rVar;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e() { // from class: com.github.rudroid.settings.copilot.debug.s
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(i | 1);
                    int L2 = androidx.compose.runtime.t.L(i2);
                    t.a(z, dVar, cVar, aVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, rVar2, (androidx.compose.runtime.s) obj, L, L2, i3);
                    return w61.a0.a;
                }
            };
        }
    }

    public static final void b(e1 e1Var, j71.c cVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(24253875);
        int i2 = (sVar.d(e1Var == null ? -1 : e1Var.ordinal()) ? 4 : 2) | i | (sVar.h(cVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = androidx.compose.runtime.t.B(Boolean.FALSE);
                sVar.n0(N);
            }
            f1 f1Var = (f1) N;
            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
            Object N2 = sVar.N();
            Object obj = N2;
            if (N2 == iVar) {
                ab.e eVar = new ab.e(f1Var, 8);
                sVar.n0(eVar);
                obj = eVar;
            }
            sVar2 = sVar;
            a5.a(booleanValue, (j71.c) obj, androidx.compose.foundation.layout.b.z(p2.e(w1.o.a, 1.0f), ih.a.n, 0.0f, 2), r1.i.d(1114496221, new d(e1Var, f1Var, cVar, 1), sVar), sVar2, 3120);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new q(e1Var, cVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, String str2, j71.c cVar, String str3, androidx.compose.runtime.s sVar, int i, int i2) {
        String str4;
        String str5;
        b2 t;
        r1.d d;
        sVar.e0(-2145172245);
        int i3 = (sVar.f(str2) ? 32 : 16) | i | (sVar.h(cVar) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str4 = str3;
            i3 |= sVar.f(str4) ? 2048 : 1024;
            if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
                sVar.V();
                str5 = str4;
            } else {
                String str6 = i4 != 0 ? null : str4;
                boolean z = (i3 & 112) == 32;
                Object N = sVar.N();
                androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                if (z || N == iVar) {
                    N = androidx.compose.runtime.t.B(str2);
                    sVar.n0(N);
                }
                f1 f1Var = (f1) N;
                w1.r z2 = androidx.compose.foundation.layout.b.z(p2.e(w1.o.a, 1.0f), ih.a.n, 0.0f, 2);
                String str7 = (String) f1Var.getValue();
                if (str6 == null) {
                    sVar.c0(-2007446078);
                    sVar.q(false);
                    d = null;
                } else {
                    sVar.c0(-2007446077);
                    d = r1.i.d(-775574948, new bd.m(str6, 5), sVar);
                    sVar.q(false);
                }
                s0.m0 m0Var = new s0.m0((Boolean) null, 3, 123);
                boolean f = sVar.f(f1Var) | ((i3 & 896) == 256);
                Object N2 = sVar.N();
                if (f || N2 == iVar) {
                    N2 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 8);
                    sVar.n0(N2);
                }
                nb.a(str7, (j71.c) N2, z2, false, false, (q0) null, r1.i.d(-1899774265, new bd.m(str, 6), sVar), (j71.e) null, d, (l3.e0) null, m0Var, (l0) null, true, 0, 0, (p0) null, (gb) null, sVar, 1572864, 12779520, 8222648);
                str5 = str6;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.achievements.ui.b0(str, str2, cVar, str5, i, i2, 15);
                return;
            }
            return;
        }
        str4 = str3;
        if (sVar.S(i3 & 1, (i3 & 1171) == 1170)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void d(xn.f1Shadow f1Var, j71.c cVar, j71.c cVar2, j71.c cVar3, j71.c cVar4, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2 = sVar;
        sVar2.e0(-454387174);
        int i2 = i | (sVar2.h(f1Var) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16) | (sVar2.h(cVar2) ? 256 : 128) | (sVar2.h(cVar3) ? 2048 : 1024) | (sVar2.h(cVar4) ? 16384 : 8192);
        if (sVar2.S(i2 & 1, (i2 & 9363) != 9362)) {
            e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            w1.r c = w1.a.c(sVar2, w1.o.a);
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
            Boolean bool = f1Var.b;
            eh.i.b(null, "Has Remaining Chat Quota", null, null, null, null, null, bool != null ? bool.booleanValue() : false, cVar, null, 0L, sVar, ((i2 << 21) & 234881024) | 48, 0, 1661);
            Double d = f1Var.c;
            String valueOf = String.valueOf((int) (d != null ? d.doubleValue() : 0.0d));
            boolean z = (i2 & 896) == 256;
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            Object obj = N;
            if (z || N == iVar) {
                n1 n1Var = new n1(8, cVar2);
                sVar.n0(n1Var);
                obj = n1Var;
            }
            c("Chat Remaining Quota %", valueOf, (j71.c) obj, "%", sVar, 3078, 0);
            eh.i.b(null, "Overage Charge Enabled", null, null, null, null, null, f1Var.d, cVar3, null, 0L, sVar, ((i2 << 15) & 234881024) | 48, 0, 1661);
            sVar2 = sVar;
            String valueOf2 = String.valueOf((int) f1Var.e);
            boolean z2 = (i2 & 57344) == 16384;
            Object N2 = sVar2.N();
            Object obj2 = N2;
            if (z2 || N2 == iVar) {
                n1 n1Var2 = new n1(9, cVar4);
                sVar2.n0(n1Var2);
                obj2 = n1Var2;
            }
            c("Current Overage Count", valueOf2, (j71.c) obj2, null, sVar2, 6, 8);
            sVar2.q(true);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.checkdetail.j(f1Var, cVar, cVar2, cVar3, cVar4, i, 14);
        }
    }
    public static Object w(Object p1, Object p2, Object p3) { return null; }
}
