package g20;

import hc0.u00;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v2 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public u00 d;
    public ZonedDateTime e;
    public u2 f;
    public n2 g;
    public String h;

    public v2(String str, String str2, int i, u00 u00Var, ZonedDateTime zonedDateTime, u2 u2Var, n2 n2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = u00Var;
        this.e = zonedDateTime;
        this.f = u2Var;
        this.g = n2Var;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return k71.k.b(this.a, v2Var.a) && k71.k.b(this.b, v2Var.b) && this.c == v2Var.c && this.d == v2Var.d && k71.k.b(this.e, v2Var.e) && k71.k.b(this.f, v2Var.f) && k71.k.b(this.g, v2Var.g) && k71.k.b(this.h, v2Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + com.github.rudroid.m0.a(this.e, (this.d.hashCode() + a0.s0.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRunFragment(id=", this.a, ", title=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", eventType=");
        o.append(this.d);
        o.append(", createdAt=");
        o.append(this.e);
        o.append(", workflow=");
        o.append(this.f);
        o.append(", checkSuite=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
