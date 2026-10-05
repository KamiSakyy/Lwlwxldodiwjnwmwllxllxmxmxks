package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 {
    public final String a;
    public final o2 b;
    public final String c;

    public e2(String str, o2 o2Var, String str2) {
        this.a = str;
        this.b = o2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b) && k71.k.b(this.c, e2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o2 o2Var = this.b;
        return this.c.hashCode() + ((hashCode + (o2Var == null ? 0 : o2Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Commit(id=");
        sb.append(this.a);
        sb.append(", statusCheckRollup=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
