package mn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final String a;
    public final t b;
    public final String c;

    public k(String str, t tVar, String str2) {
        this.a = str;
        this.b = tVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPullRequestReview(url=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", id=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
