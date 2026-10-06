package ty0;

import com.github.rudroid.m0;
import k71.k;
import x.i;
import yz0.t7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public t7 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public d(t7 t7Var, boolean z, boolean z2, boolean z3) {
        this.a = t7Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + i.e(i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
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
