package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ei0 implements aaShadow.v0 {
    public final fi0 a;
    public final String b;
    public final String c;

    public ei0(fi0 fi0Var, String str, String str2) {
        this.a = fi0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return k71.k.b(this.a, ei0Var.a) && k71.k.b(this.b, ei0Var.b) && k71.k.b(this.c, ei0Var.c);
    }

    public final int hashCode() {
        fi0 fi0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fi0Var == null ? 0 : fi0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
