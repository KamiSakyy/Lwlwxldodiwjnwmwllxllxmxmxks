package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pl {
    public String a;
    public String b;
    public String c;
    public String d;

    public pl(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return k71.k.b(this.a, plVar.a) && k71.k.b(this.b, plVar.b) && k71.k.b(this.c, plVar.c) && k71.k.b(this.d, plVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x.i.k(a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", name="), this.c, ", avatarUrl=", this.d, ")");
    }
}
