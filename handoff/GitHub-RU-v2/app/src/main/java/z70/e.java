package z70;

import hc0.fm;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public fm c;
    public String d;
    public l2 e;

    public e(String str, ZonedDateTime zonedDateTime, fm fmVar, String str2, l2 l2Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = fmVar;
        this.d = str2;
        this.e = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && this.c == eVar.c && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e);
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
