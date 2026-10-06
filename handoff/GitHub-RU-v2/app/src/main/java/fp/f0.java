package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public int a;
    public List b;
    public d0 c;

    public f0(int i, List list, d0 d0Var) {
        this.a = i;
        this.b = list;
        this.c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && k71.k.b(this.b, f0Var.b) && k71.k.b(this.c, f0Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "ViewerCodingAgents(totalCount=" + this.a + ", nodes=" + this.b + ", pageInfo=" + this.c + ")";
    }
    public static final Object B = null;
    public static final Object i = null;
    public static final Object j = null;
    public static final Object x = null;
    public static final Object y = null;
    public static final Object z = null;
}
