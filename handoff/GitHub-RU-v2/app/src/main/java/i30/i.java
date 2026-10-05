package i30;

import aa.h0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements h0 {
    public final String a;
    public final g b;
    public final ja0.a c;

    public i(String str, g gVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ja0.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssigneeFragment(__typename=");
        sb.append(this.a);
        sb.append(", assignees=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
