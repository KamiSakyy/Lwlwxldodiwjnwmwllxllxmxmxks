package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 {
    public final String a;
    public final Long b;
    public final Integer c;
    public final g3 d;
    public final String e;

    public l3(String str, Long l, Integer num, g3 g3Var, String str2) {
        this.a = str;
        this.b = l;
        this.c = num;
        this.d = g3Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return k71.k.b(this.a, l3Var.a) && k71.k.b(this.b, l3Var.b) && k71.k.b(this.c, l3Var.c) && this.d == l3Var.d && k71.k.b(this.e, l3Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        g3 g3Var = this.d;
        int hashCode4 = (hashCode3 + (g3Var == null ? 0 : g3Var.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionResource(globalId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", number=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", type=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
