package iy0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.h0 {
    public final String a;
    public final String b;
    public final j0 c;

    public k0(String str, String str2, j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2RelatedProjectsPullRequest(__typename=", this.a, ", id=", this.b, ", projectsV2=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
