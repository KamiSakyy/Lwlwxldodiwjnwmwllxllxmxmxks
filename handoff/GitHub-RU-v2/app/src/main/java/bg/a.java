package bg;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.v1;
import com.github.rudroid.copilot.ui.n;
import com.github.rudroid.discussions.ui.hShadow;
import com.github.rudroid.fragments.onboarding.notifications.ui.v;
import com.github.rudroid.m0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d2.t;
import d3.q;
import f1.g2;
import f1.p5;
import f1.ub;
import f1.z7;
import g3.q0;
import g3.z;
import java.util.Locale;
import k3.i;
import k71.k;
import qg.g;
import w1.o;
import w1.r;
import w61.a0;
import z.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;

    public /* synthetic */ a(boolean z) {
        this.r = 6;
        this.s = z;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i;
        float f;
        boolean z;
        long j;
        int i2;
        int i3;
        int i4 = this.r;
        o oVar = o.a;
        a0 a0Var = a0.a;
        boolean z2 = this.s;
        switch (i4) {
            case 0:
                s sVar = (s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k.g((m2) obj, "$this$PrimaryButton");
                if (!sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    sVar.V();
                    break;
                } else {
                    String upperCase = i4.p0(z2 ? 2131951796 : 2131951797, sVar).toUpperCase(Locale.ROOT);
                    k.f(upperCase, "toUpperCase(...)");
                    ub.b(upperCase, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar, 0, 0, 262142);
                    break;
                }
            case 1:
                s sVar2 = (s) obj2;
                ((Integer) obj3).getClass();
                k.g((y) obj, "$this$AnimatedVisibility");
                if (z2) {
                    f = ih.a.p;
                    i = 0;
                } else {
                    i = 0;
                    f = 0;
                }
                p5.a(z3.C(2131231444, i, sVar2), (String) null, androidx.compose.foundation.layout.b.B(o.a, f, 0.0f, 0.0f, 0.0f, 14), ih.d.a(sVar2).c, sVar2, 56, 0);
                break;
            case 2:
                s sVar3 = (s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                float f2 = n.a;
                k.g((m2) obj, "$this$PrimaryIconButton");
                if (!sVar3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    sVar3.V();
                    break;
                } else if (!z2) {
                    sVar3.c0(-1975714054);
                    p5.a(z3.C(2131231436, 0, sVar3), i4.p0(2131954110, sVar3), (r) null, 0L, sVar3, 8, 12);
                    sVar3.q(false);
                    break;
                } else {
                    sVar3.c0(-1975904890);
                    z7.a(p2.o(oVar, 24), ((t) sVar3.j(g2.a)).a, 2, 0L, 0, 0.0f, sVar3, 390, 56);
                    sVar3.q(false);
                    break;
                }
            case 3:
                s sVar4 = (s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k.g((m2) obj, "$this$PrimaryButton");
                if (!sVar4.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    sVar4.V();
                    break;
                } else {
                    Object N = sVar4.N();
                    if (N == androidx.compose.runtime.n.a) {
                        N = new h(7);
                        sVar4.n0(N);
                    }
                    r a = q.a(oVar, (j71.c) N);
                    String upperCase2 = i4.p0(z2 ? 2131952598 : 2131952599, sVar4).toUpperCase(Locale.ROOT);
                    k.f(upperCase2, "toUpperCase(...)");
                    ub.b(upperCase2, a, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar4).h, ih.d.b(sVar4).F, 0L, (k3.s) null, (k3.o) null, (i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), sVar4, 0, 0, 131068);
                    break;
                }
            case 4:
                s sVar5 = (s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k.g((m2) obj, "$this$PrimarySheetHeader");
                if (!sVar5.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sVar5.V();
                    break;
                } else {
                    if (z2) {
                        sVar5.c0(1019798690);
                        z = false;
                        g.a(null, sVar5, 0);
                    } else {
                        z = false;
                        sVar5.c0(1015436866);
                    }
                    sVar5.q(z);
                    break;
                }
            case 5:
                s sVar6 = (s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                w1.h hVar = w1.c.D;
                k.g((f0) obj, "$this$NotificationsOnboardingScreen");
                if (!sVar6.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    sVar6.V();
                    break;
                } else {
                    if (z2) {
                        sVar6.c0(1757598712);
                        e0 a2 = c0.a(l.c, hVar, sVar6, 0);
                        int hashCode = Long.hashCode(sVar6.T);
                        v1 l = sVar6.l();
                        r c = w1.a.c(sVar6, oVar);
                        v2.h.o.getClass();
                        v2.f fVar = v2.g.b;
                        sVar6.g0();
                        if (sVar6.S) {
                            sVar6.k(fVar);
                        } else {
                            sVar6.q0();
                        }
                        androidx.compose.runtime.t.I(sVar6, v2.g.f, a2);
                        androidx.compose.runtime.t.I(sVar6, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar6, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar6, v2.g.h);
                        androidx.compose.runtime.t.I(sVar6, v2.g.d, c);
                        v.a(p2.e(oVar, 1.0f), i4.p0(2131953341, sVar6), i4.p0(2131953340, sVar6), sVar6, 6);
                        sVar6.q(true);
                    } else {
                        sVar6.c0(1754266119);
                    }
                    sVar6.q(false);
                    androidx.compose.foundation.layout.g gVar = l.c;
                    e0 a3 = c0.a(gVar, hVar, sVar6, 0);
                    int hashCode2 = Long.hashCode(sVar6.T);
                    v1 l2 = sVar6.l();
                    r c2 = w1.a.c(sVar6, oVar);
                    v2.h.o.getClass();
                    v2.f fVar2 = v2.g.b;
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.q0();
                    }
                    v2.eShadow eVar = v2.g.f;
                    androidx.compose.runtime.t.I(sVar6, eVar, a3);
                    v2.eShadow eVar2 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar6, eVar2, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    v2.eShadow eVar3 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar6, valueOf, eVar3);
                    v2.d dVar = v2.g.h;
                    androidx.compose.runtime.t.E(sVar6, dVar);
                    v2.eShadow eVar4 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar6, eVar4, c2);
                    v.a(p2.e(oVar, 1.0f), i4.p0(2131953337, sVar6), i4.p0(2131953336, sVar6), sVar6, 6);
                    sVar6.q(true);
                    e0 a4 = c0.a(gVar, hVar, sVar6, 0);
                    int hashCode3 = Long.hashCode(sVar6.T);
                    v1 l3 = sVar6.l();
                    r c3 = w1.a.c(sVar6, oVar);
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, eVar, a4);
                    androidx.compose.runtime.t.I(sVar6, eVar2, l3);
                    f1.e.t(hashCode3, sVar6, eVar3, sVar6, dVar);
                    androidx.compose.runtime.t.I(sVar6, eVar4, c3);
                    v.a(p2.e(oVar, 1.0f), i4.p0(2131953339, sVar6), i4.p0(2131953338, sVar6), sVar6, 6);
                    sVar6.q(true);
                    e0 a5 = c0.a(gVar, hVar, sVar6, 0);
                    int hashCode4 = Long.hashCode(sVar6.T);
                    v1 l4 = sVar6.l();
                    r c4 = w1.a.c(sVar6, oVar);
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar2);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, eVar, a5);
                    androidx.compose.runtime.t.I(sVar6, eVar2, l4);
                    f1.e.t(hashCode4, sVar6, eVar3, sVar6, dVar);
                    androidx.compose.runtime.t.I(sVar6, eVar4, c4);
                    v.a(p2.e(oVar, 1.0f), i4.p0(2131953343, sVar6), i4.p0(2131953342, sVar6), sVar6, 6);
                    sVar6.q(true);
                    break;
                }
            case 6:
                s sVar7 = (s) obj2;
                ((Integer) obj3).getClass();
                k.g((y) obj, "$this$AnimatedVisibility");
                int i5 = z2 ? 2131231165 : 2131231179;
                if (z2) {
                    sVar7.c0(-1166763649);
                    j = ih.d.b(sVar7).F;
                    sVar7.q(false);
                } else {
                    sVar7.c0(-1166700874);
                    j = ih.d.b(sVar7).A;
                    sVar7.q(false);
                }
                p5.a(z3.C(i5, 0, sVar7), (String) null, androidx.compose.foundation.layout.b.B(o.a, 0.0f, 0.0f, ih.a.n, 0.0f, 11), j, sVar7, 56, 0);
                break;
            case 7:
                s sVar8 = (s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                k.g((m2) obj, "$this$TextButton");
                if (!sVar8.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    sVar8.V();
                    break;
                } else {
                    if (z2) {
                        i2 = -1762255661;
                        i3 = 2131953425;
                    } else {
                        i2 = -1762156461;
                        i3 = 2131953426;
                    }
                    ub.b(m0.d(sVar8, i2, i3, sVar8, false), (r) null, ih.d.b(sVar8).v, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar8).j, sVar8, 0, 0, 131066);
                    break;
                }
            default:
                ((Boolean) obj).getClass();
                s sVar9 = (s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if (!sVar9.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    sVar9.V();
                    break;
                } else {
                    if (z2) {
                        sVar9.c0(-1176328895);
                        yg.tShadow.b(i4.p0(2131954562, sVar9), sVar9, 0);
                    } else {
                        sVar9.c0(-1177930355);
                    }
                    sVar9.q(false);
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ a(boolean z, int i) {
        this.r = i;
        this.s = z;
    }
}
