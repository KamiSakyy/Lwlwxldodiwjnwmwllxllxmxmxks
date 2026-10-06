package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ka {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ga d;
    public final String e;

    public ka(String str, boolean z, boolean z2, ga gaVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = gaVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return k71.k.b(this.a, kaVar.a) && this.b == kaVar.b && this.c == kaVar.c && k71.k.b(this.d, kaVar.d) && k71.k.b(this.e, kaVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ga gaVar = this.d;
        return this.e.hashCode() + ((e + (gaVar == null ? 0 : gaVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("PullRequest(id=", this.a, ", viewerCanEnableAutoMerge=", ", viewerCanDisableAutoMerge=", this.b);
        o.append(this.c);
        o.append(", autoMergeRequest=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
