package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jn implements aaShadow.v0 {
    public kn a;
    public String b;
    public String c;

    public jn(kn knVar, String str, String str2) {
        this.a = knVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return k71.k.b(this.a, jnVar.a) && k71.k.b(this.b, jnVar.b) && k71.k.b(this.c, jnVar.c);
    }

    public final int hashCode() {
        kn knVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((knVar == null ? 0 : knVar.hashCode()) * 31, this.b, 31);
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
