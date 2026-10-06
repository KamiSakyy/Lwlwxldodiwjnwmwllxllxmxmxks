package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dg implements aaShadow.v0 {
    public final eg a;
    public final String b;
    public final String c;

    public dg(eg egVar, String str, String str2) {
        this.a = egVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return k71.k.b(this.a, dgVar.a) && k71.k.b(this.b, dgVar.b) && k71.k.b(this.c, dgVar.c);
    }

    public final int hashCode() {
        eg egVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((egVar == null ? 0 : egVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
