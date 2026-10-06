package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eh {
    public ih a;
    public List b;

    public eh(ih ihVar, List list) {
        this.a = ihVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return k71.k.b(this.a, ehVar.a) && k71.k.b(this.b, ehVar.b);
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
