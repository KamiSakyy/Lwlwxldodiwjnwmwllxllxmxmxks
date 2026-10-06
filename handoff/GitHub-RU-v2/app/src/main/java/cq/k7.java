package cq;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k7 {
    public da0 a;
    public String b;
    public String c;

    public k7(String str, String str2, da0 da0Var) {
        this.a = da0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return this.a == k7Var.a && k71.k.b(this.b, k7Var.b) && k71.k.b(this.c, k7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(state=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
