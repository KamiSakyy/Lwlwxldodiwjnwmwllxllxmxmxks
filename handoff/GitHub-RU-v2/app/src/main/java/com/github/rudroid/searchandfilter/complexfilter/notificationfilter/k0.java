package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.v1;
import com.github.rudroid.searchandfilter.complexfilter.repository.a;
import com.github.rudroid.uitoolkit.a1;
import com.github.rudroid.uitoolkit.e3;
import com.github.rudroid.uitoolkit.f1;
import com.github.rudroid.uitoolkit.l1;
import com.github.rudroid.uitoolkit.m2;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.organizations.Organization;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.e8;
import f1.p5;
import f1.ub;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k0 implements j71.e {
    public final /* synthetic */ int r;

    public /* synthetic */ k0(int i) {
        this.r = i;
    }

    public final Object s(Object obj, Object obj2) {
        boolean b;
        int i = this.r;
        Object obj3 = androidx.compose.runtime.n.a;
        w1.o oVar = w1.o.a;
        w61.a0 a0Var = w61.a0.a;
        switch (i) {
            case 0:
                com.github.domain.searchandfilter.filters.data.notification.a aVar = (com.github.domain.searchandfilter.filters.data.notification.a) obj;
                com.github.domain.searchandfilter.filters.data.notification.a aVar2 = (com.github.domain.searchandfilter.filters.data.notification.a) obj2;
                int i2 = s0.F;
                k71.k.g(aVar, "first");
                k71.k.g(aVar2, "second");
                b = k71.k.b(aVar.getId(), aVar2.getId());
                break;
            case 1:
                Organization organization = (Organization) obj;
                Organization organization2 = (Organization) obj2;
                int i3 = com.github.rudroid.searchandfilter.complexfilter.organization.o.E;
                k71.k.g(organization, "first");
                k71.k.g(organization2, "second");
                b = k71.k.b(organization.t, organization2.t);
                break;
            case 2:
                LegacyProjectWithNumber legacyProjectWithNumber = (LegacyProjectWithNumber) obj;
                LegacyProjectWithNumber legacyProjectWithNumber2 = (LegacyProjectWithNumber) obj2;
                int i4 = com.github.rudroid.searchandfilter.complexfilter.project.i.I;
                k71.k.g(legacyProjectWithNumber, "t");
                k71.k.g(legacyProjectWithNumber2, "v");
                b = k71.k.b(i21.a.M(legacyProjectWithNumber), i21.a.M(legacyProjectWithNumber2));
                break;
            case 3:
                LegacyProjectWithNumber legacyProjectWithNumber3 = (LegacyProjectWithNumber) obj;
                LegacyProjectWithNumber legacyProjectWithNumber4 = (LegacyProjectWithNumber) obj2;
                int i5 = com.github.rudroid.searchandfilter.complexfilter.project.y.I;
                k71.k.g(legacyProjectWithNumber3, "t");
                k71.k.g(legacyProjectWithNumber4, "v");
                b = k71.k.b(i21.a.M(legacyProjectWithNumber3), i21.a.M(legacyProjectWithNumber4));
                break;
            case 4:
                SimpleRepository simpleRepository = (SimpleRepository) obj;
                SimpleRepository simpleRepository2 = (SimpleRepository) obj2;
                a.C0001a c0001a = com.github.rudroid.searchandfilter.complexfilter.repository.a.Companion;
                k71.k.g(simpleRepository, "t");
                k71.k.g(simpleRepository2, "v");
                b = k71.k.b(com.github.rudroid.searchandfilter.complexfilter.repository.w.a(simpleRepository), com.github.rudroid.searchandfilter.complexfilter.repository.w.a(simpleRepository2));
                break;
            case 5:
                yz0.f fVar = (yz0.f) obj;
                yz0.f fVar2 = (yz0.f) obj2;
                int i6 = com.github.rudroid.searchandfilter.complexfilter.user.d.I;
                k71.k.g(fVar, "t");
                k71.k.g(fVar2, "v");
                b = k71.k.b(fVar.d(), fVar2.d());
                break;
            case 6:
                yz0.f fVar3 = (yz0.f) obj;
                yz0.f fVar4 = (yz0.f) obj2;
                int i7 = com.github.rudroid.searchandfilter.complexfilter.user.assignee.f.J;
                k71.k.g(fVar3, "t");
                k71.k.g(fVar4, "v");
                b = k71.k.b(fVar3.d(), fVar4.d());
                break;
            case 7:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    Object N = sVar.N();
                    if (N == obj3) {
                        N = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(21);
                        sVar.n0(N);
                    }
                    ub.b(i4.p0(2131954503, sVar), d3.q.b(oVar, false, (j71.c) N), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar).C, sVar, 0, 24960, 110588);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 8:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ub.b("License Type", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar2, 6, 0, 262142);
                } else {
                    sVar2.V();
                }
                return a0Var;
            case 9:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    p5.a(z3.C(2131231500, 0, sVar3), i4.p0(2131953802, sVar3), (w1.r) null, ih.d.b(sVar3).A, sVar3, 8, 4);
                } else {
                    sVar3.V();
                }
                return a0Var;
            case 10:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    p5.a(z3.C(2131231500, 0, sVar4), i4.p0(2131953802, sVar4), (w1.r) null, ih.d.b(sVar4).A, sVar4, 8, 4);
                } else {
                    sVar4.V();
                }
                return a0Var;
            case 11:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String upperCase = i4.p0(2131952157, sVar5).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    ub.b(upperCase, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, g3.q0.a(ih.d.f(sVar5).h, ih.d.a(sVar5).s, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar5, 0, 0, 131070);
                } else {
                    sVar5.V();
                }
                return a0Var;
            case 12:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (sVar6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    p5.a(z3.C(2131231500, 0, sVar6), i4.p0(2131953802, sVar6), (w1.r) null, ih.d.b(sVar6).A, sVar6, 8, 4);
                } else {
                    sVar6.V();
                }
                return a0Var;
            case 13:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (sVar7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    f1.a(p2.f(p2.e(oVar, 1.0f), ih.a.I), null, 0.0f, 0L, sVar7, 0, 14);
                } else {
                    sVar7.V();
                }
                return a0Var;
            case 14:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (sVar8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.h0.a(null, i4.p0(2131953020, sVar8), null, sVar8, 0, 5);
                } else {
                    sVar8.V();
                }
                return a0Var;
            case 15:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (sVar9.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.h0.a(null, i4.p0(2131953013, sVar9), null, sVar9, 0, 5);
                } else {
                    sVar9.V();
                }
                return a0Var;
            case 16:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (sVar10.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                    com.github.rudroid.utilities.ui.f0.b(2131953516, 0, sVar10, null);
                } else {
                    sVar10.V();
                }
                return a0Var;
            case 17:
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (sVar11.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                    p5.a(z3.C(2131231341, 0, sVar11), i4.p0(2131953849, sVar11), (w1.r) null, ih.d.a(sVar11).H, sVar11, 8, 4);
                } else {
                    sVar11.V();
                }
                return a0Var;
            case 18:
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (sVar12.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.z(oVar, 8, 0.0f, 2), null, "Label chip without icon", 0.0f, null, null, 0, d2.t.g, d2.t.f, 0.0f, null, 0L, null, sVar12, 113246598, 384, 3706);
                } else {
                    sVar12.V();
                }
                return a0Var;
            case 19:
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (sVar13.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.z(oVar, 8, 0.0f, 2), null, "Label chip with icon", 0.0f, null, null, 0, 0L, d2.t.c, 0.0f, com.github.rudroid.uitoolkit.text.m.b(2131231432, null, null, 14), d2.t.g, null, sVar13, 100663686, 432, 762);
                } else {
                    sVar13.V();
                }
                return a0Var;
            case 20:
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (sVar14.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                    a1.a(androidx.compose.foundation.layout.b.z(oVar, ih.a.l, 0.0f, 2), "login", "Firstname Lastname", "", 0.0f, sVar14, 3510, 16);
                } else {
                    sVar14.V();
                }
                return a0Var;
            case 21:
                boolean z = false;
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z = true;
                }
                if (sVar15.S(intValue15 & 1, z)) {
                    a1.a(androidx.compose.foundation.layout.b.z(oVar, ih.a.l, 0.0f, 2), "login", null, "", 0.0f, sVar15, 3510, 16);
                } else {
                    sVar15.V();
                }
                return a0Var;
            case 22:
                androidx.compose.runtime.s sVar16 = (androidx.compose.runtime.s) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (sVar16.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                    e8.g((w1.r) null, 1, ih.d.b(sVar16).p, sVar16, 48, 1);
                } else {
                    sVar16.V();
                }
                return a0Var;
            case 23:
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (sVar17.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Object N2 = sVar17.N();
                    if (N2 == obj3) {
                        N2 = new com.github.rudroid.widget.p(15);
                        sVar17.n0(N2);
                    }
                    l1.a(true, (j71.a) N2, "Edit", null, sVar17, 438);
                    Object N3 = sVar17.N();
                    if (N3 == obj3) {
                        N3 = new com.github.rudroid.widget.p(15);
                        sVar17.n0(N3);
                    }
                    l1.a(false, (j71.a) N3, "Preview", null, sVar17, 438);
                } else {
                    sVar17.V();
                }
                return a0Var;
            case 24:
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if (sVar18.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                    p5.a(z3.C(2131231338, 0, sVar18), (String) null, (w1.r) null, ih.d.b(sVar18).A, sVar18, 56, 4);
                } else {
                    sVar18.V();
                }
                return a0Var;
            case 25:
                androidx.compose.runtime.s sVar19 = (androidx.compose.runtime.s) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if (sVar19.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar19, 0);
                    int hashCode = Long.hashCode(sVar19.T);
                    v1 l = sVar19.l();
                    w1.r c = w1.a.c(sVar19, oVar);
                    v2.h.o.getClass();
                    v2.f fVar5 = v2.g.b;
                    sVar19.g0();
                    if (sVar19.S) {
                        sVar19.k(fVar5);
                    } else {
                        sVar19.q0();
                    }
                    androidx.compose.runtime.t.I(sVar19, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar19, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar19, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar19, v2.g.h);
                    androidx.compose.runtime.t.I(sVar19, v2.g.d, c);
                    float f = 48;
                    w1.r f2 = p2.f(oVar, f);
                    float f3 = ih.a.l;
                    m2.a("Editable", androidx.compose.foundation.layout.b.z(f2, f3, 0.0f, 2), com.github.rudroid.uitoolkit.y.b, sVar19, 438, 0);
                    m2.a("Not editable", androidx.compose.foundation.layout.b.z(p2.f(oVar, f), f3, 0.0f, 2), null, sVar19, 54, 4);
                    sVar19.q(true);
                } else {
                    sVar19.V();
                }
                return a0Var;
            case 26:
                androidx.compose.runtime.s sVar20 = (androidx.compose.runtime.s) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if (sVar20.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                    w1.r z2 = androidx.compose.foundation.layout.b.z(oVar, ih.a.l, 0.0f, 2);
                    Object N4 = sVar20.N();
                    if (N4 == obj3) {
                        N4 = new com.github.rudroid.starredreposandlists.u0(4);
                        sVar20.n0(N4);
                    }
                    e3.a(z2, (j71.c) N4, "login", "Firstname Lastname", "", 0.0f, sVar20, 28086, 32);
                } else {
                    sVar20.V();
                }
                return a0Var;
            case 27:
                androidx.compose.runtime.s sVar21 = (androidx.compose.runtime.s) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if (sVar21.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                    w1.r z3 = androidx.compose.foundation.layout.b.z(oVar, ih.a.l, 0.0f, 2);
                    Object N5 = sVar21.N();
                    if (N5 == obj3) {
                        N5 = new com.github.rudroid.starredreposandlists.u0(5);
                        sVar21.n0(N5);
                    }
                    e3.a(z3, (j71.c) N5, "login", null, "", 0.0f, sVar21, 28086, 32);
                } else {
                    sVar21.V();
                }
                return a0Var;
            case 28:
                androidx.compose.runtime.s sVar22 = (androidx.compose.runtime.s) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if (sVar22.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.j.b(p2.o(oVar, 22), null, i4.q0(2131953411, new Object[]{2}, sVar22), 0.0f, null, null, 0, ih.d.b(sVar22).a, ih.d.b(sVar22).b, 0.0f, null, 0L, null, sVar22, 6, 384, 3706);
                } else {
                    sVar22.V();
                }
                return a0Var;
            default:
                androidx.compose.runtime.s sVar23 = (androidx.compose.runtime.s) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if (sVar23.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                    p5.a(z3.C(2131231499, 0, sVar23), "", (w1.r) null, ih.d.b(sVar23).A, sVar23, 56, 4);
                } else {
                    sVar23.V();
                }
                return a0Var;
        }
        return Boolean.valueOf(b);
    }
}
