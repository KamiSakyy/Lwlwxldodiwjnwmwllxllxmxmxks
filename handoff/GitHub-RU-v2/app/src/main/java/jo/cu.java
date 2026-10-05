package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cu {
    public final int a;
    public final List b;

    public cu(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return this.a == cuVar.a && k71.k.b(this.b, cuVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Mentions(totalCount=", ", nodes=", ")", this.b);
    }
}
