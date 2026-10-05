package com.github.rudroid.uitoolkit.swipetodismiss;

import android.content.Context;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import d2.p0;
import f1.gb;
import f1.jb;
import f1.ub;
import g3.q0;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import xn.e1;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e0 implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ e0(g0 g0Var, r1.d dVar, w1.r rVar, boolean z, boolean z2, r1.d dVar2, int i) {
        this.u = g0Var;
        this.v = dVar;
        this.x = rVar;
        this.s = z;
        this.t = z2;
        this.w = dVar2;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.u;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f0.a((g0) obj6, (r1.d) obj5, (w1.r) obj3, this.s, this.t, (r1.d) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(196657));
                break;
            case 1:
                j71.a aVar = (j71.a) obj6;
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj5;
                e1 e1Var = (e1) obj4;
                String str = (String) obj3;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    float f = ih.a.n;
                    w1.o oVar = w1.o.a;
                    w1.r z = androidx.compose.foundation.layout.b.z(oVar, 0.0f, f, 1);
                    androidx.compose.foundation.layout.g gVar = androidx.compose.foundation.layout.l.c;
                    w1.h hVar = w1.c.D;
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, z);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    v2.e eVar = v2.g.f;
                    androidx.compose.runtime.t.I(sVar, eVar, a);
                    v2.e eVar2 = v2.g.e;
                    androidx.compose.runtime.t.I(sVar, eVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    v2.e eVar3 = v2.g.g;
                    androidx.compose.runtime.t.w(sVar, valueOf, eVar3);
                    v2.d dVar = v2.g.h;
                    androidx.compose.runtime.t.E(sVar, dVar);
                    v2.e eVar4 = v2.g.d;
                    androidx.compose.runtime.t.I(sVar, eVar4, c);
                    w1.r z2 = androidx.compose.foundation.layout.b.z(oVar, f, 0.0f, 2);
                    l2 a2 = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar, 48);
                    int hashCode2 = Long.hashCode(sVar.T);
                    v1 l2 = sVar.l();
                    w1.r c2 = w1.a.c(sVar, z2);
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, eVar, a2);
                    androidx.compose.runtime.t.I(sVar, eVar2, l2);
                    f1.e.t(hashCode2, sVar, eVar3, sVar, dVar);
                    androidx.compose.runtime.t.I(sVar, eVar4, c2);
                    if (1.0f <= 0.0d) {
                        l0.a.a("invalid weight; must be greater than zero");
                    }
                    w1 w1Var = new w1(1.0f, true);
                    boolean z3 = false;
                    androidx.compose.foundation.layout.e0 a3 = androidx.compose.foundation.layout.c0.a(gVar, hVar, sVar, 0);
                    int hashCode3 = Long.hashCode(sVar.T);
                    v1 l3 = sVar.l();
                    w1.r c3 = w1.a.c(sVar, w1Var);
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, eVar, a3);
                    androidx.compose.runtime.t.I(sVar, eVar2, l3);
                    f1.e.t(hashCode3, sVar, eVar3, sVar, dVar);
                    androidx.compose.runtime.t.I(sVar, eVar4, c3);
                    ub.b(fg.h.a(e1Var, (Context) sVar.j(w2.j0.b)), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).o, 0L, t1.C(22), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 131070);
                    ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).d, ih.d.b(sVar).v, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777214), sVar, 0, 0, 131070);
                    sVar.q(true);
                    boolean z4 = this.s;
                    sg.j0.a(null, z4, false, null, null, sVar, 0, 29);
                    sVar.q(true);
                    if (z4 && this.t) {
                        sVar.c0(659916284);
                        sg.k0.a(12582912, 91, androidx.compose.foundation.layout.b.d(2, f), sVar, null, null, null, aVar, dg.a.a, null, false);
                        w1.r z5 = androidx.compose.foundation.layout.b.z(oVar, f, 0.0f, 2);
                        String format = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
                        k71.k.f(format, "format(...)");
                        ub.b(i4.q0(2131953114, new Object[]{format}, sVar), z5, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).v, sVar, 0, 0, 131068);
                        z3 = false;
                    } else {
                        sVar.c0(656920382);
                    }
                    sVar.q(z3);
                    sVar.q(true);
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                ef.d.a((w1.r) obj3, (j71.a) obj6, this.s, (l01.x) obj5, this.t, (j71.c) obj4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
            default:
                jb jbVar = jb.a;
                jb jbVar2 = jb.a;
                ((Integer) obj2).getClass();
                ((jb) obj6).a(this.s, this.t, (j0.i) obj5, (gb) obj4, (p0) obj3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(114822145));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ e0(jb jbVar, boolean z, boolean z2, j0.i iVar, gb gbVar, p0 p0Var, int i) {
        jb jbVar2 = jb.a;
        jb jbVar3 = jb.a;
        this.u = jbVar;
        this.s = z;
        this.t = z2;
        this.v = iVar;
        this.w = gbVar;
        this.x = p0Var;
    }

    public /* synthetic */ e0(w1.r rVar, j71.a aVar, boolean z, l01.x xVar, boolean z2, j71.c cVar, int i) {
        this.x = rVar;
        this.u = aVar;
        this.s = z;
        this.v = xVar;
        this.t = z2;
        this.w = cVar;
    }

    public /* synthetic */ e0(boolean z, boolean z2, j71.a aVar, ZonedDateTime zonedDateTime, e1 e1Var, String str) {
        this.s = z;
        this.t = z2;
        this.u = aVar;
        this.v = zonedDateTime;
        this.w = e1Var;
        this.x = str;
    }
}
