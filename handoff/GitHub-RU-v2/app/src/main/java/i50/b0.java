package i50;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public a0 a;
    public int b;
    public List c;

    public b0(a0 a0Var, int i, List list) {
        this.a = a0Var;
        this.b = i;
        this.c = list;
    }

    public static b0 a(b0 b0Var, int i, List list, int i2) {
        a0 a0Var = b0Var.a;
        if ((i2 & 2) != 0) {
            i = b0Var.b;
        }
        b0Var.getClass();
        return new b0(a0Var, i, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && this.b == b0Var.b && k71.k.b(this.c, b0Var.c);
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
