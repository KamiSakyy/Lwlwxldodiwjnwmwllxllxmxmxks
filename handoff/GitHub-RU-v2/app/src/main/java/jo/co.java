package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class co implements aaShadow.v0 {
    public final io a;
    public final String b;
    public final String c;

    public co(io ioVar, String str, String str2) {
        this.a = ioVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return k71.k.b(this.a, coVar.a) && k71.k.b(this.b, coVar.b) && k71.k.b(this.c, coVar.c);
    }

    public final int hashCode() {
        io ioVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ioVar == null ? 0 : ioVar.hashCode()) * 31, this.b, 31);
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
