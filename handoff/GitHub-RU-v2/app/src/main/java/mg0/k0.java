package mg0;

import com.github.rudroid.copilot.h1;
import gn0.xc;
import gn0.zc;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.h0 {
    public final String a;
    public final xc b;
    public final zc c;
    public final boolean d;
    public final String e;

    public k0(String str, xc xcVar, zc zcVar, boolean z, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = xcVar;
        this.c = zcVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && this.b == k0Var.b && this.c == k0Var.c && this.d == k0Var.d && k71.k.b(this.e, k0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zc zcVar = this.c;
        return this.e.hashCode() + x.i.e((hashCode + (zcVar == null ? 0 : zcVar.hashCode())) * 31, 31, this.d);
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
