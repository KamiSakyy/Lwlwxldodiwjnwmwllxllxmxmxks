package zx;

import dw.x3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public String b;
    public x3 c;

    public r(String str, String str2, x3 x3Var) {
        this.a = str;
        this.b = str2;
        this.c = x3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryNodeFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
