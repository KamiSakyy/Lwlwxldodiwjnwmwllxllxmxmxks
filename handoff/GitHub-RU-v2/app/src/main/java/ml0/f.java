package ml0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public String a;
    public g b;
    public String c;

    public f(String str, g gVar, String str2) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        return this.c.hashCode() + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeQueueEntry(id=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
