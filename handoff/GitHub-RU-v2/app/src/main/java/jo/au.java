package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class au implements aaShadow.v0 {
    public nu a;
    public String b;
    public String c;

    public au(nu nuVar, String str, String str2) {
        this.a = nuVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return k71.k.b(this.a, auVar.a) && k71.k.b(this.b, auVar.b) && k71.k.b(this.c, auVar.c);
    }

    public final int hashCode() {
        nu nuVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nuVar == null ? 0 : nuVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
