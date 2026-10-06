package ct;

import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.h0 {
    public final String a;
    public final wi b;
    public final yi c;
    public final boolean d;
    public final v0 e;
    public final u0 f;
    public final String g;

    public w0(String str, wi wiVar, yi yiVar, boolean z, v0 v0Var, u0 u0Var, String str2) {
        this.a = str;
        this.b = wiVar;
        this.c = yiVar;
        this.d = z;
        this.e = v0Var;
        this.f = u0Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && this.b == w0Var.b && this.c == w0Var.c && this.d == w0Var.d && k71.k.b(this.e, w0Var.e) && k71.k.b(this.f, w0Var.f) && k71.k.b(this.g, w0Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yi yiVar = this.c;
        int e = x.i.e((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31, 31, this.d);
        v0 v0Var = this.e;
        int hashCode2 = (e + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        u0 u0Var = this.f;
        return this.g.hashCode() + ((hashCode2 + (u0Var != null ? u0Var.hashCode() : 0)) * 31);
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
        sb.append(", parent=");
        sb.append(this.e);
        sb.append(", duplicateOf=");
        sb.append(this.f);
        sb.append(", __typename=");
        return h1.p(sb, this.g, ")");
    }
}
