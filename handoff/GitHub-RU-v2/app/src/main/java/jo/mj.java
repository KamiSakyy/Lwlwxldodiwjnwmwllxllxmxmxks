package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mj {
    public String a;
    public String b;
    public String c;
    public String d;

    public mj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return k71.k.b(this.a, mjVar.a) && k71.k.b(this.b, mjVar.b) && k71.k.b(this.c, mjVar.c) && k71.k.b(this.d, mjVar.d);
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
