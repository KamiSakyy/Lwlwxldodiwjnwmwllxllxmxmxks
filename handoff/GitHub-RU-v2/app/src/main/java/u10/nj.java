package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nj {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public nj(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj)) {
            return false;
        }
        nj njVar = (nj) obj;
        return k71.k.b(this.a, njVar.a) && k71.k.b(this.b, njVar.b) && k71.k.b(this.c, njVar.c) && k71.k.b(this.d, njVar.d) && k71.k.b(this.e, njVar.e) && k71.k.b(this.f, njVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", mergeHeadline=");
        f1.e.x(o, this.c, ", mergeBody=", this.d, ", squashHeadline=");
        return x.i.k(o, this.e, ", squashBody=", this.f, ")");
    }
}
