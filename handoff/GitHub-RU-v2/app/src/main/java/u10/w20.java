package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w20 {
    public final int a;
    public final x20 b;
    public final String c;
    public final String d;

    public w20(int i, x20 x20Var, String str, String str2) {
        this.a = i;
        this.b = x20Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w20)) {
            return false;
        }
        w20 w20Var = (w20) obj;
        return this.a == w20Var.a && k71.k.b(this.b, w20Var.b) && k71.k.b(this.c, w20Var.c) && k71.k.b(this.d, w20Var.d);
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
