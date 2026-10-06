package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l30 {
    public final i30 a;
    public final String b;
    public final String c;

    public l30(i30 i30Var, String str, String str2) {
        this.a = i30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return k71.k.b(this.a, l30Var.a) && k71.k.b(this.b, l30Var.b) && k71.k.b(this.c, l30Var.c);
    }

    public final int hashCode() {
        i30 i30Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((i30Var == null ? 0 : i30Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(milestones=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
