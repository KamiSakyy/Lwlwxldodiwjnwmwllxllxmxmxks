package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cu {
    public final bu a;
    public final List b;

    public cu(bu buVar, List list) {
        this.a = buVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        return k71.k.b(this.a, cuVar.a) && k71.k.b(this.b, cuVar.b);
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
