package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 {
    public String a;
    public y2 b;
    public String c;

    public o2(String str, y2 y2Var, String str2) {
        this.a = str;
        this.b = y2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return k71.k.b(this.a, o2Var.a) && k71.k.b(this.b, o2Var.b) && k71.k.b(this.c, o2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y2 y2Var = this.b;
        return this.c.hashCode() + ((hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31);
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
