package d00;

import a0.s0;
import com.github.rudroid.copilot.h1;
import f00.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public String b;
    public f00.g0 c;
    public m0 d;

    public n(String str, String str2, f00.g0 g0Var, m0 m0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = g0Var;
        this.d = m0Var;
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
        f00.g0 g0Var = this.c;
        int hashCode = (i + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        m0 m0Var = this.d;
        return hashCode + (m0Var != null ? m0Var.hashCode() : 0);
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
