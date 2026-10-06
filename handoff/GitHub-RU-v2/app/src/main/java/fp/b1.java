package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.v0 {
    public final h1 a;
    public final j1 b;
    public final String c;
    public final String d;

    public b1(h1 h1Var, j1 j1Var, String str, String str2) {
        this.a = h1Var;
        this.b = j1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && k71.k.b(this.b, b1Var.b) && k71.k.b(this.c, b1Var.c) && k71.k.b(this.d, b1Var.d);
    }

    public final int hashCode() {
        h1 h1Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((h1Var == null ? 0 : h1Var.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", viewer=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
