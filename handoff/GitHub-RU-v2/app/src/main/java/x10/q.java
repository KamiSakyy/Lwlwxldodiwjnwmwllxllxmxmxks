package x10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public f0 b;
    public String c;

    public q(String str, f0 f0Var, String str2) {
        this.a = str;
        this.b = f0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTeamDiscussion(url=");
        sb.append(this.a);
        sb.append(", team=");
        sb.append(this.b);
        sb.append(", id=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
