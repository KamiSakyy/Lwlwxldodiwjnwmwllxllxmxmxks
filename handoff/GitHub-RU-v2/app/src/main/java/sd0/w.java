package sd0;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public String a;
    public y b;
    public bl0.a c;

    public w(String str, y yVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = yVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y yVar = this.b;
        int hashCode2 = (hashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.q(sb, this.c, ")");
    }
}
