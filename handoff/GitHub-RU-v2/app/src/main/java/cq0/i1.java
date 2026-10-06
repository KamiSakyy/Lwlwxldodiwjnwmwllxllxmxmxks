package cq0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 {
    public String a;
    public n30 b;
    public String c;

    public i1(String str, String str2, n30 n30Var) {
        this.a = str;
        this.b = n30Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && this.b == i1Var.b && k71.k.b(this.c, i1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
