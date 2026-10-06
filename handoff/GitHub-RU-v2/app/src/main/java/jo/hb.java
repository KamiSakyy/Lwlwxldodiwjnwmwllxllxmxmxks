package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hb {
    public String a;
    public boolean b;
    public boolean c;
    public db d;
    public String e;

    public hb(String str, boolean z, boolean z2, db dbVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = dbVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return k71.k.b(this.a, hbVar.a) && this.b == hbVar.b && this.c == hbVar.c && k71.k.b(this.d, hbVar.d) && k71.k.b(this.e, hbVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        db dbVar = this.d;
        return this.e.hashCode() + ((e + (dbVar == null ? 0 : dbVar.a.hashCode())) * 31);
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
