package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public long a;
    public String b;
    public String c;
    public String d;

    public c(long j, String str, String str2, String str3) {
        k71.k.g(str, "agentTaskId");
        k71.k.g(str2, "agentType");
        k71.k.g(str3, "slug");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentTaskCollaborator(agentId=");
        sb.append(this.a);
        sb.append(", agentTaskId=");
        sb.append(this.b);
        f1.e.x(sb, ", agentType=", this.c, ", slug=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
