package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e30 implements aaShadow.v0 {
    public final i30 a;
    public final String b;
    public final String c;

    public e30(i30 i30Var, String str, String str2) {
        this.a = i30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return k71.k.b(this.a, e30Var.a) && k71.k.b(this.b, e30Var.b) && k71.k.b(this.c, e30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(search=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
