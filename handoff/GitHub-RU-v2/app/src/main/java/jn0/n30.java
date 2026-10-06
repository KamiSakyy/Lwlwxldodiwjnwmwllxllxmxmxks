package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n30 {
    public String a;
    public String b;
    public uu0.k3 c;
    public uu0.o d;

    public n30(String str, String str2, uu0.k3 k3Var, uu0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = k3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n30)) {
            return false;
        }
        n30 n30Var = (n30) obj;
        return k71.k.b(this.a, n30Var.a) && k71.k.b(this.b, n30Var.b) && k71.k.b(this.c, n30Var.c) && k71.k.b(this.d, n30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
