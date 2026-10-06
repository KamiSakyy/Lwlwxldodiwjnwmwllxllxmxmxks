package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nf {
    public rf a;
    public List b;

    public nf(rf rfVar, List list) {
        this.a = rfVar;
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
        return "CodeSearch(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
