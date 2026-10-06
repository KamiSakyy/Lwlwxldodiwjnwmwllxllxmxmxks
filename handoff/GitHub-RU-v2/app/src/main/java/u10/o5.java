package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o5 {
    public v5 a;
    public List b;

    public o5(v5 v5Var, List list) {
        this.a = v5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return k71.k.b(this.a, o5Var.a) && k71.k.b(this.b, o5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "History(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
