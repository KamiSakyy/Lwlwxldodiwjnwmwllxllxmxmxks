package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public y2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.a, y2Var.a) && k71.k.b(this.b, y2Var.b) && k71.k.b(this.c, y2Var.c) && k71.k.b(this.d, y2Var.d) && k71.k.b(this.e, y2Var.e) && k71.k.b(this.f, y2Var.f) && k71.k.b(this.g, y2Var.g) && k71.k.b(this.h, y2Var.h) && k71.k.b(this.i, y2Var.i) && this.j == y2Var.j;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return Boolean.hashCode(this.j) + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PermissionRequestInfo(requestId=", this.a, ", promptId=", this.b, ", kind=");
        f1.e.x(o, this.c, ", intention=", this.d, ", command=");
        f1.e.x(o, this.e, ", filePath=", this.f, ", fileName=");
        f1.e.x(o, this.g, ", diff=", this.h, ", toolName=");
        return com.github.rudroid.m0.k(o, this.i, ", canOfferSessionApproval=", this.j, ")");
    }
}
