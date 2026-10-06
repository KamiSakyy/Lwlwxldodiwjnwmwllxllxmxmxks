package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ka {
    public final String a;
    public final ja b;
    public final String c;

    public ka(String str, ja jaVar, String str2) {
        this.a = str;
        this.b = jaVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return k71.k.b(this.a, kaVar.a) && k71.k.b(this.b, kaVar.b) && k71.k.b(this.c, kaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestReview(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
