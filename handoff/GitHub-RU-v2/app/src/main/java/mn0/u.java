package mn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public List a;
    public int b;

    public u(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && this.b == uVar.b;
    }

    public final int hashCode() {
        List list = this.a;
        return Integer.hashCode(this.b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Repositories(nodes=" + this.a + ", totalCount=" + this.b + ")";
    }
}
