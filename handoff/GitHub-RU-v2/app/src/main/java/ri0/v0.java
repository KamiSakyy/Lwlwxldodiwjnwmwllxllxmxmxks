package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 {
    public String a;
    public String b;
    public oj0.e2 c;
    public oj0.h d;

    public v0(String str, String str2, oj0.e2 e2Var, oj0.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && k71.k.b(this.c, v0Var.c) && k71.k.b(this.d, v0Var.d);
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
