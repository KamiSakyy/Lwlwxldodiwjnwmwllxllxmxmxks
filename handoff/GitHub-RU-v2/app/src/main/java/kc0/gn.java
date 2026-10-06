package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gn {
    public final String a;
    public final String b;
    public final String c;

    public gn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return k71.k.b(this.a, gnVar.a) && k71.k.b(this.b, gnVar.b) && k71.k.b(this.c, gnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Category(name=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
