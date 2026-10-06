package q00;

import com.github.rudroid.m0;
import k71.k;
import x.i;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    public t7 a;
    public boolean b;
    public boolean c;
    public boolean d;

    public e(t7 t7Var, boolean z, boolean z2, boolean z3) {
        this.a = t7Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
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
    public static Object g(Object p1, Object p2) { return null; }
}
