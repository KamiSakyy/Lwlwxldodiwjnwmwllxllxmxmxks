package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bd0 {
    public final String a;
    public final cd0 b;
    public final String c;

    public bd0(String str, cd0 cd0Var, String str2) {
        this.a = str;
        this.b = cd0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd0)) {
            return false;
        }
        bd0 bd0Var = (bd0) obj;
        return k71.k.b(this.a, bd0Var.a) && k71.k.b(this.b, bd0Var.b) && k71.k.b(this.c, bd0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cd0 cd0Var = this.b;
        return this.c.hashCode() + ((hashCode + (cd0Var == null ? 0 : cd0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Issue(id=");
        sb.append(this.a);
        sb.append(", issueType=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
