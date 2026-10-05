package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jh {
    public final ph a;
    public final List b;

    public jh(ph phVar, List list) {
        this.a = phVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return k71.k.b(this.a, jhVar.a) && k71.k.b(this.b, jhVar.b);
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
