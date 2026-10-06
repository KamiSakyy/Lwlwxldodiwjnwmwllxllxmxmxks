package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sq implements aaShadow.v0 {
    public wq a;
    public String b;
    public String c;

    public sq(wq wqVar, String str, String str2) {
        this.a = wqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq)) {
            return false;
        }
        sq sqVar = (sq) obj;
        return k71.k.b(this.a, sqVar.a) && k71.k.b(this.b, sqVar.b) && k71.k.b(this.c, sqVar.c);
    }

    public final int hashCode() {
        wq wqVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wqVar == null ? 0 : wqVar.hashCode()) * 31, this.b, 31);
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
