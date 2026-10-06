package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public final String a;
    public final String b;
    public final String c;
    public final sy.r d;

    public h1(String str, String str2, String str3, sy.r rVar) {
        k71.k.g(str, "key");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c) && k71.k.b(this.d, h1Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ElicitationField(key=", this.a, ", title=", this.b, ", description=");
        o.append(this.c);
        o.append(", schema=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
