package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ut {
    public final tt a;
    public final String b;
    public final String c;

    public ut(tt ttVar, String str, String str2) {
        this.a = ttVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj;
        return k71.k.b(this.a, utVar.a) && k71.k.b(this.b, utVar.b) && k71.k.b(this.c, utVar.c);
    }

    public final int hashCode() {
        tt ttVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ttVar == null ? 0 : ttVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(release=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
