package fb0;

import com.github.rudroid.copilot.h1;
import hc0.jc;
import hc0.lc;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final String a;
    public final String b;
    public final int c;
    public final jc d;
    public final k0 e;
    public final lc f;
    public final String g;

    public l(String str, String str2, int i, jc jcVar, k0 k0Var, lc lcVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = jcVar;
        this.e = k0Var;
        this.f = lcVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d && k71.k.b(this.e, lVar.e) && this.f == lVar.f && k71.k.b(this.g, lVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31)) * 31;
        lc lcVar = this.f;
        return this.g.hashCode() + ((hashCode + (lcVar == null ? 0 : lcVar.hashCode())) * 31);
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
