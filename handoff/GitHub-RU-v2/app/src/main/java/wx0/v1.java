package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v1 {
    public String a;
    public int b;
    public List c;

    public v1(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return k71.k.b(this.a, v1Var.a) && this.b == v1Var.b && k71.k.b(this.c, v1Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(a0.s0.n(this.b, "Reviewers(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
}
