package xn;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3Shadow {
    public final int a;
    public final double b;
    public final int c;
    public final ZonedDateTime d;
    public final boolean e;

    public d3(int i, double d, int i2, ZonedDateTime zonedDateTime, boolean z) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = zonedDateTime;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3Shadow)) {
            return false;
        }
        d3Shadow d3Var = (d3Shadow) obj;
        return this.a == d3Var.a && Double.compare(this.b, d3Var.b) == 0 && this.c == d3Var.c && k71.k.b(this.d, d3Var.d) && this.e == d3Var.e;
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, (Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31, 31);
        ZonedDateTime zonedDateTime = this.d;
        return Boolean.hashCode(this.e) + ((b + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31);
    }

    public final String toString() {
        return "Quota(entitlement=" + this.a + ", percentageRemaining=" + this.b + ", overage=" + this.c + ", resetDate=" + this.d + ", overagePermitted=" + this.e + ")";
    }
}
