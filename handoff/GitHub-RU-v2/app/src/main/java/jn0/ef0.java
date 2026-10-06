package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ef0 implements aaShadow.v0 {
    public final if0 a;
    public final String b;
    public final String c;

    public ef0(if0 if0Var, String str, String str2) {
        this.a = if0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef0)) {
            return false;
        }
        ef0 ef0Var = (ef0) obj;
        return k71.k.b(this.a, ef0Var.a) && k71.k.b(this.b, ef0Var.b) && k71.k.b(this.c, ef0Var.c);
    }

    public final int hashCode() {
        if0 if0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((if0Var == null ? 0 : if0Var.hashCode()) * 31, this.b, 31);
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
