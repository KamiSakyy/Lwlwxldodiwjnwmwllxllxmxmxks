package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class un implements aaShadow.w0 {
    public static final pn Companion = new pn();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;

    public un(aa1.b bVar) {
        aa.t0 t0Var = aa.t0.d;
        this.r = t0Var;
        this.s = t0Var;
        this.t = bVar;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.v2.a;
        List list2 = fc0.v2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        return k71.k.b(this.r, unVar.r) && k71.k.b(this.s, unVar.s) && k71.k.b(this.t, unVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.zf.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "76e5d8d2211e2d73f32ef76461d6d3776f681dc4662ceb48877a0ac9a20ebf97";
    }

    public final String j() {
        Companion.getClass();
        return "query PushNotificationSchedulesQuery($after: String, $before: String, $first: Int) { viewer { mobilePushNotificationSchedules(after: $after, before: $before, first: $first) { nodes { __typename ...PushNotificationSchedulesFragment id } } id __typename } }  fragment PushNotificationSchedulesFragment on MobilePushNotificationSchedule { day id startTime endTime __typename }";
    }

    public final String name() {
        return "PushNotificationSchedulesQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("before");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aaShadow.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(jo.f4.u("PushNotificationSchedulesQuery(after=", this.r, ", before=", this.s, ", first="), this.t, ")");
    }
}
