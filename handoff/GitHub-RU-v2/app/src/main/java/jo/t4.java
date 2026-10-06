package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t4 {
    public final String a;
    public final String b;
    public final m10.da0 c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public t4(String str, String str2, m10.da0 da0Var, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = da0Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && this.c == t4Var.c && k71.k.b(this.d, t4Var.d) && k71.k.b(this.e, t4Var.e) && k71.k.b(this.f, t4Var.f) && this.g == t4Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnStatusContext(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", avatarUrl=");
        o.append(this.d);
        o.append(", description=");
        f1.e.x(o, this.e, ", targetUrl=", this.f, ", isRequired=");
        return f4.s(o, this.g, ")");
    }

    public Object e;
}
