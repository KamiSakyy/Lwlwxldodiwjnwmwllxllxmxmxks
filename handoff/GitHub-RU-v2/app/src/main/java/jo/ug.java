package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ug {
    public final xg a;
    public final List b;

    public ug(xg xgVar, List list) {
        this.a = xgVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return k71.k.b(this.a, ugVar.a) && k71.k.b(this.b, ugVar.b);
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
