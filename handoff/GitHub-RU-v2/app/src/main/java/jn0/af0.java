package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class af0 implements aaShadow.v0 {
    public bf0 a;
    public String b;
    public String c;

    public af0(bf0 bf0Var, String str, String str2) {
        this.a = bf0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return k71.k.b(this.a, af0Var.a) && k71.k.b(this.b, af0Var.b) && k71.k.b(this.c, af0Var.c);
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
