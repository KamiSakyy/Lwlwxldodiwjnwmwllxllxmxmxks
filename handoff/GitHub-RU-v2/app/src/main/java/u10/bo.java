package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bo {
    public ao a;
    public List b;

    public bo(ao aoVar, List list) {
        this.a = aoVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        return k71.k.b(this.a, boVar.a) && k71.k.b(this.b, boVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Reactions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
