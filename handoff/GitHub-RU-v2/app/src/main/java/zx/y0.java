package zx;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public String a;
    public da0 b;
    public o0 c;
    public String d;

    public y0(String str, da0 da0Var, o0 o0Var, String str2) {
        this.a = str;
        this.b = da0Var;
        this.c = o0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && this.b == y0Var.b && k71.k.b(this.c, y0Var.c) && k71.k.b(this.d, y0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
