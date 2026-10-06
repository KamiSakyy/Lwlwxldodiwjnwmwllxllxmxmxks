package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yz {
    public xz a;
    public List b;

    public yz(xz xzVar, List list) {
        this.a = xzVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return k71.k.b(this.a, yzVar.a) && k71.k.b(this.b, yzVar.b);
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
