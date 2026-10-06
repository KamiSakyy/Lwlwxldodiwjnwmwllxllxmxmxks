package qn0;

import java.util.ArrayList;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 {
    public n30 a;
    public ArrayList b;
    public String c;
    public String d;

    public z1(n30 n30Var, ArrayList arrayList, String str, String str2) {
        this.a = n30Var;
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
