package dl0;

import com.github.rudroid.copilot.h1;
import oj0.p2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final String a;
    public final String b;
    public final p2 c;

    public i(String str, String str2, p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
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
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryNodeFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
