package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ns {
    public ms a;
    public List b;

    public ns(ms msVar, List list) {
        this.a = msVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        return k71.k.b(this.a, nsVar.a) && k71.k.b(this.b, nsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Stargazers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
