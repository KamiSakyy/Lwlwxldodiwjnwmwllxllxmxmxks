package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cn implements aa.v0 {
    public final fn a;
    public final String b;
    public final String c;

    public cn(fn fnVar, String str, String str2) {
        this.a = fnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return k71.k.b(this.a, cnVar.a) && k71.k.b(this.b, cnVar.b) && k71.k.b(this.c, cnVar.c);
    }

    public final int hashCode() {
        fn fnVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fnVar == null ? 0 : fnVar.hashCode()) * 31, this.b, 31);
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
