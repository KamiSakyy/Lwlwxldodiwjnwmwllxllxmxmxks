package pb0;

import com.github.rudroid.m0;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public t7 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public h(t7 t7Var, boolean z, boolean z2, boolean z3) {
        this.a = t7Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfilteredTopRepository(topRepository=");
        sb.append(this.a);
        sb.append(", isArchived=");
        sb.append(this.b);
        sb.append(", hasIssuesEnabled=");
        return m0.m(sb, this.c, ", isDiscussionsEnabled=", this.d, ")");
    }
}
