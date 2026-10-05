package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ux implements aa.v0 {
    public final fy a;
    public final String b;
    public final String c;

    public ux(fy fyVar, String str, String str2) {
        this.a = fyVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return k71.k.b(this.a, uxVar.a) && k71.k.b(this.b, uxVar.b) && k71.k.b(this.c, uxVar.c);
    }

    public final int hashCode() {
        fy fyVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((fyVar == null ? 0 : fyVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
