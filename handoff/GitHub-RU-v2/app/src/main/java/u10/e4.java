package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 {
    public String a;
    public String b;
    public hc0.uu c;
    public String d;
    public String e;
    public String f;
    public boolean g;

    public e4(String str, String str2, hc0.uu uuVar, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = uuVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return k71.k.b(this.a, e4Var.a) && k71.k.b(this.b, e4Var.b) && this.c == e4Var.c && k71.k.b(this.d, e4Var.d) && k71.k.b(this.e, e4Var.e) && k71.k.b(this.f, e4Var.f) && this.g == e4Var.g;
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
        return jo.f4.s(o, this.g, ")");
    }

    public Object e;
}
