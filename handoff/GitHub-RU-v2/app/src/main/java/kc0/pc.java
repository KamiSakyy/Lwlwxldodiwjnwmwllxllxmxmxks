package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pc {
    public final mc a;
    public final String b;
    public final String c;

    public pc(mc mcVar, String str, String str2) {
        this.a = mcVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        return k71.k.b(this.a, pcVar.a) && k71.k.b(this.b, pcVar.b) && k71.k.b(this.c, pcVar.c);
    }

    public final int hashCode() {
        mc mcVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((mcVar == null ? 0 : mcVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(diff=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
