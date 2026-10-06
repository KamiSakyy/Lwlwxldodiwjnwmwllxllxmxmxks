package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pp implements aaShadow.v0 {
    public sp a;
    public String b;
    public String c;

    public pp(sp spVar, String str, String str2) {
        this.a = spVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return k71.k.b(this.a, ppVar.a) && k71.k.b(this.b, ppVar.b) && k71.k.b(this.c, ppVar.c);
    }

    public final int hashCode() {
        sp spVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((spVar == null ? 0 : spVar.hashCode()) * 31, this.b, 31);
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
