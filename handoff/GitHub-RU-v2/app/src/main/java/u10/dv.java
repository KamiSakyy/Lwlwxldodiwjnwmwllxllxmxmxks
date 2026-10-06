package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dv {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public dv(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return k71.k.b(this.a, dvVar.a) && k71.k.b(this.b, dvVar.b) && k71.k.b(this.c, dvVar.c) && k71.k.b(this.d, dvVar.d) && k71.k.b(this.e, dvVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", color=", this.b, ", name=");
        f1.e.x(o, this.c, ", description=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
