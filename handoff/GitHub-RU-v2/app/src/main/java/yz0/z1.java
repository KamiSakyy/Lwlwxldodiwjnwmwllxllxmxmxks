package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 {
    public int a;
    public ZonedDateTime b;

    public z1(int i, ZonedDateTime zonedDateTime) {
        k71.k.g(zonedDateTime, "lastCommitDate");
        this.a = i;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a == z1Var.a && k71.k.b(this.b, z1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CommitsOverview(commitsCount=" + this.a + ", lastCommitDate=" + this.b + ")";
    }
}
