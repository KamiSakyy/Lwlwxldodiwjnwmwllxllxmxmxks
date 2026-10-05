package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vj {
    public final String a;
    public final String b;
    public final String c;
    public final sj d;
    public final uj e;
    public final hc0.ff f;
    public final boolean g;
    public final boolean h;
    public final z70.l3 i;

    public vj(String str, String str2, String str3, sj sjVar, uj ujVar, hc0.ff ffVar, boolean z, boolean z2, z70.l3 l3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sjVar;
        this.e = ujVar;
        this.f = ffVar;
        this.g = z;
        this.h = z2;
        this.i = l3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return k71.k.b(this.a, vjVar.a) && k71.k.b(this.b, vjVar.b) && k71.k.b(this.c, vjVar.c) && k71.k.b(this.d, vjVar.d) && k71.k.b(this.e, vjVar.e) && this.f == vjVar.f && this.g == vjVar.g && this.h == vjVar.h && k71.k.b(this.i, vjVar.i);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        sj sjVar = this.d;
        int hashCode = (i + (sjVar == null ? 0 : sjVar.hashCode())) * 31;
        uj ujVar = this.e;
        return this.i.hashCode() + x.i.e(x.i.e((this.f.hashCode() + ((hashCode + (ujVar != null ? ujVar.hashCode() : 0)) * 31)) * 31, 31, this.g), 31, this.h);
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
