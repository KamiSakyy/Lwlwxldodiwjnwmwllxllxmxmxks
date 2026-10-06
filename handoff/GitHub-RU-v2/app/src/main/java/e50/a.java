package e50;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public c b;
    public String c;

    public a(String str, c cVar, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = cVar;
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
        c cVar = this.b;
        return this.c.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Answer(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
    public Object O(Object p1) { return null; }
}
