package qo;

import java.util.ArrayList;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public final da0 a;
    public final ArrayList b;
    public final String c;
    public final String d;

    public z1(da0 da0Var, ArrayList arrayList, String str, String str2) {
        this.a = da0Var;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.a == z1Var.a && this.b.equals(z1Var.b) && this.c.equals(z1Var.c) && this.d.equals(z1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(no.a.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status(state=");
        sb.append(this.a);
        sb.append(", contexts=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
