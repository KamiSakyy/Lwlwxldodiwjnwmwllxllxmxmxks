package i50;

import aa.h0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements h0 {
    public final String a;
    public final m b;
    public final String c;

    public n(String str, m mVar, String str2) {
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = mVar;
        this.c = str2;
    }

    public static n a(n nVar, m mVar) {
        String str = nVar.a;
        String str2 = nVar.c;
        k71.k.g(str2, "__typename");
        return new n(str, mVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionCommentRepliesFragment(id=");
        sb.append(this.a);
        sb.append(", replies=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
