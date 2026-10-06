package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 extends s7 {
    public String a;
    public ZonedDateTime b;

    public s5(String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "enqueuerDisplayName");
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineAddedToMergeQueueEvent(enqueuerDisplayName=" + this.a + ", createdAt=" + this.b + ")";
    }
}
