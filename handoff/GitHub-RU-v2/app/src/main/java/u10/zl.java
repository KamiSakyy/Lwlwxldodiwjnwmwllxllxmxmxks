package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zl {
    public final xl a;
    public final String b;
    public final String c;

    public zl(xl xlVar, String str, String str2) {
        this.a = xlVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl)) {
            return false;
        }
        zl zlVar = (zl) obj;
        return k71.k.b(this.a, zlVar.a) && k71.k.b(this.b, zlVar.b) && k71.k.b(this.c, zlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
