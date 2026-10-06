package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class be {
    public he a;
    public List b;

    public be(he heVar, List list) {
        this.a = heVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return k71.k.b(this.a, beVar.a) && k71.k.b(this.b, beVar.b);
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
