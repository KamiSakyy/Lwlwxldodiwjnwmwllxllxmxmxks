package bw;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;
    public e b;
    public vx.a c;

    public f(String str, e eVar, vx.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = eVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryOwner(__typename=");
        sb.append(this.a);
        sb.append(", repositories=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
