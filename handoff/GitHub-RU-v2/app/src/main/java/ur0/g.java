package ur0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public int a;
    public List b;

    public g(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && k71.k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Assignees(totalCount=", ", nodes=", ")", this.b);
    }
}
