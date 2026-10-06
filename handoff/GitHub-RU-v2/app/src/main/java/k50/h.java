package k50;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements h0 {
    public String a;
    public String b;
    public boolean c;
    public int d;
    public boolean e;
    public g f;
    public String g;

    public h(String str, String str2, boolean z, int i, boolean z2, g gVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = gVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && k71.k.b(this.f, hVar.f) && k71.k.b(this.g, hVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(s0.b(this.d, x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31), 31, this.e);
        g gVar = this.f;
        return this.g.hashCode() + ((e + (gVar == null ? 0 : gVar.hashCode())) * 31);
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
