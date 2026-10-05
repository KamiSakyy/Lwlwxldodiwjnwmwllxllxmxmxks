package oj0;

import ri0.y5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 {
    public final String a;
    public final String b;
    public final ek0.b c;
    public final y5 d;

    public o2(String str, String str2, ek0.b bVar, y5 y5Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = y5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && k71.k.b(this.b, o2Var.b) && k71.k.b(this.c, o2Var.c) && k71.k.b(this.d, o2Var.d);
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
