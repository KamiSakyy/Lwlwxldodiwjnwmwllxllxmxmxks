package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ok {
    public final int a;
    public final pk b;
    public final String c;
    public final String d;

    public ok(int i, pk pkVar, String str, String str2) {
        this.a = i;
        this.b = pkVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return this.a == okVar.a && k71.k.b(this.b, okVar.b) && k71.k.b(this.c, okVar.c) && k71.k.b(this.d, okVar.d);
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
