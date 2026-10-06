package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t3 {
    public final ZonedDateTime a;
    public final h4 b;
    public final String c;
    public final String d;

    public t3(ZonedDateTime zonedDateTime, h4 h4Var, String str, String str2) {
        this.a = zonedDateTime;
        this.b = h4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return k71.k.b(this.a, t3Var.a) && k71.k.b(this.b, t3Var.b) && k71.k.b(this.c, t3Var.c) && k71.k.b(this.d, t3Var.d);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.a;
        int hashCode = (zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31;
        h4 h4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (h4Var != null ? h4Var.hashCode() : 0)) * 31, this.c, 31);
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
