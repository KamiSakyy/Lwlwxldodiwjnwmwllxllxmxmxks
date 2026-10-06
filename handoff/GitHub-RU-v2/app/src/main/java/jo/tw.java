package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tw implements aaShadow.v0 {
    public final vw a;
    public final String b;
    public final String c;

    public tw(vw vwVar, String str, String str2) {
        this.a = vwVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return k71.k.b(this.a, twVar.a) && k71.k.b(this.b, twVar.b) && k71.k.b(this.c, twVar.c);
    }

    public final int hashCode() {
        vw vwVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((vwVar == null ? 0 : vwVar.hashCode()) * 31, this.b, 31);
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
