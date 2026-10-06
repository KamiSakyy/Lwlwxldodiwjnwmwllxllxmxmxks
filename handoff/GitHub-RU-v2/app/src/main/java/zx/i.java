package zx;

import dw.h5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public String b;
    public h5 c;

    public i(String str, String str2, h5 h5Var) {
        this.a = str;
        this.b = str2;
        this.c = h5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryNodeFragmentOnlyId=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
