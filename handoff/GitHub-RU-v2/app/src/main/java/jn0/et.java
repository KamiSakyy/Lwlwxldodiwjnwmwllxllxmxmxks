package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class et {
    public dt a;
    public List b;

    public et(dt dtVar, List list) {
        this.a = dtVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return k71.k.b(this.a, etVar.a) && k71.k.b(this.b, etVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Releases(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
