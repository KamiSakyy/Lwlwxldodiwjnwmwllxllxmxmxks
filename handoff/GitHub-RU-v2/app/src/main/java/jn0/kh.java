package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kh {
    public List a;
    public ai b;

    public kh(List list, ai aiVar) {
        this.a = list;
        this.b = aiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return k71.k.b(this.a, khVar.a) && k71.k.b(this.b, khVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b.a) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Code(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
