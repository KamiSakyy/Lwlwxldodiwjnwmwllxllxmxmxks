package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ge {
    public de a;
    public String b;
    public String c;

    public ge(de deVar, String str, String str2) {
        this.a = deVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return k71.k.b(this.a, geVar.a) && k71.k.b(this.b, geVar.b) && k71.k.b(this.c, geVar.c);
    }

    public final int hashCode() {
        de deVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((deVar == null ? 0 : deVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(diff=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
