package fb0;

import hc0.ev;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public final String a;
    public final ev b;
    public final ja0.a c;

    public v(String str, ev evVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = evVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && this.b == vVar.b && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ev evVar = this.b;
        int hashCode2 = (hashCode + (evVar == null ? 0 : evVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSubscribable(__typename=");
        sb.append(this.a);
        sb.append(", viewerSubscription=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
