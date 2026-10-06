package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u3 {
    public final String a;
    public final String b;
    public final nv0.b c;
    public final xt0.u5 d;
    public final c1 e;

    public u3(String str, String str2, nv0.b bVar, xt0.u5 u5Var, c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = u5Var;
        this.e = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return k71.k.b(this.a, u3Var.a) && k71.k.b(this.b, u3Var.b) && k71.k.b(this.c, u3Var.c) && k71.k.b(this.d, u3Var.d) && k71.k.b(this.e, u3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", subscribableFragment=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentPullRequest=");
        o.append(this.d);
        o.append(", pullRequestV2ItemsFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
