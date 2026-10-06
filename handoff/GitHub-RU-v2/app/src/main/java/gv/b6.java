package gv;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b6 {
    public String a;
    public da0 b;
    public b5 c;
    public String d;

    public b6(String str, da0 da0Var, b5 b5Var, String str2) {
        this.a = str;
        this.b = da0Var;
        this.c = b5Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return k71.k.b(this.a, b6Var.a) && this.b == b6Var.b && k71.k.b(this.c, b6Var.c) && k71.k.b(this.d, b6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
