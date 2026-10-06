package cc0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public String a;
    public b b;
    public String c;

    public g(String str, b bVar, String str2) {
        this.a = str;
        this.b = bVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
