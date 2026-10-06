package ow0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 {
    public String a;
    public n30 b;
    public z c;
    public String d;

    public j0(String str, n30 n30Var, z zVar, String str2) {
        this.a = str;
        this.b = n30Var;
        this.c = zVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && this.b == j0Var.b && k71.k.b(this.c, j0Var.c) && k71.k.b(this.d, j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
