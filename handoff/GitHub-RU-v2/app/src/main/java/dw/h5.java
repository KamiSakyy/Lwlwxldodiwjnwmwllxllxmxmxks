package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 implements aa.h0 {
    public String a;
    public String b;
    public e5 c;
    public c4 d;
    public yw.b e;

    public h5(String str, String str2, e5 e5Var, c4 c4Var, yw.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = e5Var;
        this.d = c4Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return k71.k.b(this.a, h5Var.a) && k71.k.b(this.b, h5Var.b) && k71.k.b(this.c, h5Var.c) && k71.k.b(this.d, h5Var.d) && k71.k.b(this.e, h5Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e5 e5Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (e5Var == null ? 0 : e5Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryNodeFragmentOnlyId(__typename=", this.a, ", id=", this.b, ", issueOrPullRequest=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentBase=");
        o.append(this.d);
        o.append(", subscribableFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
