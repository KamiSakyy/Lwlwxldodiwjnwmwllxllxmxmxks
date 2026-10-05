package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sr implements aa.v0 {
    public final xr a;
    public final String b;
    public final String c;

    public sr(xr xrVar, String str, String str2) {
        this.a = xrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr)) {
            return false;
        }
        sr srVar = (sr) obj;
        return k71.k.b(this.a, srVar.a) && k71.k.b(this.b, srVar.b) && k71.k.b(this.c, srVar.c);
    }

    public final int hashCode() {
        xr xrVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((xrVar == null ? 0 : xrVar.hashCode()) * 31, this.b, 31);
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
