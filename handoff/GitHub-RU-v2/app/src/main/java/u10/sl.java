package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sl {
    public rl a;
    public List b;

    public sl(rl rlVar, List list) {
        this.a = rlVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        return k71.k.b(this.a, slVar.a) && k71.k.b(this.b, slVar.b);
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
