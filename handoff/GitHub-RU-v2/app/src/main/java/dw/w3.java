package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w3 {
    public final String a;
    public final String b;
    public final yw.b c;
    public final gv.g6 d;
    public final e1 e;

    public w3(String str, String str2, yw.b bVar, gv.g6 g6Var, e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = g6Var;
        this.e = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return k71.k.b(this.a, w3Var.a) && k71.k.b(this.b, w3Var.b) && k71.k.b(this.c, w3Var.c) && k71.k.b(this.d, w3Var.d) && k71.k.b(this.e, w3Var.e);
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
