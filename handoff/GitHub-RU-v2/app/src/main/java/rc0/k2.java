package rc0;

import gn0.e20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k2 {
    public final String a;
    public final String b;
    public final String c;
    public final e20 d;
    public final l2 e;

    public k2(String str, String str2, String str3, e20 e20Var, l2 l2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e20Var;
        this.e = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && k71.k.b(this.b, k2Var.b) && k71.k.b(this.c, k2Var.c) && this.d == k2Var.d && k71.k.b(this.e, k2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflow(id=", this.a, ", name=", this.b, ", url=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", runs=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
