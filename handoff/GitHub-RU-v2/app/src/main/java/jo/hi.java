package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hi {
    public final List a;
    public final xi b;

    public hi(List list, xi xiVar) {
        this.a = list;
        this.b = xiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return k71.k.b(this.a, hiVar.a) && k71.k.b(this.b, hiVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b.a) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Code(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
