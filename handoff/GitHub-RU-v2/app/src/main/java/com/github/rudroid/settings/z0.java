package com.github.rudroid.settings;

import com.github.rudroid.settings.a1;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationSchedulesViewModel$updateWeekScheduleSelection$2", f = "SettingsNotificationSchedulesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z0 extends c71.j implements j71.e {
    public final /* synthetic */ r0 v;
    public final /* synthetic */ j71.c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(r0 r0Var, j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.v = r0Var;
        this.w = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z0(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        z0 r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        r0 r0Var = this.v;
        rm.d dVar = r0Var.u;
        oa.j d = r0Var.w.d();
        List list = ((a1.a) r0Var.x.getValue()).a.a;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pm.b) it.next()).b);
        }
        LocalTime Q = r0Var.Q();
        LocalTime P = r0Var.P();
        dVar.getClass();
        k71.k.g(Q, "startTime");
        k71.k.g(P, "endTime");
        v71.b0.z(dVar.b, (a71.h) null, (v71.a0Shadow) null, new a0.i(dVar, d, arrayList, Q, P, this.w, (a71.c) null), 3);
        return w61.a0.a;
    }
}
