package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zt {
    public final yt a;
    public final List b;

    public zt(yt ytVar, List list) {
        this.a = ytVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt)) {
            return false;
        }
        zt ztVar = (zt) obj;
        return k71.k.b(this.a, ztVar.a) && k71.k.b(this.b, ztVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Refs(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
