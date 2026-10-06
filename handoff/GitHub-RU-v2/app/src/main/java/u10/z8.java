package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z8 {
    public final x8 a;
    public final String b;
    public final String c;
    public final String d;

    public z8(x8 x8Var, String str, String str2, String str3) {
        this.a = x8Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) obj;
        return k71.k.b(this.a, z8Var.a) && k71.k.b(this.b, z8Var.b) && k71.k.b(this.c, z8Var.c) && k71.k.b(this.d, z8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
