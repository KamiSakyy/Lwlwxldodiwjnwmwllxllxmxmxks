package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public String b;
    public String c;
    public String d;
    public Integer e;

    public g(Integer num, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnLineComment(__typename=", this.a, ", baseCommitOid=", this.b, ", headCommitOid=");
        f1.e.x(o, this.c, ", commitOid=", this.d, ", line=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
