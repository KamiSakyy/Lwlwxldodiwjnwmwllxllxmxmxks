package w50;

import com.github.rudroid.copilot.h1;
import hc0.jc;
import hc0.lc;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.h0 {
    public final String a;
    public final jc b;
    public final lc c;
    public final boolean d;
    public final String e;

    public i0(String str, jc jcVar, lc lcVar, boolean z, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = jcVar;
        this.c = lcVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && this.b == i0Var.b && this.c == i0Var.c && this.d == i0Var.d && k71.k.b(this.e, i0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        lc lcVar = this.c;
        return this.e.hashCode() + x.i.e((hashCode + (lcVar == null ? 0 : lcVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateIssueStateFragment(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", stateReason=");
        sb.append(this.c);
        sb.append(", viewerCanReopen=");
        sb.append(this.d);
        sb.append(", __typename=");
        return h1.p(sb, this.e, ")");
    }
}
