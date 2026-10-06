package gy0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import iy0.k0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public final String a;
    public final String b;
    public final iy0.e0 c;
    public final k0 d;

    public n(String str, String str2, iy0.e0 e0Var, k0 k0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e0Var;
        this.d = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c) && k71.k.b(this.d, nVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        iy0.e0 e0Var = this.c;
        int hashCode = (i + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        k0 k0Var = this.d;
        return hashCode + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", projectV2RelatedProjectsIssue=");
        o.append(this.c);
        o.append(", projectV2RelatedProjectsPullRequest=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
