package ur0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.h0 {
    public final String a;
    public final bf b;
    public final String c;
    public final String d;
    public final int e;
    public final j0 f;
    public final df g;
    public final String h;

    public k0(String str, bf bfVar, String str2, String str3, int i, j0 j0Var, df dfVar, String str4) {
        this.a = str;
        this.b = bfVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j0Var;
        this.g = dfVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && this.b == k0Var.b && k71.k.b(this.c, k0Var.c) && k71.k.b(this.d, k0Var.d) && this.e == k0Var.e && k71.k.b(this.f, k0Var.f) && this.g == k0Var.g && k71.k.b(this.h, k0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + s0.b(this.e, h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31)) * 31;
        df dfVar = this.g;
        return this.h.hashCode() + ((hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedIssueFragment(id=");
        sb.append(this.a);
        sb.append(", issueState=");
        sb.append(this.b);
        sb.append(", title=");
        f1.e.x(sb, this.c, ", url=", this.d, ", number=");
        sb.append(this.e);
        sb.append(", repository=");
        sb.append(this.f);
        sb.append(", stateReason=");
        sb.append(this.g);
        sb.append(", __typename=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
