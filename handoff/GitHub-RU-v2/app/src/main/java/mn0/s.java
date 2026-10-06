package mn0;

/* loaded from: /home/user/work/p/classes4.dex */
public class s {
    public b0 a;
    public int b;
    public String c;
    public String d;

    public s(b0 b0Var, int i, String str, String str2) {
        this.a = b0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && this.b == sVar.b && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest1(repository=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
