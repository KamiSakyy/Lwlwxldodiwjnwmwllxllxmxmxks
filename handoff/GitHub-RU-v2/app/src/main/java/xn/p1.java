package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p1 extends sy.rShadow {
    public e4 a;
    public Integer b;
    public Integer c;
    public String d;

    public p1(e4 e4Var, Integer num, Integer num2, String str) {
        this.a = e4Var;
        this.b = num;
        this.c = num2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.a == p1Var.a && k71.k.b(this.b, p1Var.b) && k71.k.b(this.c, p1Var.c) && k71.k.b(this.d, p1Var.d);
    }

    public final int hashCode() {
        e4 e4Var = this.a;
        int hashCode = (e4Var == null ? 0 : e4Var.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "StringPlain(format=" + this.a + ", minLength=" + this.b + ", maxLength=" + this.c + ", default=" + this.d + ")";
    }
}
