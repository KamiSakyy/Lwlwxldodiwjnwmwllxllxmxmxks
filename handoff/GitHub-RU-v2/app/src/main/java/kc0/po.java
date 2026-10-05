package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class po {
    public final String a;
    public final String b;
    public final String c;

    public po(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return k71.k.b(this.a, poVar.a) && k71.k.b(this.b, poVar.b) && k71.k.b(this.c, poVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("ResolvedBy1(login=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
