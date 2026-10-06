package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cv {
    public final ev a;
    public final List b;

    public cv(ev evVar, List list) {
        this.a = evVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return k71.k.b(this.a, cvVar.a) && k71.k.b(this.b, cvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Labels(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
