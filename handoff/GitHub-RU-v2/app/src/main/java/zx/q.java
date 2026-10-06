package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.v0 {
    public s a;
    public r b;
    public String c;
    public String d;

    public q(s sVar, r rVar, String str, String str2) {
        this.a = sVar;
        this.b = rVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && k71.k.b(this.d, qVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r rVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
