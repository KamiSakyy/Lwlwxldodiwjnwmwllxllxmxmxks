package c80;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h0 {
    public String a;
    public String b;
    public b c;

    public d(String str, String str2, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequestCommitFields(__typename=", this.a, ", id=", this.b, ", pullRequestCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
