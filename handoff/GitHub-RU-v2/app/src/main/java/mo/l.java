package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;
    public u b;
    public String c;

    public l(String str, u uVar, String str2) {
        this.a = str;
        this.b = uVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
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
