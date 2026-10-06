package ml0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public String a;
    public o b;
    public String c;

    public n(String str, o oVar, String str2) {
        this.a = str;
        this.b = oVar;
        this.c = str2;
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
        int hashCode = this.a.hashCode() * 31;
        o oVar = this.b;
        return this.c.hashCode() + ((hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31);
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
