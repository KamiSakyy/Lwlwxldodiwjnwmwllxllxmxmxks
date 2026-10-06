package vo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h2 implements aa.h0 {
    public final List a;
    public final String b;
    public final String c;

    public h2(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return k71.k.b(this.a, h2Var.a) && k71.k.b(this.b, h2Var.b) && k71.k.b(this.c, h2Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.n("WorkflowInputsFragment(inputs=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
