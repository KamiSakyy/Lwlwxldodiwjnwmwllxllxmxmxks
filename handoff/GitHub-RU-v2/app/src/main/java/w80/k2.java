package w80;

import z70.l5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {
    public String a;
    public String b;
    public m90.b c;
    public l5 d;

    public k2(String str, String str2, m90.b bVar, l5 l5Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && k71.k.b(this.b, k2Var.b) && k71.k.b(this.c, k2Var.c) && k71.k.b(this.d, k2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", subscribableFragment=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentPullRequest=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
