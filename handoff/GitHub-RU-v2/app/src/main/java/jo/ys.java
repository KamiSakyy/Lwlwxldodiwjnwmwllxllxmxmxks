package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ys implements aaShadow.w0 {
    public static final ts Companion = new ts();
    public final aa1.b r;
    public final aa1.b s;
    public final aa1.b t;

    public ys(aa1.b bVar) {
        aa.t0 t0Var = aa.t0.d;
        this.r = t0Var;
        this.s = t0Var;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.n3.a;
        List list2 = h10.n3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return k71.k.b(this.r, ysVar.r) && k71.k.b(this.s, ysVar.s) && k71.k.b(this.t, ysVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.rj.a, false);
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
            aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(f4.u("PushNotificationSchedulesQuery(after=", this.r, ", before=", this.s, ", first="), this.t, ")");
    }
}
