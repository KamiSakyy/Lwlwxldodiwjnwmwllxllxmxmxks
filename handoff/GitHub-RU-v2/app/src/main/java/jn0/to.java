package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class to {
    public final uo a;
    public final List b;

    public to(uo uoVar, List list) {
        this.a = uoVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        return k71.k.b(this.a, toVar.a) && k71.k.b(this.b, toVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Organizations(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
