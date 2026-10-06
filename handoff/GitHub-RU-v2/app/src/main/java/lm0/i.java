package lm0;

import com.github.rudroid.m0;
import yz0.t7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final t7 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public i(t7 t7Var, boolean z, boolean z2, boolean z3) {
        this.a = t7Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
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
