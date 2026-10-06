package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rs {
    public String a;
    public String b;
    public String c;
    public String d;

    public rs(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs)) {
            return false;
        }
        rs rsVar = (rs) obj;
        return k71.k.b(this.a, rsVar.a) && k71.k.b(this.b, rsVar.b) && k71.k.b(this.c, rsVar.c) && k71.k.b(this.d, rsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("TagCommit(id=", this.a, ", oid=", this.b, ", abbreviatedOid="), this.c, ", __typename=", this.d, ")");
    }
}
