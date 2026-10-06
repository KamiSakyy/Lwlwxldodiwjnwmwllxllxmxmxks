package com.github.rudroid.widget.shortcuts;

import a0.s0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.lifecycle.l1;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.auth.SimplifiedLoginActivity;
import com.github.rudroid.uitoolkit.y2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;
import com.google.android.gms.internal.measurement.i4;
import f0.z1;
import f1.c9;
import f1.i9;
import f1.s9;
import f1.ub;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutWidgetSettingsActivity extends com.github.rudroid.widget.shortcuts.d {
    public static final a Companion = new a();
    public final l1 i0;

    public static final class a {
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return ShortcutWidgetSettingsActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return ShortcutWidgetSettingsActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return ShortcutWidgetSettingsActivity.this.g0();
        }
    }

    public ShortcutWidgetSettingsActivity() {
        this.h0 = false;
        C(new com.github.rudroid.widget.shortcuts.c(this));
        this.i0 = new l1(k71.x.a(com.github.rudroid.widget.shortcuts.viewmodel.f.class), new c(), new b(), new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        e.c.a(this, new r1.d(new j71.e() { // from class: com.github.rudroid.widget.shortcuts.b0
            public final Object s(Object obj, Object obj2) {
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                ShortcutWidgetSettingsActivity.a aVar = ShortcutWidgetSettingsActivity.Companion;
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    final String p0 = i4.p0(2131951861, sVar);
                    final ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity = ShortcutWidgetSettingsActivity.this;
                    f1 n = androidx.compose.runtime.t.n(shortcutWidgetSettingsActivity.s0().z, sVar);
                    final oa.j jVar = ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).b;
                    final StoredShortcutModel storedShortcutModel = ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).d;
                    final List list = ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).c;
                    final g1 g1Var = ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).e;
                    x61.r rVar = (List) ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).e.getData();
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    final x61.r rVar2 = rVar;
                    final float f = ((com.github.rudroid.widget.shortcuts.viewmodel.b) n.getValue()).f;
                    final z1 v = f0.o.v(sVar);
                    Object[] objArr = new Object[0];
                    Object N = sVar.N();
                    Object obj3 = androidx.compose.runtime.n.a;
                    if (N == obj3) {
                        N = new com.github.rudroid.widget.p(8);
                        sVar.n0(N);
                    }
                    final f1 f1Var = (f1) u1.j.c(objArr, (j71.a) N, sVar, 48);
                    Object[] objArr2 = new Object[0];
                    Object N2 = sVar.N();
                    if (N2 == obj3) {
                        N2 = new com.github.rudroid.widget.p(9);
                        sVar.n0(N2);
                    }
                    final f1 f1Var2 = (f1) u1.j.c(objArr2, (j71.a) N2, sVar, 48);
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(2116221534, new j71.e() { // from class: com.github.rudroid.widget.shortcuts.f0
                        public final Object s(Object obj4, Object obj5) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            ShortcutWidgetSettingsActivity.a aVar2 = ShortcutWidgetSettingsActivity.Companion;
                            if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                w1.r a2 = com.github.rudroid.utilities.c0.a(ih.d.b(sVar2).b, w1.o.a);
                                long j = ih.d.b(sVar2).c;
                                final z1 z1Var = v;
                                final ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity2 = shortcutWidgetSettingsActivity;
                                final oa.j jVar2 = jVar;
                                final StoredShortcutModel storedShortcutModel2 = storedShortcutModel;
                                r1.d d2 = r1.i.d(267822314, new y2(z1Var, shortcutWidgetSettingsActivity2, jVar2, storedShortcutModel2, 2), sVar2);
                                final float f2 = f;
                                final f1 f1Var3 = f1Var;
                                final f1 f1Var4 = f1Var2;
                                final g1 g1Var2 = g1Var;
                                final String str = p0;
                                final List list2 = list;
                                final List list3 = rVar2;
                                com.github.rudroid.uitoolkit.utils.z.a(a2, d2, null, null, null, 0, j, 0L, r1.i.d(1597180384, new j71.f() { // from class: com.github.rudroid.widget.shortcuts.g0
                                    /* JADX WARN: Code restructure failed: missing block: B:52:0x036e, code lost:
                                    
                                        if (r2 == r1) goto L68;
                                     */
                                    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity, java.lang.Object] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object f(Object obj6, Object obj7, Object obj8) {
                                        boolean z;
                                        Object obj9;
                                        androidx.compose.runtime.i iVar;
                                        Object obj10;
                                        g0 g0Var;
                                        oa.j jVar3;
                                        boolean z2;
                                        androidx.compose.runtime.s sVar3;
                                        boolean z3;
                                        d2 d2Var = (d2) obj6;
                                        androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj7;
                                        int intValue3 = ((Integer) obj8).intValue();
                                        ShortcutWidgetSettingsActivity.a aVar3 = ShortcutWidgetSettingsActivity.Companion;
                                        k71.k.g(d2Var, "paddingValues");
                                        if ((intValue3 & 6) == 0) {
                                            intValue3 |= sVar4.f(d2Var) ? 4 : 2;
                                        }
                                        if (sVar4.S(intValue3 & 1, (intValue3 & 19) != 18)) {
                                            List list4 = list2;
                                            boolean isEmpty = list4.isEmpty();
                                            ShortcutWidgetSettingsActivity r4 = shortcutWidgetSettingsActivity2;
                                            if (isEmpty) {
                                                sVar4.c0(1964911212);
                                                sVar4.q(false);
                                                SimplifiedLoginActivity.Companion.getClass();
                                                Intent intent = new Intent((Context) r4, (Class<?>) SimplifiedLoginActivity.class);
                                                intent.putExtra("ghes_deprecation_logout_notice", (Parcelable) null);
                                                r4.startActivity(intent);
                                                r4.finish();
                                            } else {
                                                sVar4.c0(1953570544);
                                                w1.o oVar = w1.o.a;
                                                w1.r w = f0.o.w(androidx.compose.foundation.layout.b.w(oVar, d2Var), z1Var, true);
                                                androidx.compose.foundation.layout.e0 a3 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar4, 0);
                                                int hashCode = Long.hashCode(sVar4.T);
                                                v1 l = sVar4.l();
                                                w1.r c2 = w1.a.c(sVar4, w);
                                                v2.h.o.getClass();
                                                v2.f fVar = v2.g.b;
                                                sVar4.g0();
                                                if (sVar4.S) {
                                                    sVar4.k(fVar);
                                                } else {
                                                    sVar4.q0();
                                                }
                                                v2.e eVar = v2.g.f;
                                                androidx.compose.runtime.t.I(sVar4, eVar, a3);
                                                v2.e eVar2 = v2.g.e;
                                                androidx.compose.runtime.t.I(sVar4, eVar2, l);
                                                Integer valueOf = Integer.valueOf(hashCode);
                                                v2.e eVar3 = v2.g.g;
                                                androidx.compose.runtime.t.w(sVar4, valueOf, eVar3);
                                                v2.d dVar = v2.g.h;
                                                androidx.compose.runtime.t.E(sVar4, dVar);
                                                v2.e eVar4 = v2.g.d;
                                                androidx.compose.runtime.t.I(sVar4, eVar4, c2);
                                                String p02 = i4.p0(2131953482, sVar4);
                                                oa.j jVar4 = jVar2;
                                                String str2 = jVar4 != null ? jVar4.c : null;
                                                if (str2 == null) {
                                                    str2 = com.github.rudroid.m0.d(sVar4, -1467540601, 2131954106, sVar4, false);
                                                } else {
                                                    sVar4.c0(-1467541314);
                                                    sVar4.q(false);
                                                }
                                                String str3 = str2;
                                                long j2 = ih.d.b(sVar4).d;
                                                d2.l0 l0Var = d2.a0.b;
                                                w1.r e = p2.e(f0.o.f(oVar, j2, l0Var), 1.0f);
                                                float f3 = ih.a.n;
                                                float f4 = ih.a.l;
                                                w1.r y = androidx.compose.foundation.layout.b.y(e, f3, f4);
                                                w1.i iVar2 = w1.c.B;
                                                androidx.compose.foundation.layout.h hVar = androidx.compose.foundation.layout.l.g;
                                                l2 a4 = j2.a(hVar, iVar2, sVar4, 54);
                                                int hashCode2 = Long.hashCode(sVar4.T);
                                                v1 l2 = sVar4.l();
                                                w1.r c3 = w1.a.c(sVar4, y);
                                                sVar4.g0();
                                                if (sVar4.S) {
                                                    sVar4.k(fVar);
                                                } else {
                                                    sVar4.q0();
                                                }
                                                androidx.compose.runtime.t.I(sVar4, eVar, a4);
                                                androidx.compose.runtime.t.I(sVar4, eVar2, l2);
                                                f1.e.t(hashCode2, sVar4, eVar3, sVar4, dVar);
                                                androidx.compose.runtime.t.I(sVar4, eVar4, c3);
                                                final int i = 0;
                                                ub.b(p02, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                                                final f1 f1Var5 = f1Var3;
                                                boolean f5 = sVar4.f(f1Var5);
                                                final f1 f1Var6 = f1Var4;
                                                boolean f6 = f5 | sVar4.f(f1Var6);
                                                Object N3 = sVar4.N();
                                                androidx.compose.runtime.i iVar3 = androidx.compose.runtime.n.a;
                                                Object obj11 = N3;
                                                if (f6 || N3 == iVar3) {
                                                    j71.a aVar4 = new j71.a() { // from class: com.github.rudroid.widget.shortcuts.h0
                                                        public final Object a() {
                                                            int i2 = i;
                                                            w61.a0 a0Var = w61.a0.a;
                                                            f1 f1Var7 = f1Var6;
                                                            f1 f1Var8 = f1Var5;
                                                            switch (i2) {
                                                                case 0:
                                                                    ShortcutWidgetSettingsActivity.a aVar5 = ShortcutWidgetSettingsActivity.Companion;
                                                                    f1Var8.setValue(Boolean.TRUE);
                                                                    f1Var7.setValue(Boolean.FALSE);
                                                                    break;
                                                                default:
                                                                    ShortcutWidgetSettingsActivity.a aVar6 = ShortcutWidgetSettingsActivity.Companion;
                                                                    f1Var8.setValue(Boolean.FALSE);
                                                                    f1Var7.setValue(Boolean.TRUE);
                                                                    break;
                                                            }
                                                            return a0Var;
                                                        }
                                                    };
                                                    sVar4.n0(aVar4);
                                                    obj11 = aVar4;
                                                }
                                                sg.k0.b(null, false, (j71.a) obj11, null, str3, null, sVar4, 0, 43);
                                                sVar4.q(true);
                                                String p03 = i4.p0(2131954618, sVar4);
                                                StoredShortcutModel storedShortcutModel3 = storedShortcutModel2;
                                                String str4 = storedShortcutModel3 != null ? storedShortcutModel3.t : null;
                                                if (str4 == null) {
                                                    str4 = com.github.rudroid.m0.d(sVar4, -1467489945, 2131954106, sVar4, false);
                                                } else {
                                                    sVar4.c0(-1467491867);
                                                    sVar4.q(false);
                                                }
                                                String str5 = str4;
                                                w1.r y2 = androidx.compose.foundation.layout.b.y(p2.e(f0.o.f(oVar, ih.d.b(sVar4).d, l0Var), 1.0f), f3, f4);
                                                l2 a5 = j2.a(hVar, iVar2, sVar4, 54);
                                                int hashCode3 = Long.hashCode(sVar4.T);
                                                v1 l3 = sVar4.l();
                                                w1.r c4 = w1.a.c(sVar4, y2);
                                                sVar4.g0();
                                                if (sVar4.S) {
                                                    sVar4.k(fVar);
                                                } else {
                                                    sVar4.q0();
                                                }
                                                androidx.compose.runtime.t.I(sVar4, eVar, a5);
                                                androidx.compose.runtime.t.I(sVar4, eVar2, l3);
                                                f1.e.t(hashCode3, sVar4, eVar3, sVar4, dVar);
                                                androidx.compose.runtime.t.I(sVar4, eVar4, c4);
                                                ub.b(p03, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131070);
                                                boolean z4 = jVar4 != null;
                                                boolean f7 = sVar4.f(f1Var5) | sVar4.f(f1Var6);
                                                Object N4 = sVar4.N();
                                                if (f7 || N4 == iVar3) {
                                                    z = true;
                                                    final boolean z5 = true ? 1 : 0;
                                                    j71.a aVar5 = new j71.a() { // from class: com.github.rudroid.widget.shortcuts.h0
                                                        public final Object a() {
                                                            int i2 = z5;
                                                            w61.a0 a0Var = w61.a0.a;
                                                            f1 f1Var7 = f1Var6;
                                                            f1 f1Var8 = f1Var5;
                                                            switch (i2) {
                                                                case 0:
                                                                    ShortcutWidgetSettingsActivity.a aVar52 = ShortcutWidgetSettingsActivity.Companion;
                                                                    f1Var8.setValue(Boolean.TRUE);
                                                                    f1Var7.setValue(Boolean.FALSE);
                                                                    break;
                                                                default:
                                                                    ShortcutWidgetSettingsActivity.a aVar6 = ShortcutWidgetSettingsActivity.Companion;
                                                                    f1Var8.setValue(Boolean.FALSE);
                                                                    f1Var7.setValue(Boolean.TRUE);
                                                                    break;
                                                            }
                                                            return a0Var;
                                                        }
                                                    };
                                                    sVar4.n0(aVar5);
                                                    obj9 = aVar5;
                                                } else {
                                                    z = true;
                                                    obj9 = N4;
                                                }
                                                sg.k0.b(null, z4, (j71.a) obj9, null, str5, null, sVar4, 0, 41);
                                                sVar4.q(z);
                                                w1.r y3 = androidx.compose.foundation.layout.b.y(p2.e(f0.o.f(oVar, ih.d.b(sVar4).d, l0Var), 1.0f), f3, f4);
                                                float f8 = f2;
                                                ub.b(s0.i("Background opacity: ", (int) (100 * f8), "%"), y3, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).l, sVar4, 0, 0, 131068);
                                                w1.r A = androidx.compose.foundation.layout.b.A(p2.e(f0.o.f(oVar, ih.d.b(sVar4).d, l0Var), 1.0f), f3, ih.a.k, f3, f4);
                                                boolean c5 = sVar4.c(f8) | sVar4.h((Object) r4);
                                                Object N5 = sVar4.N();
                                                if (c5) {
                                                    iVar = iVar3;
                                                } else {
                                                    iVar = iVar3;
                                                    obj10 = N5;
                                                }
                                                i0 i0Var = new i0(f8, r4);
                                                sVar4.n0(i0Var);
                                                obj10 = i0Var;
                                                w1.r d3 = o2.c.d(A, (j71.c) obj10);
                                                q71.d dVar2 = new q71.d(0.0f, 1.0f);
                                                i9 i9Var = i9.a;
                                                c9 d4 = i9.d(ih.d.b(sVar4).F, ih.d.b(sVar4).F, ih.d.b(sVar4).s, ih.d.b(sVar4).R, ih.d.b(sVar4).s, sVar4);
                                                boolean h = sVar4.h((Object) r4);
                                                Object N6 = sVar4.N();
                                                Object obj12 = N6;
                                                if (h || N6 == iVar) {
                                                    c0 c0Var = new c0(0, r4);
                                                    sVar4.n0(c0Var);
                                                    obj12 = c0Var;
                                                }
                                                s9.b(f8, (j71.c) obj12, d3, false, dVar2, 9, (j71.a) null, d4, (j0.j) null, sVar4, 196608, 328);
                                                sVar4.q(true);
                                                if (((Boolean) f1Var5.getValue()).booleanValue()) {
                                                    sVar4.c0(1960868812);
                                                    boolean f9 = sVar4.f(f1Var5);
                                                    Object N7 = sVar4.N();
                                                    Object obj13 = N7;
                                                    if (f9 || N7 == iVar) {
                                                        final int i2 = 0;
                                                        j71.a aVar6 = new j71.a() { // from class: com.github.rudroid.widget.shortcuts.d0
                                                            public final Object a() {
                                                                int i3 = i2;
                                                                w61.a0 a0Var = w61.a0.a;
                                                                f1 f1Var7 = f1Var5;
                                                                switch (i3) {
                                                                    case 0:
                                                                        ShortcutWidgetSettingsActivity.a aVar7 = ShortcutWidgetSettingsActivity.Companion;
                                                                        f1Var7.setValue(Boolean.FALSE);
                                                                        break;
                                                                    default:
                                                                        ShortcutWidgetSettingsActivity.a aVar8 = ShortcutWidgetSettingsActivity.Companion;
                                                                        f1Var7.setValue(Boolean.FALSE);
                                                                        break;
                                                                }
                                                                return a0Var;
                                                            }
                                                        };
                                                        sVar4.n0(aVar6);
                                                        obj13 = aVar6;
                                                    }
                                                    g0Var = this;
                                                    jVar3 = jVar4;
                                                    xg.t.a(null, (j71.a) obj13, r1.i.d(-420171616, new com.github.rudroid.actions.workflowruns.ui.f(list4, str, (ShortcutWidgetSettingsActivity) r4, f1Var5, jVar3), sVar4), sVar4, 384, 1);
                                                    z2 = false;
                                                } else {
                                                    g0Var = this;
                                                    jVar3 = jVar4;
                                                    z2 = false;
                                                    sVar4.c0(1946413698);
                                                }
                                                sVar4.q(z2);
                                                if (((Boolean) f1Var6.getValue()).booleanValue() && (g1Var2 instanceof t1)) {
                                                    sVar4.c0(1962588723);
                                                    String p04 = i4.p0(2131954135, sVar4);
                                                    List list5 = list3;
                                                    if (list5.isEmpty()) {
                                                        sVar4.c0(1962786906);
                                                        String p05 = i4.p0(2131954619, sVar4);
                                                        boolean h2 = sVar4.h((Object) r4) | sVar4.f(p05) | sVar4.f(f1Var6);
                                                        Object N8 = sVar4.N();
                                                        Object obj14 = N8;
                                                        if (h2 || N8 == iVar) {
                                                            j0 j0Var = new j0(r4, p05, f1Var6, null);
                                                            sVar4.n0(j0Var);
                                                            obj14 = j0Var;
                                                        }
                                                        androidx.compose.runtime.t.f(sVar4, (j71.e) obj14, jVar3);
                                                        z3 = false;
                                                        sVar4.q(false);
                                                        sVar3 = sVar4;
                                                    } else {
                                                        sVar4.c0(1963310465);
                                                        boolean f11 = sVar4.f(f1Var6);
                                                        Object N9 = sVar4.N();
                                                        Object obj15 = N9;
                                                        if (f11 || N9 == iVar) {
                                                            final int i3 = 1;
                                                            j71.a aVar7 = new j71.a() { // from class: com.github.rudroid.widget.shortcuts.d0
                                                                public final Object a() {
                                                                    int i32 = i3;
                                                                    w61.a0 a0Var = w61.a0.a;
                                                                    f1 f1Var7 = f1Var6;
                                                                    switch (i32) {
                                                                        case 0:
                                                                            ShortcutWidgetSettingsActivity.a aVar72 = ShortcutWidgetSettingsActivity.Companion;
                                                                            f1Var7.setValue(Boolean.FALSE);
                                                                            break;
                                                                        default:
                                                                            ShortcutWidgetSettingsActivity.a aVar8 = ShortcutWidgetSettingsActivity.Companion;
                                                                            f1Var7.setValue(Boolean.FALSE);
                                                                            break;
                                                                    }
                                                                    return a0Var;
                                                                }
                                                            };
                                                            sVar4.n0(aVar7);
                                                            obj15 = aVar7;
                                                        }
                                                        xg.t.a(null, (j71.a) obj15, r1.i.d(629326011, new com.github.rudroid.actions.workflowruns.ui.f(list5, storedShortcutModel3, p04, f1Var6, (Object) r4, 10), sVar4), sVar4, 384, 1);
                                                        sVar3 = sVar4;
                                                        z3 = false;
                                                        sVar3.q(false);
                                                    }
                                                } else {
                                                    sVar3 = sVar4;
                                                    z3 = false;
                                                    sVar3.c0(1946413698);
                                                }
                                                sVar3.q(z3);
                                                sVar3.q(z3);
                                            }
                                        } else {
                                            sVar4.V();
                                        }
                                        return w61.a0.a;
                                    }
                                }, sVar2), sVar2, 100663344, 188);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            }
        }, true, 886548432));
    }

    public final com.github.rudroid.widget.shortcuts.viewmodel.f s0() {
        return (com.github.rudroid.widget.shortcuts.viewmodel.f) this.i0.getValue();
    }


    public static Object finish(Object... a) {
        return null;
    }

    public static Object f0(Object... a) {
        return null;
    }

    public static Object K0(Object... a) {
        return null;
    }

    public static Object g0(Object... a) {
        return null;
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object startActivity(Object... a) {
        return null;
    }
}
