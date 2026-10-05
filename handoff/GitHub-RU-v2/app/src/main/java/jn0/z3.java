package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z3 {
    public final ZonedDateTime a;
    public final n4 b;
    public final String c;
    public final String d;

    public z3(ZonedDateTime zonedDateTime, n4 n4Var, String str, String str2) {
        this.a = zonedDateTime;
        this.b = n4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return k71.k.b(this.a, z3Var.a) && k71.k.b(this.b, z3Var.b) && k71.k.b(this.c, z3Var.c) && k71.k.b(this.d, z3Var.d);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.a;
        int hashCode = (zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31;
        n4 n4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (n4Var != null ? n4Var.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Commit(pushedDate=");
        sb.append(this.a);
        sb.append(", statusCheckRollup=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
