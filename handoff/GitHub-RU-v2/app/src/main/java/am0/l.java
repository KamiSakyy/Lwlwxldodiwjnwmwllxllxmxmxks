package am0;

import com.github.rudroid.copilot.h1;
import gn0.xc;
import gn0.zc;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final String a;
    public final String b;
    public final int c;
    public final xc d;
    public final l0 e;
    public final zc f;
    public final String g;

    public l(String str, String str2, int i, xc xcVar, l0 l0Var, zc zcVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = xcVar;
        this.e = l0Var;
        this.f = zcVar;
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
        zc zcVar = this.f;
        return this.g.hashCode() + ((hashCode + (zcVar == null ? 0 : zcVar.hashCode())) * 31);
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
