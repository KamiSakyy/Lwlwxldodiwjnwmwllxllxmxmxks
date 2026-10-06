package hp;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public String b;
    public c c;

    public k(String str, String str2, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", agentPullRequestResourceFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
