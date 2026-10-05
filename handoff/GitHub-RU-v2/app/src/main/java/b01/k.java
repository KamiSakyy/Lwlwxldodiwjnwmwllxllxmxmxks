package b01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final List f;

    public k(String str, String str2, boolean z, int i, boolean z2, List list) {
        k71.k.g(str, "id");
        k71.k.g(str2, "question");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && this.e == kVar.e && k71.k.b(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x.i.e(s0.b(this.d, x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionPoll(id=", this.a, ", question=", this.b, ", viewerHasVoted=");
        m0.y(o, this.c, ", totalVoteCount=", this.d, ", viewerCanVote=");
        o.append(this.e);
        o.append(", options=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
