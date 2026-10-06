package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g80 {
    public String a;
    public String b;
    public String c;

    public g80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return k71.k.b(this.a, g80Var.a) && k71.k.b(this.b, g80Var.b) && k71.k.b(this.c, g80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("User(mobileTimeZone=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a {
        public a() {
        }
    }
}
