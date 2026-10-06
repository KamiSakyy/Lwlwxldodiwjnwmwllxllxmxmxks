package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 extends sy.s {
    public final String a;
    public final Boolean b;
    public final String c;
    public final String d;

    public f2(String str, Boolean bool, String str2, String str3) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return k71.k.b(this.a, f2Var.a) && k71.k.b(this.b, f2Var.b) && k71.k.b(this.c, f2Var.c) && k71.k.b(this.d, f2Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExitPlanModeCompletion(requestId=");
        sb.append(this.a);
        sb.append(", approved=");
        sb.append(this.b);
        sb.append(", selectedAction=");
        return x.i.k(sb, this.c, ", feedback=", this.d, ")");
    }
}
