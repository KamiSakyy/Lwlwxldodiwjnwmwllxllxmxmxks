package zm0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final f b;
    public final String c;

    public a(String str, f fVar, String str2) {
        this.a = str;
        this.b = fVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        return this.c.hashCode() + ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(id=");
        sb.append(this.a);
        sb.append(", matchingPullRequests=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
