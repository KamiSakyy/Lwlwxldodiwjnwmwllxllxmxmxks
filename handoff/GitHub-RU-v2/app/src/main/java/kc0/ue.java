package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ue {
    public final af a;
    public final List b;

    public ue(af afVar, List list) {
        this.a = afVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return k71.k.b(this.a, ueVar.a) && k71.k.b(this.b, ueVar.b);
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
