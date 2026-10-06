package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mo {
    public oo a;
    public List b;

    public mo(oo ooVar, List list) {
        this.a = ooVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return false;
        }
        mo moVar = (mo) obj;
        return k71.k.b(this.a, moVar.a) && k71.k.b(this.b, moVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Mentions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
