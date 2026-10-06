package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public a b;
    public String c;

    public g(String str, a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return this.c.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDiscussionComment(url=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", id=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
