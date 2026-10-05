package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tn {
    public final String a;
    public final String b;
    public final String c;
    public final qn d;
    public final sn e;
    public final m10.wm f;
    public final boolean g;
    public final boolean h;
    public final gv.e4 i;

    public tn(String str, String str2, String str3, qn qnVar, sn snVar, m10.wm wmVar, boolean z, boolean z2, gv.e4 e4Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qnVar;
        this.e = snVar;
        this.f = wmVar;
        this.g = z;
        this.h = z2;
        this.i = e4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return k71.k.b(this.a, tnVar.a) && k71.k.b(this.b, tnVar.b) && k71.k.b(this.c, tnVar.c) && k71.k.b(this.d, tnVar.d) && k71.k.b(this.e, tnVar.e) && this.f == tnVar.f && this.g == tnVar.g && this.h == tnVar.h && k71.k.b(this.i, tnVar.i);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        qn qnVar = this.d;
        int hashCode = (i + (qnVar == null ? 0 : qnVar.hashCode())) * 31;
        sn snVar = this.e;
        return this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (snVar != null ? snVar.hashCode() : 0)) * 31)) * 31, 31, this.g), 31, this.h);
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
