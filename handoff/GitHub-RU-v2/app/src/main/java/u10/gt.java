package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gt {
    public final et a;
    public final List b;

    public gt(et etVar, List list) {
        this.a = etVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        return k71.k.b(this.a, gtVar.a) && k71.k.b(this.b, gtVar.b);
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
