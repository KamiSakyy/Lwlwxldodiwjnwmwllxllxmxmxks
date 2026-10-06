package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.h0 {
    public String a;
    public String b;
    public m2 c;
    public s2 d;
    public ek0.b e;

    public p2(String str, String str2, m2 m2Var, s2 s2Var, ek0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = m2Var;
        this.d = s2Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b) && k71.k.b(this.c, p2Var.c) && k71.k.b(this.d, p2Var.d) && k71.k.b(this.e, p2Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        m2 m2Var = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (m2Var == null ? 0 : m2Var.hashCode())) * 31)) * 31);
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
