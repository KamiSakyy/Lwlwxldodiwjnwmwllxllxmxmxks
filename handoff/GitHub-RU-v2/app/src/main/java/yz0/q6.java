package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q6 extends s7 {
    public com.github.service.models.response.a a;
    public String b;
    public int c;
    public ZonedDateTime d;

    public q6(com.github.service.models.response.a aVar, String str, int i, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = str;
        this.c = i;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return k71.k.b(this.a, q6Var.a) && k71.k.b(this.b, q6Var.b) && this.c == q6Var.c && k71.k.b(this.d, q6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "TimelineLabeledEvent(author=" + this.a + ", labelName=" + this.b + ", labelColor=" + this.c + ", createdAt=" + this.d + ")";
    }
}
