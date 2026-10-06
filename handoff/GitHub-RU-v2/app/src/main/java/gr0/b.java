package gr0;

import aa.h0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements h0 {
    public final String a;
    public final a b;
    public final String c;

    public b(String str, a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return this.c.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionPollForDiscussionFragment(id=");
        sb.append(this.a);
        sb.append(", poll=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
