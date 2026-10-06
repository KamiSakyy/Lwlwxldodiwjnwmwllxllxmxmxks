package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class om {
    public final String a;
    public final String b;
    public final String c;
    public final lm d;
    public final nm e;
    public final pz0.si f;
    public final boolean g;
    public final boolean h;
    public final xt0.u3 i;

    public om(String str, String str2, String str3, lm lmVar, nm nmVar, pz0.si siVar, boolean z, boolean z2, xt0.u3 u3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = lmVar;
        this.e = nmVar;
        this.f = siVar;
        this.g = z;
        this.h = z2;
        this.i = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        return k71.k.b(this.a, omVar.a) && k71.k.b(this.b, omVar.b) && k71.k.b(this.c, omVar.c) && k71.k.b(this.d, omVar.d) && k71.k.b(this.e, omVar.e) && this.f == omVar.f && this.g == omVar.g && this.h == omVar.h && k71.k.b(this.i, omVar.i);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        lm lmVar = this.d;
        int hashCode = (i + (lmVar == null ? 0 : lmVar.hashCode())) * 31;
        nm nmVar = this.e;
        return this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (nmVar != null ? nmVar.hashCode() : 0)) * 31)) * 31, 31, this.g), 31, this.h);
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

    public Object i;
}
