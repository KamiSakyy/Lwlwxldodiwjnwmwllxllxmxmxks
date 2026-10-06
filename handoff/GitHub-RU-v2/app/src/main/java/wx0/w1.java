package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w1 {
    public String a;
    public int b;
    public List c;

    public w1(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return k71.k.b(this.a, w1Var.a) && this.b == w1Var.b && k71.k.b(this.c, w1Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(a0.s0.n(this.b, "Users(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
}
