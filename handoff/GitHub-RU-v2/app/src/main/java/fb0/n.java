package fb0;

import com.github.rudroid.copilot.h1;
import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public fm e;
    public h0 f;
    public String g;

    public n(String str, String str2, boolean z, int i, fm fmVar, h0 h0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = fmVar;
        this.f = h0Var;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && this.c == nVar.c && this.d == nVar.d && this.e == nVar.e && k71.k.b(this.f, nVar.f) && k71.k.b(this.g, nVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", url=", this.b, ", isDraft=");
        com.github.rudroid.m0.y(o, this.c, ", number=", this.d, ", pullRequestState=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(", titleHTML=");
        return h1.p(o, this.g, ")");
    }
}
