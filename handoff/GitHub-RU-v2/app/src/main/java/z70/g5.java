package z70;

import hc0.uu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g5 {
    public String a;
    public uu b;
    public h4 c;
    public String d;

    public g5(String str, uu uuVar, h4 h4Var, String str2) {
        this.a = str;
        this.b = uuVar;
        this.c = h4Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return k71.k.b(this.a, g5Var.a) && this.b == g5Var.b && k71.k.b(this.c, g5Var.c) && k71.k.b(this.d, g5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
