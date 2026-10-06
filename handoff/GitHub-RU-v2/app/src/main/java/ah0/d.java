package ah0;

import com.github.rudroid.copilot.h1;
import gn0.jr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final jr b;
    public final String c;

    public d(String str, jr jrVar, String str2) {
        this.a = str;
        this.b = jrVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jr jrVar = this.b;
        return this.c.hashCode() + ((hashCode + (jrVar == null ? 0 : jrVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
