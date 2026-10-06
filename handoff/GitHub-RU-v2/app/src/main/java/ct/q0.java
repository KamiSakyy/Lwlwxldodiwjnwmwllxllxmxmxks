package ct;

import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.h0 {
    public final String a;
    public final wi b;
    public final String c;
    public final String d;
    public final int e;
    public final p0 f;
    public final yi g;
    public final String h;

    public q0(String str, wi wiVar, String str2, String str3, int i, p0 p0Var, yi yiVar, String str4) {
        this.a = str;
        this.b = wiVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = p0Var;
        this.g = yiVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && this.b == q0Var.b && k71.k.b(this.c, q0Var.c) && k71.k.b(this.d, q0Var.d) && this.e == q0Var.e && k71.k.b(this.f, q0Var.f) && this.g == q0Var.g && k71.k.b(this.h, q0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + a0.s0.b(this.e, h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31)) * 31;
        yi yiVar = this.g;
        return this.h.hashCode() + ((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31);
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
