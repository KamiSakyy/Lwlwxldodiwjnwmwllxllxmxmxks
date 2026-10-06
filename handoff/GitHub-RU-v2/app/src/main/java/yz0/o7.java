package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o7 extends s7 {
    public final com.github.service.models.response.a a;
    public final String b;
    public final int c;
    public final ZonedDateTime d;

    public o7(com.github.service.models.response.a aVar, String str, int i, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = str;
        this.c = i;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        return k71.k.b(this.a, o7Var.a) && k71.k.b(this.b, o7Var.b) && this.c == o7Var.c && k71.k.b(this.d, o7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "TimelineUnlabeledEvent(author=" + this.a + ", labelName=" + this.b + ", labelColor=" + this.c + ", createdAt=" + this.d + ")";
    }
}
