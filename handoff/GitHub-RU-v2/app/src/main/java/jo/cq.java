package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cq implements aa.v0 {
    public final eq a;
    public final String b;
    public final String c;

    public cq(eq eqVar, String str, String str2) {
        this.a = eqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return k71.k.b(this.a, cqVar.a) && k71.k.b(this.b, cqVar.b) && k71.k.b(this.c, cqVar.c);
    }

    public final int hashCode() {
        eq eqVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((eqVar == null ? 0 : eqVar.hashCode()) * 31, this.b, 31);
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
