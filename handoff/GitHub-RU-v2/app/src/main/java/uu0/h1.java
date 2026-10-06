package uu0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 {
    public n30 a;
    public String b;
    public String c;

    public h1(String str, String str2, n30 n30Var) {
        this.a = n30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c);
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
    public static final Object i = null;
}
