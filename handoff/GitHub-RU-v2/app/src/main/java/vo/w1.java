package vo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 implements aa.h0 {
    public List a;
    public v1 b;

    public w1(List list, v1 v1Var) {
        this.a = list;
        this.b = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return k71.k.b(this.a, w1Var.a) && k71.k.b(this.b, w1Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "WorkflowConnectionFragment(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
