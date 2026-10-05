package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qg {
    public final int a;
    public final rg b;
    public final String c;
    public final String d;

    public qg(int i, rg rgVar, String str, String str2) {
        this.a = i;
        this.b = rgVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return this.a == qgVar.a && k71.k.b(this.b, qgVar.b) && k71.k.b(this.c, qgVar.c) && k71.k.b(this.d, qgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(number=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
