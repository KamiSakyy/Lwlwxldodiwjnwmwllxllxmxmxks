package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oi {
    public String a;
    public hc0.fm b;
    public boolean c;
    public String d;

    public oi(String str, hc0.fm fmVar, boolean z, String str2) {
        this.a = str;
        this.b = fmVar;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return k71.k.b(this.a, oiVar.a) && this.b == oiVar.b && this.c == oiVar.c && k71.k.b(this.d, oiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", pullRequestState=");
        sb.append(this.b);
        sb.append(", isDraft=");
        return com.github.rudroid.m0.l(sb, this.c, ", __typename=", this.d, ")");
    }
}
