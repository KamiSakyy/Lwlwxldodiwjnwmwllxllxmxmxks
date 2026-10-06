package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w3 {
    public f4 a;
    public List b;

    public w3(f4 f4Var, List list) {
        this.a = f4Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return k71.k.b(this.a, w3Var.a) && k71.k.b(this.b, w3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contexts(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
