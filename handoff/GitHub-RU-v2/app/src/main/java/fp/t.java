package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.v0 {
    public w a;
    public String b;
    public String c;

    public t(w wVar, String str, String str2) {
        this.a = wVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c);
    }

    public final int hashCode() {
        w wVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wVar == null ? 0 : wVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryAgentTasks=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
