package xt0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 {
    public String a;
    public n30 b;
    public r4 c;
    public String d;

    public p5(String str, n30 n30Var, r4 r4Var, String str2) {
        this.a = str;
        this.b = n30Var;
        this.c = r4Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return k71.k.b(this.a, p5Var.a) && this.b == p5Var.b && k71.k.b(this.c, p5Var.c) && k71.k.b(this.d, p5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
