package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fq {
    public String a;
    public String b;
    public uu0.k3 c;
    public uu0.o d;

    public fq(String str, String str2, uu0.k3 k3Var, uu0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = k3Var;
        this.d = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return k71.k.b(this.a, fqVar.a) && k71.k.b(this.b, fqVar.b) && k71.k.b(this.c, fqVar.c) && k71.k.b(this.d, fqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(", issueTemplateFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
