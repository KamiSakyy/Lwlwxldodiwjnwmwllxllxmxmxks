package com.github.rudroid.settings;

import com.github.rudroid.settings.a1;
import com.github.rudroid.utilities.viewmodel.d;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 extends androidx.lifecycle.k1 implements a1, com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public final /* synthetic */ d.a s;
    public l51.h t;
    public rm.d u;
    public sm.g v;
    public com.github.rudroid.activities.util.c w;
    public y71.y1 x;
    public androidx.lifecycle.p0 y;

    public static final class a {
    }

    public r0(l51.h hVar, rm.d dVar, sm.g gVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(dVar, "updateNotificationSchedulesUseCase");
        k71.k.g(gVar, "updatePushNotificationSettingUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = new d.a();
        this.t = hVar;
        this.u = dVar;
        this.v = gVar;
        this.w = cVar;
        y71.y1 c = y71.n1.c(a1.a.c.b);
        this.x = c;
        this.y = new androidx.lifecycle.p0();
        v71.b0.j(androidx.lifecycle.d1.k(this).r);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new y0(this, null), 3);
        y71.n1.A(new y71.y(c, new q0(this, null), 6), androidx.lifecycle.d1.k(this));
    }

    @Override // com.github.rudroid.settings.a1
    public final void B() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new z0(this, new p0(this, 1), null), 3);
    }

    @Override // com.github.rudroid.settings.a1
    public final void C(int i, int i2) {
        LocalTime of = LocalTime.of(i, i2);
        LocalTime of2 = (!of.isAfter(P()) || i >= 23) ? of.isAfter(P()) ? LocalTime.of(23, 59) : P() : LocalTime.of(i + 1, i2);
        y71.y1 y1Var = this.x;
        y1Var.j(((a1.a) y1Var.getValue()).a(new n0(of, of2, 0)));
    }

    @Override // com.github.rudroid.settings.a1
    public final void G(List list) {
        y71.y1 y1Var = this.x;
        y1Var.j(((a1.a) y1Var.getValue()).a(new o0(0, list)));
    }

    @Override // com.github.rudroid.settings.a1
    public final void I(boolean z) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new s0(this, z, new p0(this, 0), null), 3);
    }

    public final LocalTime P() {
        return ((a1.a) this.x.getValue()).a.c;
    }

    public final LocalTime Q() {
        return ((a1.a) this.x.getValue()).a.b;
    }

    @Override // com.github.rudroid.settings.a1
    public final void d() {
        y71.y1 y1Var = this.x;
        pm.c cVar = ((a1.a) y1Var.getValue()).a;
        com.github.rudroid.common.f.Companion.getClass();
        List list = com.github.rudroid.common.f.s;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new pm.b((com.github.rudroid.common.f) it.next(), "", cVar.b, cVar.c));
        }
        a1.a.b bVar = new a1.a.b(pm.c.a(cVar, arrayList, null, null, false, 14));
        y1Var.getClass();
        y1Var.k((Object) null, bVar);
    }

    @Override // com.github.rudroid.settings.a1
    public final void h(int i, int i2) {
        LocalTime of = LocalTime.of(i, i2);
        LocalTime of2 = (of.isBefore(Q()) && i == 0) ? LocalTime.of(0, 0) : of.isBefore(Q()) ? LocalTime.of(i - 1, i2) : Q();
        y71.y1 y1Var = this.x;
        y1Var.j(((a1.a) y1Var.getValue()).a(new n0(of, of2, 1)));
    }

    @Override // com.github.rudroid.settings.a1
    public final void o() {
        y71.y1 y1Var = this.x;
        a1.a.C0005a c0005a = new a1.a.C0005a(((a1.a) y1Var.getValue()).a);
        y1Var.getClass();
        y1Var.k((Object) null, c0005a);
    }

    @Override // com.github.rudroid.settings.a1
    public final y71.y1 p() {
        return this.x;
    }
}
