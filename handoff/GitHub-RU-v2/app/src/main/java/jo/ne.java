package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ne {
    public final List a;
    public final me b;

    public ne(List list, me meVar) {
        this.a = list;
        this.b = meVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj;
        return k71.k.b(this.a, neVar.a) && k71.k.b(this.b, neVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Repositories(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
