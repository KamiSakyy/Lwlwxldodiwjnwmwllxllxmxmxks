package os;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final h f;
    public final String g;

    public i(String str, String str2, boolean z, int i, boolean z2, h hVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = hVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d && this.e == iVar.e && k71.k.b(this.f, iVar.f) && k71.k.b(this.g, iVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(s0.b(this.d, x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31), 31, this.e);
        h hVar = this.f;
        return this.g.hashCode() + ((e + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionPollFragment(id=", this.a, ", question=", this.b, ", viewerHasVoted=");
        m0.y(o, this.c, ", totalVoteCount=", this.d, ", viewerCanVote=");
        o.append(this.e);
        o.append(", options=");
        o.append(this.f);
        o.append(", __typename=");
        return h1.p(o, this.g, ")");
    }
}
