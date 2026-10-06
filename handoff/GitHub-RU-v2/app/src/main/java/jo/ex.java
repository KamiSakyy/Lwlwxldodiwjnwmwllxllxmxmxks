package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ex implements aaShadow.v0 {
    public ix a;
    public String b;
    public String c;

    public ex(ix ixVar, String str, String str2) {
        this.a = ixVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return k71.k.b(this.a, exVar.a) && k71.k.b(this.b, exVar.b) && k71.k.b(this.c, exVar.c);
    }

    public final int hashCode() {
        ix ixVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ixVar == null ? 0 : ixVar.hashCode()) * 31, this.b, 31);
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
