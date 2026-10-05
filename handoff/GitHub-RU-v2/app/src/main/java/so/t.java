package so;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final String a;
    public final String b;
    public final u c;

    public t(String str, String str2, u uVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        u uVar = this.c;
        return i + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
