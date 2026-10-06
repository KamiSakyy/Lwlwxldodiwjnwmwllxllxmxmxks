package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.v0 {
    public final n a;
    public final String b;
    public final String c;

    public m(n nVar, String str, String str2) {
        this.a = nVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c);
    }

    public final int hashCode() {
        n nVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nVar == null ? 0 : nVar.hashCode()) * 31, this.b, 31);
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
