package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mu {
    public ju a;
    public List b;

    public mu(ju juVar, List list) {
        this.a = juVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        return k71.k.b(this.a, muVar.a) && k71.k.b(this.b, muVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ReleaseAssets(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
