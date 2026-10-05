package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 extends sy.s {
    public final String a;
    public final String b;
    public final Boolean c;

    public j2(Boolean bool, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && k71.k.b(this.b, j2Var.b) && k71.k.b(this.c, j2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserInputCompletion(requestId=", this.a, ", answer=", this.b, ", wasFreeform=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
