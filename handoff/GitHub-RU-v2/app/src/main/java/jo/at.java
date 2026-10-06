package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class at implements aaShadow.v0 {
    public final ct a;
    public final String b;
    public final String c;

    public at(ct ctVar, String str, String str2) {
        this.a = ctVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return k71.k.b(this.a, atVar.a) && k71.k.b(this.b, atVar.b) && k71.k.b(this.c, atVar.c);
    }

    public final int hashCode() {
        ct ctVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ctVar == null ? 0 : ctVar.hashCode()) * 31, this.b, 31);
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
