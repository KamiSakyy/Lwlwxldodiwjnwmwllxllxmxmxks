package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 extends s7 {
    public com.github.service.models.response.a a;
    public com.github.service.models.response.a b;
    public ZonedDateTime c;

    public c6(com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = aVar2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return k71.k.b(this.a, c6Var.a) && k71.k.b(this.b, c6Var.b) && k71.k.b(this.c, c6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jo.f4Shadow.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineCommentDeletedEvent(author=");
        sb.append(this.a);
        sb.append(", actor=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }
}
