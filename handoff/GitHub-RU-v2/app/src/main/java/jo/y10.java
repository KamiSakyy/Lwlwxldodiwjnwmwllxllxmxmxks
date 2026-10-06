package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y10 {
    public String a;
    public w10 b;
    public x10 c;
    public String d;

    public y10(String str, w10 w10Var, x10 x10Var, String str2) {
        this.a = str;
        this.b = w10Var;
        this.c = x10Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y10)) {
            return false;
        }
        y10 y10Var = (y10) obj;
        return k71.k.b(this.a, y10Var.a) && k71.k.b(this.b, y10Var.b) && k71.k.b(this.c, y10Var.c) && k71.k.b(this.d, y10Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w10 w10Var = this.b;
        int hashCode2 = (hashCode + (w10Var == null ? 0 : w10Var.hashCode())) * 31;
        x10 x10Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (x10Var != null ? x10Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", gitObject=" + this.b + ", ref=" + this.c + ", __typename=" + this.d + ")";
    }
}
