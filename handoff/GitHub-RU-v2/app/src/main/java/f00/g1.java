package f00;

import java.time.ZonedDateTime;
import m10.ew;
import tz.x1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final boolean e;
    public final ew f;
    public final x1 g;

    public g1(String str, String str2, String str3, ZonedDateTime zonedDateTime, boolean z, ew ewVar, x1 x1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = z;
        this.f = ewVar;
        this.g = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b) && k71.k.b(this.c, g1Var.c) && k71.k.b(this.d, g1Var.d) && this.e == g1Var.e && this.f == g1Var.f && k71.k.b(this.g, g1Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + x.i.e(com.github.rudroid.m0.a(this.d, (i + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2ViewItemFragment(__typename=", this.a, ", id=", this.b, ", fullDatabaseId=");
        com.github.rudroid.copilot.h1.A(this.c, ", updatedAt=", ", isArchived=", o, this.d);
        o.append(this.e);
        o.append(", type=");
        o.append(this.f);
        o.append(", projectV2FieldValuesFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
