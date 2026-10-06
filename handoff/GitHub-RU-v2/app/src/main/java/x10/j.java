package x10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final z a;
    public final int b;
    public final String c;
    public final String d;

    public j(z zVar, int i, String str, String str2) {
        this.a = zVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && this.b == jVar.b && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPullRequest(repository=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", url=");
        return x.i.k(sb, this.c, ", id=", this.d, ")");
    }
}
