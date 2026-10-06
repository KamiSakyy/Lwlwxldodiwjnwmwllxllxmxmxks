package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qg0 {
    public final og0 a;
    public final String b;
    public final String c;

    public qg0(og0 og0Var, String str, String str2) {
        this.a = og0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg0)) {
            return false;
        }
        qg0 qg0Var = (qg0) obj;
        return k71.k.b(this.a, qg0Var.a) && k71.k.b(this.b, qg0Var.b) && k71.k.b(this.c, qg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
