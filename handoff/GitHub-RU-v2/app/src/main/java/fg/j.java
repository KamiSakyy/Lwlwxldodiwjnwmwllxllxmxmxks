package fg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.uitoolkit.text.i0;
import com.google.android.gms.internal.measurement.i4;
import dc.p;
import f1.ub;
import g3.q0;
import k71.k;
import w1.o;
import w1.r;
import w61.a0;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02fa, code lost:
    
        if (r12 == androidx.compose.runtime.n.a) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final r rVar, final eg.c cVar, final j71.c cVar2, final boolean z, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final j71.a aVar4, final j71.a aVar5, final j71.a aVar6, final j71.a aVar7, final j71.a aVar8, final j71.a aVar9, j71.a aVar10, j71.a aVar11, final eg.a aVar12, s sVar, final int i, final int i2) {
        int i3;
        final j71.a aVar13;
        final j71.a aVar14;
        s sVar2;
        e1 e1Var;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        k.g(cVar, "copilotChatSettingsUiModel");
        e1 e1Var2 = cVar.b;
        k.g(cVar2, "onCopilotEnabledByUserToggle");
        k.g(aVar, "onAboutCopilotChatClick");
        k.g(aVar2, "onAboutCopilotFreeChatClick");
        k.g(aVar3, "onPrivacyPolicyClick");
        k.g(aVar4, "onCopilotTermsClick");
        k.g(aVar5, "onManageSubscriptionClick");
        k.g(aVar6, "onUpgradeToProClick");
        k.g(aVar7, "onUpgradeToProPlusClick");
        k.g(aVar8, "onUpgradeToFreeClick");
        k.g(aVar9, "onUpgradeClick");
        k.g(aVar10, "onCopilotSettingsClick");
        k.g(aVar11, "onCopilotCodeSuggestionsDocsClick");
        k.g(aVar12, "copilotChatMonthlyLicenseDetails");
        sVar.e0(974389014);
        int i4 = i | (sVar.f(rVar) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= sVar.h(cVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= sVar.h(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= sVar.h(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= sVar.h(aVar4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= sVar.h(aVar5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= sVar.h(aVar6) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (sVar.h(aVar7) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sVar.h(aVar8) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.h(aVar9) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.h(aVar10) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sVar.h(aVar11) ? 16384 : 8192;
        }
        int i5 = i3 | (sVar.h(aVar12) ? 131072 : 65536);
        if (sVar.S(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            androidx.compose.foundation.layout.f fVar = l.a;
            float f = ih.a.n;
            e0 a = c0.a(l.g(f), w1.c.D, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            v1 l = sVar.l();
            r c = w1.a.c(sVar, rVar);
            v2.h.o.getClass();
            v2.f fVar2 = v2.g.b;
            sVar.g0();
            if (sVar.S) {
                sVar.k(fVar2);
            } else {
                sVar.q0();
            }
            t.I(sVar, v2.g.f, a);
            t.I(sVar, v2.g.e, l);
            t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar, v2.g.h);
            t.I(sVar, v2.g.d, c);
            o oVar = o.a;
            int i6 = ((i4 >> 3) & 896) | 6;
            int i7 = i4 >> 9;
            g.a(p2.e(oVar, 1.0f), cVar.g, z, cVar.b, cVar.c, aVar5, aVar6, aVar8, aVar7, aVar9, aVar12, cVar.d, cVar.j, cVar.h, sVar, i6 | (i7 & 458752) | (i7 & 3670016) | ((i5 << 18) & 29360128) | ((i5 << 24) & 234881024) | ((i5 << 21) & 1879048192), (i5 >> 15) & 14, 0);
            s sVar3 = sVar;
            e1 e1Var3 = e1.s;
            if (e1Var2 == e1Var3 || e1Var2 == e1.t) {
                sVar3.c0(-450876389);
                e1Var = e1Var2;
                ub.b(i4.p0(2131954528, sVar3), androidx.compose.foundation.layout.b.A(oVar, f, 0, f, f), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).x, sVar, 0, 0, 131068);
                sVar3 = sVar;
                sVar3.q(false);
            } else {
                sVar3.c0(-454610494);
                sVar3.q(false);
                e1Var = e1Var2;
            }
            if (cVar.e) {
                sVar3.c0(-450365509);
                String p0 = i4.p0(2131952003, sVar3);
                String q0 = i4.q0(2131954547, new Object[]{p0}, sVar3);
                String p02 = i4.p0(2131952002, sVar3);
                r x = androidx.compose.foundation.layout.b.x(oVar, f);
                q0 q0Var = ih.d.f(sVar3).x;
                boolean z5 = (i5 & 7168) == 2048;
                Object N = sVar3.N();
                if (!z5) {
                    obj = N;
                }
                com.github.rudroid.agents.base.g gVar = new com.github.rudroid.agents.base.g(12, aVar10);
                sVar3.n0(gVar);
                obj = gVar;
                com.github.rudroid.uitoolkit.text.s.a(x, q0, p0, p02, 0L, q0Var, (j71.c) obj, sVar, 0, 16);
                sVar3 = sVar;
                z2 = false;
                sVar3.q(false);
                z3 = true;
            } else {
                RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                ei.c cVar3 = ei.c.U;
                runtimeFeatureFlag.getClass();
                if (RuntimeFeatureFlag.a(cVar3)) {
                    z2 = false;
                    z3 = true;
                    sVar3.c0(-454610494);
                } else {
                    sVar3.c0(-449605854);
                    z3 = true;
                    eh.e.a(null, i4.p0(2131954522, sVar3), null, null, r1.i.d(-1369399358, new p(cVar, i4.p0(2131954546, sVar3), cVar2, 1), sVar3), sVar3, 24576, 13);
                    z2 = false;
                }
                sVar3.q(z2);
            }
            aVar14 = aVar11;
            aVar13 = aVar10;
            boolean z6 = z2;
            s sVar4 = sVar3;
            eh.e.a(null, i4.p0(2131954520, sVar3), null, null, r1.i.d(-164146403, new com.github.rudroid.actions.workflowruns.ui.f(cVar, aVar2, aVar, aVar3, aVar4, 11), sVar3), sVar4, 24576, 13);
            e1 e1Var4 = e1Var;
            if (e1Var4 == e1Var3 || e1Var4 == e1.t || e1Var4 == e1.u) {
                sVar4.c0(-446597800);
                String p03 = i4.p0(2131954523, sVar4);
                String p04 = i4.p0(2131954525, sVar4);
                z4 = z3;
                com.github.rudroid.uitoolkit.text.s.b(androidx.compose.foundation.layout.b.A(oVar, f, z6 ? 1.0f : 0.0f, f, f), null, i4.q0(2131954524, new Object[]{p03, p04}, sVar4), x61.l.r(new i0[]{new i0(p03, aVar14), new i0(p04, aVar13)}), 0L, ih.d.f(sVar4).x, 0, 0, sVar, 0, 210);
                sVar2 = sVar;
                sVar2.q(z6);
            } else {
                sVar4.c0(-454610494);
                sVar4.q(z6);
                sVar2 = sVar4;
                z4 = z3;
            }
            sVar2.q(z4);
        } else {
            aVar13 = aVar10;
            aVar14 = aVar11;
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e() { // from class: fg.i
                public final Object s(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = t.L(i | 1);
                    int L2 = t.L(i2);
                    j.a(rVar, cVar, cVar2, z, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar13, aVar14, aVar12, (s) obj2, L, L2);
                    return a0.a;
                }
            };
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
