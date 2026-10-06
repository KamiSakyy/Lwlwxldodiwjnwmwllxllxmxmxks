package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 {
    public String a;
    public String b;
    public String c;
    public String d;

    public t2(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return k71.k.b(this.a, t2Var.a) && k71.k.b(this.b, t2Var.b) && k71.k.b(this.c, t2Var.c) && k71.k.b(this.d, t2Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("PageLinks(first=", this.a, ", prev=", this.b, ", next="), this.c, ", last=", this.d, ")");
    }
}
