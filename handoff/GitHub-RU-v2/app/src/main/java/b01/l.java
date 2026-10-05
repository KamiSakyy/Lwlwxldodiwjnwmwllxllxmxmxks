package b01;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public l(int i, String str, String str2, boolean z) {
        k71.k.g(str, "id");
        k71.k.g(str2, "option");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public static l a(l lVar, boolean z, int i) {
        String str = lVar.a;
        String str2 = lVar.b;
        k71.k.g(str, "id");
        k71.k.g(str2, "option");
        return new l(i, str, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionPollOption(id=", this.a, ", option=", this.b, ", viewerHasVoted=");
        o.append(this.c);
        o.append(", totalVoteCount=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
