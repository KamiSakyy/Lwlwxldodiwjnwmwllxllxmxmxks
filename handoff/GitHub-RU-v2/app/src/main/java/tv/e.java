package tv;

import com.github.rudroid.copilot.h1;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final da0 b;
    public final String c;

    public e(String str, String str2, da0 da0Var) {
        this.a = str;
        this.b = da0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && this.b == eVar.b && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", id=");
        return h1.p(sb, this.c, ")");
    }
}
