package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oo {
    public final no a;
    public final List b;

    public oo(no noVar, List list) {
        this.a = noVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        return k71.k.b(this.a, ooVar.a) && k71.k.b(this.b, ooVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Teams(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
