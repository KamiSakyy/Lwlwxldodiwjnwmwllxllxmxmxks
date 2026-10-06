package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mg {
    public sg a;
    public List b;

    public mg(sg sgVar, List list) {
        this.a = sgVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        return k71.k.b(this.a, mgVar.a) && k71.k.b(this.b, mgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Followers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
