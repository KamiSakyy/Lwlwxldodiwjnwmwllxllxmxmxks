package mg0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gn0.xc;
import gn0.zc;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 implements aa.h0 {
    public final String a;
    public final xc b;
    public final String c;
    public final String d;
    public final int e;
    public final f0 f;
    public final zc g;
    public final String h;

    public g0(String str, xc xcVar, String str2, String str3, int i, f0 f0Var, zc zcVar, String str4) {
        this.a = str;
        this.b = xcVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = f0Var;
        this.g = zcVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && this.b == g0Var.b && k71.k.b(this.c, g0Var.c) && k71.k.b(this.d, g0Var.d) && this.e == g0Var.e && k71.k.b(this.f, g0Var.f) && this.g == g0Var.g && k71.k.b(this.h, g0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + s0.b(this.e, h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31)) * 31;
        zc zcVar = this.g;
        return this.h.hashCode() + ((hashCode + (zcVar == null ? 0 : zcVar.hashCode())) * 31);
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
