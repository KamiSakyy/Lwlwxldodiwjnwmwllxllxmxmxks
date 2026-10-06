package dl0;

import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public String a;
    public yv b;
    public v c;
    public String d;

    public f0(String str, yv yvVar, v vVar, String str2) {
        this.a = str;
        this.b = yvVar;
        this.c = vVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && this.b == f0Var.b && k71.k.b(this.c, f0Var.c) && k71.k.b(this.d, f0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
