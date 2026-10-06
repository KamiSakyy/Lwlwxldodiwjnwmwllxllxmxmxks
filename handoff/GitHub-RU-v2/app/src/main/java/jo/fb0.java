package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fb0 {
    public final int a;
    public final gb0 b;
    public final String c;
    public final String d;

    public fb0(int i, gb0 gb0Var, String str, String str2) {
        this.a = i;
        this.b = gb0Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        return this.a == fb0Var.a && k71.k.b(this.b, fb0Var.b) && k71.k.b(this.c, fb0Var.c) && k71.k.b(this.d, fb0Var.d);
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
