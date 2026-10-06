package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hs {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public hs(int i, String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return k71.k.b(this.a, hsVar.a) && k71.k.b(this.b, hsVar.b) && this.c == hsVar.c && k71.k.b(this.d, hsVar.d) && k71.k.b(this.e, hsVar.e) && k71.k.b(this.f, hsVar.f);
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
