package ri0;

import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t5 {
    public final String a;
    public final yv b;
    public final s4 c;
    public final String d;

    public t5(String str, yv yvVar, s4 s4Var, String str2) {
        this.a = str;
        this.b = yvVar;
        this.c = s4Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && this.b == t5Var.b && k71.k.b(this.c, t5Var.c) && k71.k.b(this.d, t5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusCheckRollup(id=" + this.a + ", state=" + this.b + ", contexts=" + this.c + ", __typename=" + this.d + ")";
    }
}
