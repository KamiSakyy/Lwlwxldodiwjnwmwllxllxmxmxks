package g20;

import hc0.u00;
import java.time.ZonedDateTime;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.h0 {
    public String a;
    public Integer b;
    public int c;
    public ZonedDateTime d;
    public ZonedDateTime e;
    public String f;
    public u00 g;
    public String h;
    public q0 i;
    public String j;

    public r0(String str, Integer num, int i, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str2, u00 u00Var, String str3, q0 q0Var, String str4) {
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str2;
        this.g = u00Var;
        this.h = str3;
        this.i = q0Var;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b) && this.c == r0Var.c && k71.k.b(this.d, r0Var.d) && k71.k.b(this.e, r0Var.e) && k71.k.b(this.f, r0Var.f) && this.g == r0Var.g && k71.k.b(this.h, r0Var.h) && k71.k.b(this.i, r0Var.i) && k71.k.b(this.j, r0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.j.hashCode() + ((this.i.hashCode() + com.github.rudroid.copilot.h1.i((this.g.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.e, com.github.rudroid.m0.a(this.d, a0.s0.b(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), this.f, 31)) * 31, this.h, 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "CheckSuiteWorkflowRunFragment(id=", this.a, ", billableDurationInSeconds=", ", runNumber=");
        r.append(this.c);
        r.append(", createdAt=");
        r.append(this.d);
        r.append(", updatedAt=");
        f4.A(", resourcePath=", this.f, ", eventType=", r, this.e);
        r.append(this.g);
        r.append(", url=");
        r.append(this.h);
        r.append(", workflow=");
        r.append(this.i);
        r.append(", __typename=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }
}
