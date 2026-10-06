package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pa implements aaShadow.v0 {
    public final ua a;
    public final String b;
    public final String c;

    public pa(ua uaVar, String str, String str2) {
        this.a = uaVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        return k71.k.b(this.a, paVar.a) && k71.k.b(this.b, paVar.b) && k71.k.b(this.c, paVar.c);
    }

    public final int hashCode() {
        ua uaVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((uaVar == null ? 0 : uaVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
