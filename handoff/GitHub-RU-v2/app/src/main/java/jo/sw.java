package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sw {
    public final xw a;
    public final List b;

    public sw(xw xwVar, List list) {
        this.a = xwVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw)) {
            return false;
        }
        sw swVar = (sw) obj;
        return k71.k.b(this.a, swVar.a) && k71.k.b(this.b, swVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contributors(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }





}
