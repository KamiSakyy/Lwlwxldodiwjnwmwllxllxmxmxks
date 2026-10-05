package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e7 {
    public final k7 a;
    public final String b;
    public final String c;

    public e7(k7 k7Var, String str, String str2) {
        this.a = k7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return k71.k.b(this.a, e7Var.a) && k71.k.b(this.b, e7Var.b) && k71.k.b(this.c, e7Var.c);
    }

    public final int hashCode() {
        k7 k7Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((k7Var == null ? 0 : k7Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Commit(statusCheckRollup=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
