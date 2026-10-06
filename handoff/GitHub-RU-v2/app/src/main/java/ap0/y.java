package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements aa.h0 {
    public w a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public x e;

    public y(w wVar, ZonedDateTime zonedDateTime, boolean z, String str, x xVar) {
        this.a = wVar;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && this.c == yVar.c && k71.k.b(this.d, yVar.d) && k71.k.b(this.e, yVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatedRepositoryFeedItemFragmentNoRelatedItems(actor=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", dismissable=");
        com.github.rudroid.m0.z(sb, this.c, ", identifier=", this.d, ", repository=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
