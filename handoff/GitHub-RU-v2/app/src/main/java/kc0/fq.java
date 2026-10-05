package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fq {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public fq(int i, String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        fq fqVar = (fq) obj;
        return k71.k.b(this.a, fqVar.a) && k71.k.b(this.b, fqVar.b) && this.c == fqVar.c && k71.k.b(this.d, fqVar.d) && k71.k.b(this.e, fqVar.e) && k71.k.b(this.f, fqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", name=", this.b, ", size=");
        x.i.r(this.c, ", url=", this.d, ", contentType=", o);
        return x.i.k(o, this.e, ", __typename=", this.f, ")");
    }
}
