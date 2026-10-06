package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vg0 implements aaShadow.n0 {
    public static final rg0 Companion = new rg0();
    public final String r;

    public vg0(String str) {
        k71.k.g(str, "timeZone");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.b7.a;
        List list2 = h10.b7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg0) && k71.k.b(this.r, ((vg0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.o00.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "d78d25df07d430b50da3e475fc7b7ad3868463798248a7d5bd3400b0a6ef811f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateTimezone($timeZone: String!) { updateUserMobileTimeZone(input: { timeZone: $timeZone } ) { user { mobileTimeZone id __typename } } }";
    }

    public final String name() {
        return "UpdateTimezone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("timeZone");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UpdateTimezoneMutation(timeZone=", this.r, ")");
    }
}
