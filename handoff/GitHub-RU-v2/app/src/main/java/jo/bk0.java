package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bk0 implements aaShadow.v0 {
    public fk0 a;
    public String b;
    public String c;

    public bk0(fk0 fk0Var, String str, String str2) {
        this.a = fk0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return k71.k.b(this.a, bk0Var.a) && k71.k.b(this.b, bk0Var.b) && k71.k.b(this.c, bk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
