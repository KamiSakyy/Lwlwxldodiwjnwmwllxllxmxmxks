package vz;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public final String a;
    public final String b;
    public final n c;

    public m(String str, String str2, n nVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        n nVar = this.c;
        return i + (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2View=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
