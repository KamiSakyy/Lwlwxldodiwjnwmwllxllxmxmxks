package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qf0 implements aaShadow.v0 {
    public rf0 a;
    public String b;
    public String c;

    public qf0(rf0 rf0Var, String str, String str2) {
        this.a = rf0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return k71.k.b(this.a, qf0Var.a) && k71.k.b(this.b, qf0Var.b) && k71.k.b(this.c, qf0Var.c);
    }

    public final int hashCode() {
        rf0 rf0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((rf0Var == null ? 0 : rf0Var.hashCode()) * 31, this.b, 31);
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
