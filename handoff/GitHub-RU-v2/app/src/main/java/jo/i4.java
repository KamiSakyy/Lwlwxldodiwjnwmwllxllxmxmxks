package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i4 {
    public final ZonedDateTime a;
    public final w4 b;
    public final String c;
    public final String d;

    public i4(ZonedDateTime zonedDateTime, w4 w4Var, String str, String str2) {
        this.a = zonedDateTime;
        this.b = w4Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return k71.k.b(this.a, i4Var.a) && k71.k.b(this.b, i4Var.b) && k71.k.b(this.c, i4Var.c) && k71.k.b(this.d, i4Var.d);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.a;
        int hashCode = (zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31;
        w4 w4Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (w4Var != null ? w4Var.hashCode() : 0)) * 31, this.c, 31);
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
