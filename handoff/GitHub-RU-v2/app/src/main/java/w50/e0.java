package w50;

import a0.s0;
import com.github.rudroid.copilot.h1;
import hc0.jc;
import hc0.lc;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements aa.h0 {
    public String a;
    public jc b;
    public String c;
    public String d;
    public int e;
    public d0 f;
    public lc g;
    public String h;

    public e0(String str, jc jcVar, String str2, String str3, int i, d0 d0Var, lc lcVar, String str4) {
        this.a = str;
        this.b = jcVar;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = d0Var;
        this.g = lcVar;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && this.b == e0Var.b && k71.k.b(this.c, e0Var.c) && k71.k.b(this.d, e0Var.d) && this.e == e0Var.e && k71.k.b(this.f, e0Var.f) && this.g == e0Var.g && k71.k.b(this.h, e0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + s0.b(this.e, h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), 31)) * 31;
        lc lcVar = this.g;
        return this.h.hashCode() + ((hashCode + (lcVar == null ? 0 : lcVar.hashCode())) * 31);
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
