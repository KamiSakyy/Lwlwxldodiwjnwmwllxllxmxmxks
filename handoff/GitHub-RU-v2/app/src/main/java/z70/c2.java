package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 {
    public String a;
    public k2 b;
    public String c;

    public c2(String str, k2 k2Var, String str2) {
        this.a = str;
        this.b = k2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b) && k71.k.b(this.c, c2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k2 k2Var = this.b;
        return this.c.hashCode() + ((hashCode + (k2Var == null ? 0 : k2Var.hashCode())) * 31);
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
