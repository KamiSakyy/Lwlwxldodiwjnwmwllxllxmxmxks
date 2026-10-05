package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t10 {
    public final String a;
    public final String b;
    public final oj0.e2 c;
    public final oj0.h d;

    public t10(String str, String str2, oj0.e2 e2Var, oj0.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return k71.k.b(this.a, t10Var.a) && k71.k.b(this.b, t10Var.b) && k71.k.b(this.c, t10Var.c) && k71.k.b(this.d, t10Var.d);
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
