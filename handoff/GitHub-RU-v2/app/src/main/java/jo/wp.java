package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wp implements aaShadow.v0 {
    public final yp a;
    public final String b;
    public final String c;

    public wp(yp ypVar, String str, String str2) {
        this.a = ypVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return k71.k.b(this.a, wpVar.a) && k71.k.b(this.b, wpVar.b) && k71.k.b(this.c, wpVar.c);
    }

    public final int hashCode() {
        yp ypVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ypVar == null ? 0 : ypVar.hashCode()) * 31, this.b, 31);
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
