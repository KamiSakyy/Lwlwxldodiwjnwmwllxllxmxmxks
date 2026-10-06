package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aa.h0 {
    public String a;
    public String b;
    public u3 c;
    public c4 d;
    public yw.b e;

    public x3(String str, String str2, u3 u3Var, c4 c4Var, yw.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = u3Var;
        this.d = c4Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return k71.k.b(this.a, x3Var.a) && k71.k.b(this.b, x3Var.b) && k71.k.b(this.c, x3Var.c) && k71.k.b(this.d, x3Var.d) && k71.k.b(this.e, x3Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        u3 u3Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (u3Var == null ? 0 : u3Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryNodeFragment(__typename=", this.a, ", id=", this.b, ", issueOrPullRequest=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentBase=");
        o.append(this.d);
        o.append(", subscribableFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
