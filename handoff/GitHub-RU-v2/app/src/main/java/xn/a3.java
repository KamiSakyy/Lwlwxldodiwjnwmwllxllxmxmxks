package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a3 {
    public final e1 a;
    public final c3 b;
    public final String c;
    public final String d;

    public a3(e1 e1Var, c3 c3Var, String str, String str2) {
        this.a = e1Var;
        this.b = c3Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && this.b == a3Var.b && k71.k.b(this.c, a3Var.c) && k71.k.b(this.d, a3Var.d);
    }

    public final int hashCode() {
        e1 e1Var = this.a;
        int hashCode = (this.b.hashCode() + ((e1Var == null ? 0 : e1Var.hashCode()) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlanRow(copilotLicenseType=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", planTitle=");
        return x.i.k(sb, this.c, ", subtitle=", this.d, ")");
    }
}
