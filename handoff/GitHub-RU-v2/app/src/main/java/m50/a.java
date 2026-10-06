package m50;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;

    public a(int i, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + s0.b(this.d, i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionPollOptionFragment(id=", this.a, ", option=", this.b, ", viewerHasVoted=");
        m0.y(o, this.c, ", totalVoteCount=", this.d, ", __typename=");
        return h1.p(o, this.e, ")");
    }
}
