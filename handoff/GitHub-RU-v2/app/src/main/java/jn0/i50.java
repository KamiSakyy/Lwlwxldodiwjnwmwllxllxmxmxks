package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i50 {
    public final String a;
    public final String b;
    public final uu0.k3 c;
    public final uu0.o d;

    public i50(String str, String str2, uu0.k3 k3Var, uu0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = k3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return k71.k.b(this.a, i50Var.a) && k71.k.b(this.b, i50Var.b) && k71.k.b(this.c, i50Var.c) && k71.k.b(this.d, i50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
