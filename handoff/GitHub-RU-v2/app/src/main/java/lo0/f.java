package lo0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public String a;
    public String b;
    public g c;

    public f(String str, String str2, g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gVar;
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
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        g gVar = this.c;
        return i + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDraftIssue=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
