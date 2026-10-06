package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ne {
    public List a;
    public pe b;

    public ne(List list, pe peVar) {
        this.a = list;
        this.b = peVar;
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
        return "Feed(filters=" + this.a + ", items=" + this.b + ")";
    }
}
