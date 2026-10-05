package mo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public final List a;
    public final int b;

    public v(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && this.b == vVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Integer.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Repositories(nodes=" + this.a + ", totalCount=" + this.b + ")";
    }
}
