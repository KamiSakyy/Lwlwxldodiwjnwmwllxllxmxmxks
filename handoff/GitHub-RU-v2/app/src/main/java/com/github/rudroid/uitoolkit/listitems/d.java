package com.github.rudroid.uitoolkit.listitems;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.v1;
import com.github.rudroid.utilities.y1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;
import f1.z7;
import g3.q0;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.f {
    public final /* synthetic */ int r;

    public /* synthetic */ d(int i) {
        this.r = i;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    p5.a(z3.C(2131231290, 0, sVar), (String) null, androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, ih.a.k, 0.0f, 0.0f, 13), ih.d.b(sVar).z, sVar, 440, 0);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar2, 0);
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
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar2, 6, 0, 262142);
                    sVar2.q(true);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
            case 2:
                androidx.compose.foundation.layout.x xVar = (androidx.compose.foundation.layout.x) obj;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k71.k.g(xVar, "$this$ListItemScaffold");
                if ((intValue3 & 6) == 0) {
                    intValue3 |= sVar3.f(xVar) ? 4 : 2;
                }
                if (sVar3.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                    ub.b("543", xVar.a(w1.o.a, w1.c.v), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).v, sVar3, 6, 0, 131068);
                } else {
                    sVar3.V();
                }
                return w61.a0.a;
            case 3:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar4.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar4, 0);
                    int hashCode2 = Long.hashCode(sVar4.T);
                    v1 l2 = sVar4.l();
                    w1.r c2 = w1.a.c(sVar4, w1.o.a);
                    v2.h.o.getClass();
                    v2.f fVar2 = v2.g.b;
                    sVar4.g0();
                    if (sVar4.S) {
                        sVar4.k(fVar2);
                    } else {
                        sVar4.q0();
                    }
                    androidx.compose.runtime.t.I(sVar4, v2.g.f, a2);
                    androidx.compose.runtime.t.I(sVar4, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar4, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar4, v2.g.h);
                    androidx.compose.runtime.t.I(sVar4, v2.g.d, c2);
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar4, 6, 0, 262142);
                    ub.b("Subtitle with a longer text, this could be a description of the item", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).x, sVar4, 6, 0, 131070);
                    sVar4.q(true);
                } else {
                    sVar4.V();
                }
                return w61.a0.a;
            case 4:
                androidx.compose.foundation.layout.x xVar2 = (androidx.compose.foundation.layout.x) obj;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                k71.k.g(xVar2, "$this$ListItemScaffold");
                if ((intValue5 & 6) == 0) {
                    intValue5 |= sVar5.f(xVar2) ? 4 : 2;
                }
                if (sVar5.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ub.b("543", xVar2.a(w1.o.a, w1.c.v), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar5).v, sVar5, 6, 0, 131068);
                } else {
                    sVar5.V();
                }
                return w61.a0.a;
            case 5:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar6.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a3 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar6, 0);
                    int hashCode3 = Long.hashCode(sVar6.T);
                    v1 l3 = sVar6.l();
                    w1.r c3 = w1.a.c(sVar6, w1.o.a);
                    v2.h.o.getClass();
                    v2.f fVar3 = v2.g.b;
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar3);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, v2.g.f, a3);
                    androidx.compose.runtime.t.I(sVar6, v2.g.e, l3);
                    androidx.compose.runtime.t.w(sVar6, Integer.valueOf(hashCode3), v2.g.g);
                    androidx.compose.runtime.t.E(sVar6, v2.g.h);
                    androidx.compose.runtime.t.I(sVar6, v2.g.d, c3);
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar6, 6, 0, 262142);
                    ub.b("Subtitle with a longer text, this could be a description of the item", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar6).x, sVar6, 6, 0, 131070);
                    sVar6.q(true);
                } else {
                    sVar6.V();
                }
                return w61.a0.a;
            case 6:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar7.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    androidx.compose.foundation.layout.e0 a4 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar7, 0);
                    int hashCode4 = Long.hashCode(sVar7.T);
                    v1 l4 = sVar7.l();
                    w1.r c4 = w1.a.c(sVar7, w1.o.a);
                    v2.h.o.getClass();
                    v2.f fVar4 = v2.g.b;
                    sVar7.g0();
                    if (sVar7.S) {
                        sVar7.k(fVar4);
                    } else {
                        sVar7.q0();
                    }
                    androidx.compose.runtime.t.I(sVar7, v2.g.f, a4);
                    androidx.compose.runtime.t.I(sVar7, v2.g.e, l4);
                    androidx.compose.runtime.t.w(sVar7, Integer.valueOf(hashCode4), v2.g.g);
                    androidx.compose.runtime.t.E(sVar7, v2.g.h);
                    androidx.compose.runtime.t.I(sVar7, v2.g.d, c4);
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar7, 6, 0, 262142);
                    ub.b("Subtitle with a longer text, this could be a description of the item", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar7).x, sVar7, 6, 0, 131070);
                    sVar7.q(true);
                } else {
                    sVar7.V();
                }
                return w61.a0.a;
            case 7:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "$this$ListItemScaffold");
                if (sVar8.S(intValue8 & 1, (intValue8 & 17) != 16)) {
                    p5.a(z3.C(2131231290, 0, sVar8), (String) null, androidx.compose.foundation.layout.b.B(w1.o.a, 0.0f, ih.a.k, 0.0f, 0.0f, 13), ih.d.b(sVar8).z, sVar8, 440, 0);
                } else {
                    sVar8.V();
                }
                return w61.a0.a;
            case 8:
                m2 m2Var = (m2) obj;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                k71.k.g(m2Var, "$this$CompoundDrawableText");
                if ((intValue9 & 6) == 0) {
                    intValue9 |= sVar9.f(m2Var) ? 4 : 2;
                }
                if (sVar9.S(intValue9 & 1, (intValue9 & 19) != 18)) {
                    ub.b("This is table with a title very very very vey long", m2Var.a(w1.o.a, 1.0f, true), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, (q0) null, sVar9, 6, 24960, 241660);
                } else {
                    sVar9.V();
                }
                return w61.a0.a;
            case 9:
                m2 m2Var2 = (m2) obj;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                k71.k.g(m2Var2, "$this$CompoundDrawableText");
                if ((intValue10 & 6) == 0) {
                    intValue10 |= sVar10.f(m2Var2) ? 4 : 2;
                }
                if (sVar10.S(intValue10 & 1, (intValue10 & 19) != 18)) {
                    ub.b("This is table with a title very very very vey long", m2Var2.a(w1.o.a, 1.0f, true), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, (q0) null, sVar10, 6, 24960, 241660);
                } else {
                    sVar10.V();
                }
                return w61.a0.a;
            case 10:
                m2 m2Var3 = (m2) obj;
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                k71.k.g(m2Var3, "$this$CompoundDrawableText");
                if ((intValue11 & 6) == 0) {
                    intValue11 |= sVar11.f(m2Var3) ? 4 : 2;
                }
                if (sVar11.S(intValue11 & 1, (intValue11 & 19) != 18)) {
                    ub.b("This is table with a title very very very vey long", m2Var3.a(w1.o.a, 1.0f, true), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, (q0) null, sVar11, 6, 24960, 241660);
                } else {
                    sVar11.V();
                }
                return w61.a0.a;
            case 11:
                ((Integer) obj3).getClass();
                k71.k.g((fl.b) obj, "it");
                com.github.rudroid.utilities.ui.f0.b(2131952512, 0, (androidx.compose.runtime.s) obj2, null);
                break;
            case 12:
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.x) obj, "<this>");
                if (!sVar12.S(intValue12 & 1, (intValue12 & 17) != 16)) {
                    sVar12.V();
                }
                return w61.a0.a;
            case 13:
                ((Integer) obj3).getClass();
                k71.k.g((fl.b) obj, "it");
                com.github.rudroid.utilities.ui.f0.b(2131952512, 0, (androidx.compose.runtime.s) obj2, null);
                break;
            case 14:
                ((Integer) obj3).getClass();
                k71.k.g((fl.b) obj, "it");
                com.github.rudroid.utilities.ui.f0.b(2131952512, 0, (androidx.compose.runtime.s) obj2, null);
                break;
            case 15:
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                k71.k.g((m0.b) obj, "$this$item");
                if (sVar13.S(intValue13 & 1, (intValue13 & 17) != 16)) {
                    androidx.compose.foundation.layout.b.g(sVar13, p2.f(w1.o.a, ih.a.G));
                } else {
                    sVar13.V();
                }
                return w61.a0.a;
            case 16:
                m2 m2Var4 = (m2) obj;
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                k71.k.g(m2Var4, "$this$CopilotBannerContainer");
                if ((intValue14 & 6) == 0) {
                    intValue14 |= sVar14.f(m2Var4) ? 4 : 2;
                }
                if (sVar14.S(intValue14 & 1, (intValue14 & 19) != 18)) {
                    ub.b("This is a dismissible banner\nThis is a dismissible banner\nThis is a dismissible banner", m2Var4.a(w1.o.a, 1.0f, true), ih.d.b(sVar14).s, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar14, 0, 0, 262136);
                } else {
                    sVar14.V();
                }
                return w61.a0.a;
            case 17:
                m2 m2Var5 = (m2) obj;
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                k71.k.g(m2Var5, "$this$CopilotBannerContainer");
                if ((intValue15 & 6) == 0) {
                    intValue15 |= sVar15.f(m2Var5) ? 4 : 2;
                }
                if (sVar15.S(intValue15 & 1, (intValue15 & 19) != 18)) {
                    ub.b("This is a non-dismissible banner\nThis is a non-dismissible banner\nThis is a non-dismissible banner", m2Var5.a(w1.o.a, 1.0f, true), ih.d.b(sVar15).s, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar15, 0, 0, 262136);
                } else {
                    sVar15.V();
                }
                return w61.a0.a;
            case 18:
                m2 m2Var6 = (m2) obj;
                androidx.compose.runtime.s sVar16 = (androidx.compose.runtime.s) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                k71.k.g(m2Var6, "$this$CopilotBannerContainer");
                if ((intValue16 & 6) == 0) {
                    intValue16 |= sVar16.f(m2Var6) ? 4 : 2;
                }
                if (sVar16.S(intValue16 & 1, (intValue16 & 19) != 18)) {
                    String p0 = i4.p0(2131952155, sVar16);
                    String p02 = i4.p0(2131952154, sVar16);
                    w1.r a5 = m2Var6.a(w1.o.a, 1.0f, true);
                    StringBuilder sb = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb.append(p0);
                    String sb2 = sb.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(((g3.c) arrayList.get(i)).a(sb.length()));
                    }
                    g3.g gVar = new g3.g(sb2, arrayList2);
                    StringBuilder sb3 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    sb3.append(p02);
                    String sb4 = sb3.toString();
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(((g3.c) arrayList3.get(i2)).a(sb3.length()));
                    }
                    dc.j.a(a5, gVar, new g3.g(sb4, arrayList4), sVar16, 0, 0);
                } else {
                    sVar16.V();
                }
                return w61.a0.a;
            case 19:
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (sVar17.S(intValue17 & 1, (intValue17 & 17) != 16)) {
                    em.a aVar = y1.a;
                    com.github.rudroid.projects.ui.f.a((w1.r) null, x61.l.r(new em.a[]{aVar, aVar, aVar, aVar, aVar, aVar, aVar, aVar}), ih.d.f(sVar17).t, sVar17, 0, 1);
                } else {
                    sVar17.V();
                }
                return w61.a0.a;
            case 20:
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTextButton");
                if (sVar18.S(intValue18 & 1, (intValue18 & 17) != 16)) {
                    w1.r e = p2.e(w1.o.a, 1.0f);
                    String upperCase = i4.p0(2131953113, sVar18).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    ub.b(upperCase, e, 0L, 0L, (k3.s) null, 0L, new r3.k(5), 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar18).v, ih.d.b(sVar18).s0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar18, 48, 0, 130044);
                } else {
                    sVar18.V();
                }
                return w61.a0.a;
            case 21:
                androidx.compose.runtime.s sVar19 = (androidx.compose.runtime.s) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTextButton");
                if (sVar19.S(intValue19 & 1, (intValue19 & 17) != 16)) {
                    String upperCase2 = i4.p0(2131951852, sVar19).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase2, "toUpperCase(...)");
                    ub.b(upperCase2, (w1.r) null, ih.d.b(sVar19).F, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar19, 0, 0, 262138);
                } else {
                    sVar19.V();
                }
                return w61.a0.a;
            case 22:
                androidx.compose.runtime.s sVar20 = (androidx.compose.runtime.s) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTextButton");
                if (sVar20.S(intValue20 & 1, (intValue20 & 17) != 16)) {
                    String upperCase3 = i4.p0(2131951841, sVar20).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase3, "toUpperCase(...)");
                    ub.b(upperCase3, (w1.r) null, ih.d.b(sVar20).F, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar20, 0, 0, 262138);
                } else {
                    sVar20.V();
                }
                return w61.a0.a;
            case 23:
                androidx.compose.runtime.s sVar21 = (androidx.compose.runtime.s) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$PrimaryPreferenceGroup");
                if (sVar21.S(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Object N = sVar21.N();
                    Object obj4 = androidx.compose.runtime.n.a;
                    if (N == obj4) {
                        N = new com.github.rudroid.copilot.h(26);
                        sVar21.n0(N);
                    }
                    eh.i.b(null, "Switch preference", null, null, null, null, null, true, (j71.c) N, null, 0L, sVar21, 113246256, 0, 1661);
                    Object N2 = sVar21.N();
                    if (N2 == obj4) {
                        N2 = new com.github.rudroid.widget.p(15);
                        sVar21.n0(N2);
                    }
                    eh.f.a(null, "Simple Preference", null, "Summary", null, null, (j71.a) N2, "Simple Preference Summary", sVar21, 14158896, 53);
                } else {
                    sVar21.V();
                }
                return w61.a0.a;
            case 24:
                androidx.compose.runtime.s sVar22 = (androidx.compose.runtime.s) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "<this>");
                if (!sVar22.S(intValue22 & 1, (intValue22 & 17) != 16)) {
                    sVar22.V();
                }
                return w61.a0.a;
            case 25:
                androidx.compose.runtime.s sVar23 = (androidx.compose.runtime.s) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryButton");
                if (sVar23.S(intValue23 & 1, (intValue23 & 17) != 16)) {
                    String upperCase4 = i4.p0(2131954541, sVar23).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase4, "toUpperCase(...)");
                    ub.b(upperCase4, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar23, 0, 0, 262142);
                } else {
                    sVar23.V();
                }
                return w61.a0.a;
            case 26:
                androidx.compose.runtime.s sVar24 = (androidx.compose.runtime.s) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryButton");
                if (sVar24.S(intValue24 & 1, (intValue24 & 17) != 16)) {
                    String upperCase5 = i4.p0(2131954542, sVar24).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase5, "toUpperCase(...)");
                    ub.b(upperCase5, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar24, 0, 0, 262142);
                } else {
                    sVar24.V();
                }
                return w61.a0.a;
            case 27:
                androidx.compose.runtime.s sVar25 = (androidx.compose.runtime.s) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryButton");
                if (sVar25.S(intValue25 & 1, (intValue25 & 17) != 16)) {
                    String upperCase6 = i4.p0(2131954543, sVar25).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase6, "toUpperCase(...)");
                    ub.b(upperCase6, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar25, 0, 0, 262142);
                } else {
                    sVar25.V();
                }
                return w61.a0.a;
            case 28:
                androidx.compose.runtime.s sVar26 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((z.y) obj, "$this$AnimatedVisibility");
                z7.a(p2.o(w1.o.a, 26), ih.d.b(sVar26).F, (float) 1.5d, 0L, 0, 0.0f, sVar26, 390, 56);
                break;
            default:
                g0.c cVar = (g0.c) obj;
                androidx.compose.runtime.s sVar27 = (androidx.compose.runtime.s) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                if ((intValue26 & 6) == 0) {
                    intValue26 |= sVar27.f(cVar) ? 4 : 2;
                }
                if (sVar27.S(intValue26 & 1, (intValue26 & 19) != 18)) {
                    androidx.compose.foundation.layout.t.a(f0.o.f(p2.f(p2.e(androidx.compose.foundation.layout.b.z(w1.o.a, 0.0f, g0.e.l, 1), 1.0f), g0.e.k), cVar.c, d2.a0Shadow.b), sVar27, 0);
                } else {
                    sVar27.V();
                }
                return w61.a0.a;
        }
        return w61.a0.a;
    }
}
