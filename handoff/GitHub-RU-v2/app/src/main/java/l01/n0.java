package l01;

import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 implements vb.a {
    public final m0 a;
    public final Object b;
    public final boolean c;
    public final int d;

    public n0(m0 m0Var, List list, boolean z, int i) {
        this.a = m0Var;
        this.b = list;
        this.c = z;
        this.d = i;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a.equals(n0Var.a) && this.b.equals(n0Var.b) && this.c == n0Var.c && this.d == n0Var.d;
    }

    public final String getGroupId() {
        return this.a.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + x.i.e(h1.h(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return "ProjectViewGroupedItems(group=" + this.a + ", items=" + this.b + ", hasNextPage=" + this.c + ", totalCount=" + this.d + ")";
    }
}
