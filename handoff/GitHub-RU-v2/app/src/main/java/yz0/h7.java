package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h7 extends s7 {
    public final com.github.service.models.response.a a;
    public final com.github.service.models.response.a b;
    public final String c;
    public final ZonedDateTime d;

    public h7(com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2, String str, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = aVar2;
        this.c = str;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return k71.k.b(this.a, h7Var.a) && k71.k.b(this.b, h7Var.b) && k71.k.b(this.c, h7Var.c) && k71.k.b(this.d, h7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(jo.f4.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return "TimelineReviewDismissedEvent(author=" + this.a + ", reviewer=" + this.b + ", dismissalHtml=" + this.c + ", createdAt=" + this.d + ")";
    }
}
