package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 {
    public int a;
    public List b;

    public s4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return this.a == s4Var.a && k71.k.b(this.b, s4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Contexts(totalCount=", ", nodes=", ")", this.b);
    }
}
