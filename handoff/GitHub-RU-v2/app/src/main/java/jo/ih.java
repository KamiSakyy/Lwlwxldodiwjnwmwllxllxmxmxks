package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ih implements aa.v0 {
    public final nh a;
    public final String b;
    public final String c;

    public ih(nh nhVar, String str, String str2) {
        this.a = nhVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih)) {
            return false;
        }
        ih ihVar = (ih) obj;
        return k71.k.b(this.a, ihVar.a) && k71.k.b(this.b, ihVar.b) && k71.k.b(this.c, ihVar.c);
    }

    public final int hashCode() {
        nh nhVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nhVar == null ? 0 : nhVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
