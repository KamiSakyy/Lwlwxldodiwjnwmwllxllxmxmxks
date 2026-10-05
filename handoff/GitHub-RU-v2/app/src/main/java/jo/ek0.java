package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ek0 {
    public final dk0 a;
    public final List b;

    public ek0(dk0 dk0Var, List list) {
        this.a = dk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj;
        return k71.k.b(this.a, ek0Var.a) && k71.k.b(this.b, ek0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
