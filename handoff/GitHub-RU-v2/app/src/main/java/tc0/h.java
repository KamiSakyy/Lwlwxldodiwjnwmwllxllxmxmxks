package tc0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public String b;
    public i c;

    public h(String str, String str2, i iVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        i iVar = this.c;
        return i + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
