package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 {
    public final String a;
    public final hc0.fm b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public y4(String str, hc0.fm fmVar, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = fmVar;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && this.b == y4Var.b && this.c == y4Var.c && this.d == y4Var.d && k71.k.b(this.e, y4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e(x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", viewerCanReopen=");
        com.github.rudroid.m0.A(sb, this.c, ", viewerCanDeleteHeadRef=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
