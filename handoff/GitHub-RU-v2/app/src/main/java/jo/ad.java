package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ad implements aaShadow.v0 {
    public bd a;
    public String b;
    public String c;

    public ad(bd bdVar, String str, String str2) {
        this.a = bdVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return k71.k.b(this.a, adVar.a) && k71.k.b(this.b, adVar.b) && k71.k.b(this.c, adVar.c);
    }

    public final int hashCode() {
        bd bdVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((bdVar == null ? 0 : bdVar.hashCode()) * 31, this.b, 31);
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
