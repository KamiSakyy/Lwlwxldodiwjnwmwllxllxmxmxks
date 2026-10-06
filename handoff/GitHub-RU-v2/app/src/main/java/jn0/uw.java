package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uw {
    public tw a;
    public List b;

    public uw(tw twVar, List list) {
        this.a = twVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return k71.k.b(this.a, uwVar.a) && k71.k.b(this.b, uwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Watchers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
