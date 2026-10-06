package ox0;

import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public gu e;
    public j0 f;
    public boolean g;
    public String h;

    public p(String str, String str2, boolean z, int i, gu guVar, j0 j0Var, boolean z2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = guVar;
        this.f = j0Var;
        this.g = z2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && k71.k.b(this.f, pVar.f) && this.g == pVar.g && k71.k.b(this.h, pVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((this.e.hashCode() + a0.s0.b(this.d, x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", url=", this.b, ", isDraft=");
        com.github.rudroid.m0.y(o, this.c, ", number=", this.d, ", pullRequestState=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(", isInMergeQueue=");
        return com.github.rudroid.m0.l(o, this.g, ", titleHTML=", this.h, ")");
    }
}
