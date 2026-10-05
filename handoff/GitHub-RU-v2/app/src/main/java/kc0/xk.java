package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xk {
    public final String a;
    public final String b;
    public final String c;
    public final uk d;
    public final wk e;
    public final gn0.gg f;
    public final boolean g;
    public final boolean h;
    public final ri0.u3 i;

    public xk(String str, String str2, String str3, uk ukVar, wk wkVar, gn0.gg ggVar, boolean z, boolean z2, ri0.u3 u3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ukVar;
        this.e = wkVar;
        this.f = ggVar;
        this.g = z;
        this.h = z2;
        this.i = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        return k71.k.b(this.a, xkVar.a) && k71.k.b(this.b, xkVar.b) && k71.k.b(this.c, xkVar.c) && k71.k.b(this.d, xkVar.d) && k71.k.b(this.e, xkVar.e) && this.f == xkVar.f && this.g == xkVar.g && this.h == xkVar.h && k71.k.b(this.i, xkVar.i);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        uk ukVar = this.d;
        int hashCode = (i + (ukVar == null ? 0 : ukVar.hashCode())) * 31;
        wk wkVar = this.e;
        return this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (wkVar != null ? wkVar.hashCode() : 0)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", baseRefName=");
        o.append(this.c);
        o.append(", mergeCommit=");
        o.append(this.d);
        o.append(", mergedBy=");
        o.append(this.e);
        o.append(", mergeStateStatus=");
        o.append(this.f);
        o.append(", viewerCanDeleteHeadRef=");
        com.github.rudroid.m0.A(o, this.g, ", viewerCanReopen=", this.h, ", pullRequestStateFragment=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
