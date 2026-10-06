package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ce {
    public ie a;
    public List b;

    public ce(ie ieVar, List list) {
        this.a = ieVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        return k71.k.b(this.a, ceVar.a) && k71.k.b(this.b, ceVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Following(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
