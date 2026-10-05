package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i9 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final e9 d;
    public final String e;

    public i9(String str, boolean z, boolean z2, e9 e9Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = e9Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return k71.k.b(this.a, i9Var.a) && this.b == i9Var.b && this.c == i9Var.c && k71.k.b(this.d, i9Var.d) && k71.k.b(this.e, i9Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        e9 e9Var = this.d;
        return this.e.hashCode() + ((e + (e9Var == null ? 0 : e9Var.a.hashCode())) * 31);
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
