package g20;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 {
    public ZonedDateTime a;
    public String b;
    public String c;

    public a2(String str, String str2, ZonedDateTime zonedDateTime) {
        this.a = zonedDateTime;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.a, a2Var.a) && k71.k.b(this.b, a2Var.b) && k71.k.b(this.c, a2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(createdAt=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
