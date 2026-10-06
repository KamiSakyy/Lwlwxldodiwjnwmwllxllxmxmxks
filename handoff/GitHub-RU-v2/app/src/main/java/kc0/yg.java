package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yg {
    public String a;
    public String b;
    public String c;
    public String d;

    public yg(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj;
        return k71.k.b(this.a, ygVar.a) && k71.k.b(this.b, ygVar.b) && k71.k.b(this.c, ygVar.c) && k71.k.b(this.d, ygVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("ProgrammingLanguage(name=", this.a, ", color=", this.b, ", id="), this.c, ", __typename=", this.d, ")");
    }
}
