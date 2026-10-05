package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nf {
    public final pf a;
    public final List b;

    public nf(pf pfVar, List list) {
        this.a = pfVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf)) {
            return false;
        }
        nf nfVar = (nf) obj;
        return k71.k.b(this.a, nfVar.a) && k71.k.b(this.b, nfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Items(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
