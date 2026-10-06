package oj0;

import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 {
    public yv a;
    public String b;
    public String c;

    public h0(yv yvVar, String str, String str2) {
        this.a = yvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c);
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
