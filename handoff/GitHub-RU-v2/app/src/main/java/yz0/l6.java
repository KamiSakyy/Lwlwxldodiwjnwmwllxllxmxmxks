package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 extends s7 {
    public String a;
    public com.github.service.models.response.a b;
    public ZonedDateTime c;

    public l6(com.github.service.models.response.a aVar, String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "headRefName");
        this.a = str;
        this.b = aVar;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return k71.k.b(this.a, l6Var.a) && k71.k.b(this.b, l6Var.b) && k71.k.b(this.c, l6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jo.f4.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineHeadRefDeleted(headRefName=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }
}
