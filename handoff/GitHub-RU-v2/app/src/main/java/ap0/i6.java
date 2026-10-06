package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 {
    public o6 a;
    public String b;
    public String c;

    public i6(o6 o6Var, String str, String str2) {
        this.a = o6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return k71.k.b(this.a, i6Var.a) && k71.k.b(this.b, i6Var.b) && k71.k.b(this.c, i6Var.c);
    }

    public final int hashCode() {
        o6 o6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((o6Var == null ? 0 : o6Var.hashCode()) * 31, this.b, 31);
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
