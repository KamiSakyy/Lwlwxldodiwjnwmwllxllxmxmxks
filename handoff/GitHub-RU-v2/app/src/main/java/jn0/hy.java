package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hy {
    public final ay a;
    public final String b;
    public final String c;

    public hy(ay ayVar, String str, String str2) {
        this.a = ayVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy)) {
            return false;
        }
        hy hyVar = (hy) obj;
        return k71.k.b(this.a, hyVar.a) && k71.k.b(this.b, hyVar.b) && k71.k.b(this.c, hyVar.c);
    }

    public final int hashCode() {
        ay ayVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ayVar == null ? 0 : ayVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(author=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
