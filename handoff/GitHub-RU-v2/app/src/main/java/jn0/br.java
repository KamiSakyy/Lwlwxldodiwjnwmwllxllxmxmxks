package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class br implements aaShadow.w0 {
    public static final wq Companion = new wq();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;

    public br(aa1.b bVar) {
        aa.t0 t0Var = aa.t0.d;
        this.r = t0Var;
        this.s = t0Var;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.g3.a;
        List list2 = kz0.g3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        br brVar = (br) obj;
        return k71.k.b(this.r, brVar.r) && k71.k.b(this.s, brVar.s) && k71.k.b(this.t, brVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ji.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "ac3f7be1dd76fe557e2835b3342f9803aa61264d7c4bd1af95ab138b1d922bde";
    }

    public final String j() {
        Companion.getClass();
        return "query PushNotificationSchedulesQuery($after: String, $before: String, $first: Int) { viewer { mobilePushNotificationSchedules(after: $after, before: $before, first: $first) { nodes { __typename ...PushNotificationSchedulesFragment id } } id __typename } id __typename }  fragment PushNotificationSchedulesFragment on MobilePushNotificationSchedule { day id startTime endTime __typename }";
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
            aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(jo.f4Shadow.u("PushNotificationSchedulesQuery(after=", this.r, ", before=", this.s, ", first="), this.t, ")");
    }
}
