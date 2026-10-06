package ox0;

import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public String a;
    public String b;
    public int c;
    public bf d;
    public m0 e;
    public df f;
    public String g;

    public l(String str, String str2, int i, bf bfVar, m0 m0Var, df dfVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bfVar;
        this.e = m0Var;
        this.f = dfVar;
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
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31)) * 31;
        df dfVar = this.f;
        return this.g.hashCode() + ((hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31);
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
        return com.github.rudroid.copilot.h1.p(o, this.g, ")");
    }
}
