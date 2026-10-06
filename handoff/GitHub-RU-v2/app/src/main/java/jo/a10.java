package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a10 {
    public z00 a;
    public List b;

    public a10(z00 z00Var, List list) {
        this.a = z00Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return k71.k.b(this.a, a10Var.a) && k71.k.b(this.b, a10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Patches(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
