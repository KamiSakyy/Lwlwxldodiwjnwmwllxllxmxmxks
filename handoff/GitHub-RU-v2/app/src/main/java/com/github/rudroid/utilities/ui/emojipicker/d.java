package com.github.rudroid.utilities.ui.emojipicker;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.x0;
import com.github.rudroid.actions.checkdetail.jobbottomsheet.ReRunJobBottomSheet;
import com.github.rudroid.releases.f;
import com.github.rudroid.uitoolkit.listitems.b0;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.rudroid.uitoolkit.w0;
import com.github.rudroid.utilities.d0;
import com.github.rudroid.y;
import com.google.android.gms.internal.measurement.i4;
import d1.f1;
import d1.i1;
import d1.k0;
import d1.z;
import d1.z0;
import d1.z1;
import f1.u9;
import f1.ub;
import g3.g0;
import g3.h0;
import g3.q0;
import java.util.ArrayList;
import java.util.Locale;
import l01.p0;
import w2.g1;
import w61.a0;
import xn.b1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        int i = this.r;
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        w1.o oVar = w1.o.a;
        int i2 = 16;
        int i3 = 0;
        a0 a0Var = a0.a;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                y yVar = (y) obj4;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((n0.l) obj, "$this$header");
                if (!sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    sVar.V();
                    break;
                } else {
                    ub.b(i4.p0(u.a(yVar), sVar), androidx.compose.foundation.layout.b.x(oVar, ih.a.l), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).y, sVar, 0, 0, 131068);
                    break;
                }
            case 1:
                d0 d0Var = (d0) obj4;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((x) obj, "$this$EmojiContainer");
                if (!sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    sVar2.V();
                    break;
                } else {
                    ub.c(d0Var.a, (w1.r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, d0Var.b, (j71.c) null, ih.d.f(sVar2).l, sVar2, 0, 0, 196606);
                    break;
                }
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                sy.rShadow.a(new z5.a(2131231298), i21.a.D(k41.b.M(ih.a.N), 0.0f, 7), 0, null, sVar3, 48, 24);
                m71.a.d(i4.p0(2131954645, sVar3), (z5.n) null, (m6.e) obj4, 0, sVar3, 0, 10);
                break;
            case 3:
                f1 f1Var = (f1) obj4;
                w1.r rVar = (w1.r) obj;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar4.c0(-1914520728);
                s3.c cVar = (s3.c) sVar4.j(g1.h);
                Object N = sVar4.N();
                Object obj5 = N;
                if (N == iVar) {
                    p1 B = androidx.compose.runtime.t.B(new s3.l(0L));
                    sVar4.n0(B);
                    obj5 = B;
                }
                androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) obj5;
                boolean h = sVar4.h(f1Var);
                Object N2 = sVar4.N();
                Object obj6 = N2;
                if (h || N2 == iVar) {
                    i1 i1Var = new i1(0, f1Var, f1Var2);
                    sVar4.n0(i1Var);
                    obj6 = i1Var;
                }
                j71.a aVar = (j71.a) obj6;
                boolean f = sVar4.f(cVar);
                Object N3 = sVar4.N();
                Object obj7 = N3;
                if (f || N3 == iVar) {
                    com.github.rudroid.utilities.ui.hShadow hVar = new com.github.rudroid.utilities.ui.hShadow(cVar, f1Var2, 2);
                    sVar4.n0(hVar);
                    obj7 = hVar;
                }
                a0.r rVar2 = z0.a;
                w1.r a = w1.a.a(rVar, new com.github.rudroid.settings.codeoptions.g(9, aVar, (j71.c) obj7));
                sVar4.q(false);
                break;
            case 4:
                z1 z1Var = (z1) obj4;
                w1.r rVar3 = (w1.r) obj;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar5.c0(1980580247);
                s3.c cVar2 = (s3.c) sVar5.j(g1.h);
                Object N4 = sVar5.N();
                Object obj8 = N4;
                if (N4 == iVar) {
                    p1 B2 = androidx.compose.runtime.t.B(new s3.l(0L));
                    sVar5.n0(B2);
                    obj8 = B2;
                }
                androidx.compose.runtime.f1 f1Var3 = (androidx.compose.runtime.f1) obj8;
                boolean h2 = sVar5.h(z1Var);
                Object N5 = sVar5.N();
                Object obj9 = N5;
                if (h2 || N5 == iVar) {
                    i1 i1Var2 = new i1(2, z1Var, f1Var3);
                    sVar5.n0(i1Var2);
                    obj9 = i1Var2;
                }
                j71.a aVar2 = (j71.a) obj9;
                boolean f2 = sVar5.f(cVar2);
                Object N6 = sVar5.N();
                Object obj10 = N6;
                if (f2 || N6 == iVar) {
                    com.github.rudroid.utilities.ui.hShadow hVar2 = new com.github.rudroid.utilities.ui.hShadow(cVar2, f1Var3, 4);
                    sVar5.n0(hVar2);
                    obj10 = hVar2;
                }
                a0.r rVar4 = z0.a;
                w1.r a2 = w1.a.a(rVar3, new com.github.rudroid.settings.codeoptions.g(9, aVar2, (j71.c) obj10));
                sVar5.q(false);
                break;
            case 5:
                p0 p0Var = (p0) obj4;
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                k71.k.g((f0) obj, "$this$Card");
                if (!sVar6.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    sVar6.V();
                    break;
                } else {
                    float f3 = ih.a.l;
                    w1.r A = androidx.compose.foundation.layout.b.A(oVar, f3, f3, f3, ih.a.k);
                    e0 a3 = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar6, 0);
                    int hashCode = Long.hashCode(sVar6.T);
                    v1 l = sVar6.l();
                    w1.r c = w1.a.c(sVar6, A);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar6.g0();
                    if (sVar6.S) {
                        sVar6.k(fVar);
                    } else {
                        sVar6.q0();
                    }
                    androidx.compose.runtime.t.I(sVar6, v2.g.f, a3);
                    androidx.compose.runtime.t.I(sVar6, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar6, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar6, v2.g.h);
                    androidx.compose.runtime.t.I(sVar6, v2.g.d, c);
                    df.g.b(p0Var, sVar6, 0);
                    sVar6.q(true);
                    break;
                }
            case 6:
                ArrayList arrayList = (ArrayList) obj4;
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (!sVar7.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sVar7.V();
                    break;
                } else {
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj11 = arrayList.get(i3);
                        i3++;
                        df.r rVar5 = (df.r) obj11;
                        b0.a(null, rVar5.a, rVar5.b, ih.a.u, ih.d.f(sVar7).B, sVar7, 0, 1);
                    }
                    break;
                }
            case 7:
                e81.c cVar3 = (e81.c) obj4;
                e81.c.y.set(cVar3, null);
                cVar3.f((Object) null);
                break;
            case 8:
                ((e81.h) obj4).c();
                break;
            case 9:
                u9 u9Var = (u9) obj4;
                x0 x0Var = (x0) obj;
                l1 F = ((u0) obj2).F(((s3.a) obj3).a);
                break;
            case 10:
                com.github.rudroid.copilot.l lVar = (com.github.rudroid.copilot.l) obj4;
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$CompoundDrawableText");
                if (!sVar8.S(intValue5 & 1, (intValue5 & 17) != 16)) {
                    sVar8.V();
                    break;
                } else {
                    b1 b1Var = lVar.d;
                    String name = b1Var != null ? b1Var.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    ub.b(name, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar8).t, sVar8, 0, 24960, 110590);
                    break;
                }
            case 11:
                ((k0) obj4).s.a(((q2.u) obj2).c, z.d);
                break;
            case 12:
                f.f fVar2 = (f.f) obj4;
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                k71.k.g((x) obj, "$this$ListItemScaffold");
                if (!sVar9.S(intValue6 & 1, (intValue6 & 17) != 16)) {
                    sVar9.V();
                    break;
                } else {
                    e0 a4 = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar9, 0);
                    int hashCode2 = Long.hashCode(sVar9.T);
                    v1 l2 = sVar9.l();
                    w1.o oVar2 = w1.o.a;
                    w1.r c2 = w1.a.c(sVar9, oVar2);
                    v2.h.o.getClass();
                    v2.f fVar3 = v2.g.b;
                    sVar9.g0();
                    if (sVar9.S) {
                        sVar9.k(fVar3);
                    } else {
                        sVar9.q0();
                    }
                    androidx.compose.runtime.t.I(sVar9, v2.g.f, a4);
                    androidx.compose.runtime.t.I(sVar9, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar9, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar9, v2.g.h);
                    androidx.compose.runtime.t.I(sVar9, v2.g.d, c2);
                    ub.b(fVar2.t.b, androidx.compose.foundation.layout.b.B(oVar2, 0.0f, 0.0f, 0.0f, ih.a.k, 7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar9).l, sVar9, 0, 0, 131068);
                    w0.a(null, p2.o(oVar2, ih.a.L), new com.github.rudroid.uitoolkit.p2(fVar2.t.c, 2131231271, null, new d2.t(ih.d.b(sVar9).v), null, null, null, null, 244), sVar9, 0, 1);
                    sVar9.q(true);
                    break;
                }
            case 13:
                d.C0009d c0009d = (d.C0009d) obj4;
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTextButton");
                if (!sVar10.S(intValue7 & 1, (intValue7 & 17) != 16)) {
                    sVar10.V();
                    break;
                } else {
                    ub.b(c0009d.b, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar10).h, sVar10, 0, 0, 131070);
                    break;
                }
            case 14:
                ReRunJobBottomSheet reRunJobBottomSheet = (ReRunJobBottomSheet) obj4;
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                k71.k.g((m0.b) obj, "$this$item");
                if (!sVar11.S(intValue8 & 1, (intValue8 & 17) != 16)) {
                    sVar11.V();
                    break;
                } else {
                    boolean h3 = sVar11.h(reRunJobBottomSheet);
                    Object N7 = sVar11.N();
                    Object obj12 = N7;
                    if (h3 || N7 == iVar) {
                        h1.r rVar6 = new h1.r(20, reRunJobBottomSheet);
                        sVar11.n0(rVar6);
                        obj12 = rVar6;
                    }
                    ra.i.a(0, sVar11, (j71.c) obj12, (w1.r) null);
                    break;
                }
            case 15:
                mn.d dVar = (mn.d) obj4;
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                k71.k.g((m0.b) obj, "$this$item");
                if (!sVar12.S(intValue9 & 1, (intValue9 & 17) != 16)) {
                    sVar12.V();
                    break;
                } else {
                    ra.f.a(0, sVar12, dVar.b.d, (w1.r) null);
                    break;
                }
            case 16:
                s3.a aVar3 = (s3.a) obj3;
                long j3 = ((s0.f1) obj4).f;
                long j4 = aVar3.a;
                int k = s3.a.k(j4);
                long j5 = aVar3.a;
                l1 F2 = ((u0) obj2).F(s3.a.b(j4, aa1.b.v((int) (j3 >> 32), k, s3.a.i(j5)), 0, aa1.b.v((int) (j3 & 4294967295L), s3.a.j(j5), s3.a.h(j5)), 0, 10));
                break;
            case 17:
                q0 q0Var = (q0) obj4;
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                sVar13.c0(1582736677);
                s3.c cVar4 = (s3.c) sVar13.j(g1.h);
                k3.j jVar = (k3.h) sVar13.j(g1.k);
                s3.m mVar = (s3.m) sVar13.j(g1.n);
                boolean f4 = sVar13.f(q0Var) | sVar13.d(mVar.ordinal());
                Object N8 = sVar13.N();
                Object obj13 = N8;
                if (f4 || N8 == iVar) {
                    q0 i4 = g0.i(q0Var, mVar);
                    sVar13.n0(i4);
                    obj13 = i4;
                }
                q0 q0Var2 = (q0) obj13;
                boolean f5 = sVar13.f(jVar) | sVar13.f(q0Var2);
                Object N9 = sVar13.N();
                Object obj14 = N9;
                if (f5 || N9 == iVar) {
                    h0 h0Var = q0Var2.a;
                    k3.i iVar2 = h0Var.f;
                    k3.s sVar14 = h0Var.c;
                    if (sVar14 == null) {
                        sVar14 = k3.s.w;
                    }
                    k3.o oVar3 = h0Var.d;
                    int i5 = oVar3 != null ? oVar3.a : 0;
                    k3.p pVar = h0Var.e;
                    k3.f0 b = jVar.b(iVar2, sVar14, i5, pVar != null ? pVar.a : 65535);
                    sVar13.n0(b);
                    obj14 = b;
                }
                i3 i3Var = (i3) obj14;
                Object N10 = sVar13.N();
                Object obj15 = N10;
                if (N10 == iVar) {
                    Object value = i3Var.getValue();
                    s0.f1 f1Var4 = new s0.f1();
                    f1Var4.a = mVar;
                    f1Var4.b = cVar4;
                    f1Var4.c = jVar;
                    f1Var4.d = q0Var;
                    f1Var4.e = value;
                    f1Var4.f = s0.w0.b(q0Var, cVar4, jVar);
                    sVar13.n0(f1Var4);
                    obj15 = f1Var4;
                }
                s0.f1 f1Var5 = (s0.f1) obj15;
                Object value2 = i3Var.getValue();
                if (mVar != f1Var5.a || !k71.k.b(cVar4, f1Var5.b) || !k71.k.b(jVar, f1Var5.c) || !k71.k.b(q0Var2, f1Var5.d) || !k71.k.b(value2, f1Var5.e)) {
                    f1Var5.a = mVar;
                    f1Var5.b = cVar4;
                    f1Var5.c = jVar;
                    f1Var5.d = q0Var2;
                    f1Var5.e = value2;
                    f1Var5.f = s0.w0.b(q0Var2, cVar4, jVar);
                }
                boolean h4 = sVar13.h(f1Var5);
                Object N11 = sVar13.N();
                Object obj16 = N11;
                if (h4 || N11 == iVar) {
                    d dVar2 = new d(i2, f1Var5);
                    sVar13.n0(dVar2);
                    obj16 = dVar2;
                }
                w1.r l3 = androidx.compose.ui.layout.z.l(oVar, (j71.f) obj16);
                sVar13.q(false);
                break;
            case 18:
                ((com.github.rudroid.support.u) obj4).k((Throwable) obj);
                break;
            case 19:
                t10.l lVar2 = (t10.l) obj4;
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                k71.k.g((e1) obj, "$this$FlowRow");
                if (!sVar15.S(intValue10 & 1, (intValue10 & 17) != 16)) {
                    sVar15.V();
                    break;
                } else {
                    String str = lVar2.d;
                    q0 q0Var3 = ih.d.f(sVar15).j;
                    k3.s sVar16 = k3.s.x;
                    ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(q0Var3, ih.d.b(sVar15).s, 0L, sVar16, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777210), sVar15, 0, 0, 131070);
                    float f6 = ih.a.k;
                    ub.b("/", androidx.compose.foundation.layout.b.B(w1.o.a, f6, 0.0f, f6, 0.0f, 10), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar15).j, ih.d.b(sVar15).x, 0L, sVar16, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777210), sVar15, 6, 0, 131068);
                    ub.b(lVar2.b, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar15).j, ih.d.b(sVar15).s, 0L, sVar16, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777210), sVar15, 0, 0, 131070);
                    break;
                }
            case 20:
                boolean z = ((t10.r) obj4).g;
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryButton");
                if (!sVar17.S(intValue11 & 1, (intValue11 & 17) != 16)) {
                    sVar17.V();
                    break;
                } else {
                    if (z) {
                        sVar17.c0(-1085451967);
                        j = ih.d.a(sVar17).y;
                        sVar17.q(false);
                    } else {
                        sVar17.c0(-1085365446);
                        j = ih.d.b(sVar17).z;
                        sVar17.q(false);
                    }
                    int i6 = z ? 2131954932 : 2131954931;
                    com.github.rudroid.uitoolkit.text.o b2 = com.github.rudroid.uitoolkit.text.m.b(Integer.valueOf(z ? 2131231158 : 2131231405), null, p2.o(oVar, 16), 10);
                    f2 f7 = androidx.compose.foundation.layout.b.f(ih.a.k, 0.0f, 0.0f, 0.0f, 14);
                    String upperCase = i4.p0(i6, sVar17).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    com.github.rudroid.uitoolkit.text.k.c(null, b2, f7, new d2.t(j), null, null, upperCase, null, ih.d.b(sVar17).t, 0, 0, ih.d.f(sVar17).h, false, sVar17, 0, 0, 14001);
                    break;
                }
            default:
                boolean z2 = ((t10.s) obj4).i;
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryButton");
                if (!sVar18.S(intValue12 & 1, (intValue12 & 17) != 16)) {
                    sVar18.V();
                    break;
                } else {
                    if (z2) {
                        sVar18.c0(681647951);
                        j2 = ih.d.a(sVar18).y;
                        sVar18.q(false);
                    } else {
                        sVar18.c0(681742408);
                        j2 = ih.d.b(sVar18).z;
                        sVar18.q(false);
                    }
                    int i7 = z2 ? 2131954932 : 2131954931;
                    com.github.rudroid.uitoolkit.text.o b3 = com.github.rudroid.uitoolkit.text.m.b(Integer.valueOf(z2 ? 2131231158 : 2131231405), null, p2.o(oVar, 16), 10);
                    f2 f8 = androidx.compose.foundation.layout.b.f(ih.a.k, 0.0f, 0.0f, 0.0f, 14);
                    String upperCase2 = i4.p0(i7, sVar18).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase2, "toUpperCase(...)");
                    com.github.rudroid.uitoolkit.text.k.c(null, b3, f8, new d2.t(j2), null, null, upperCase2, null, ih.d.b(sVar18).t, 0, 0, ih.d.f(sVar18).h, false, sVar18, 0, 0, 14001);
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ d(e81.c cVar, e81.b bVar) {
        this.r = 7;
        this.s = cVar;
    }
}
