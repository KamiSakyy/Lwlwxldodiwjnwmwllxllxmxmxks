package gv;

import java.time.ZonedDateTime;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.h0 {
    public final String a;
    public final ZonedDateTime b;
    public final b00 c;
    public final String d;
    public final z2 e;

    public o(String str, ZonedDateTime zonedDateTime, b00 b00Var, String str2, z2 z2Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = b00Var;
        this.d = str2;
        this.e = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && this.c == oVar.c && k71.k.b(this.d, oVar.d) && k71.k.b(this.e, oVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("DeploymentReviewAssociatedPr(__typename=", this.a, ", lastEditedAt=", ", state=", this.b);
        s.append(this.c);
        s.append(", id=");
        s.append(this.d);
        s.append(", pullRequestItemFragment=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
