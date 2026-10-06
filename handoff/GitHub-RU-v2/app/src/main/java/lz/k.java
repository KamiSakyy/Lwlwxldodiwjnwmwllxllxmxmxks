package lz;

import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public String b;
    public int c;
    public wi d;
    public m0 e;
    public yi f;
    public String g;

    public k(String str, String str2, int i, wi wiVar, m0 m0Var, yi yiVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = wiVar;
        this.e = m0Var;
        this.f = yiVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && k71.k.b(this.e, kVar.e) && this.f == kVar.f && k71.k.b(this.g, kVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31)) * 31;
        yi yiVar = this.f;
        return this.g.hashCode() + ((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(id=", this.a, ", url=", this.b, ", number=");
        o.append(this.c);
        o.append(", issueState=");
        o.append(this.d);
        o.append(", repository=");
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", titleHTMLString=");
        return h1.p(o, this.g, ")");
    }
}
