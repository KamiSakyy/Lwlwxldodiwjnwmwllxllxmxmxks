package ms;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public b0 a;
    public int b;
    public List c;

    public c0(b0 b0Var, int i, List list) {
        this.a = b0Var;
        this.b = i;
        this.c = list;
    }

    public static c0 a(c0 c0Var, int i, List list, int i2) {
        b0 b0Var = c0Var.a;
        if ((i2 & 2) != 0) {
            i = c0Var.b;
        }
        c0Var.getClass();
        return new c0(b0Var, i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && this.b == c0Var.b && k71.k.b(this.c, c0Var.c);
    }

    public final int hashCode() {
        int b = s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Replies(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}
