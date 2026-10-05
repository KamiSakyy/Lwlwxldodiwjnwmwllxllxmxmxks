package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vu {
    public final tu a;
    public final List b;

    public vu(tu tuVar, List list) {
        this.a = tuVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu)) {
            return false;
        }
        vu vuVar = (vu) obj;
        return k71.k.b(this.a, vuVar.a) && k71.k.b(this.b, vuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
