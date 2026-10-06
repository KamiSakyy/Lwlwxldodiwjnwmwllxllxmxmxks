package d00;

import a0.s0;
import com.github.rudroid.copilot.h1;
import f00.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public class s {
    public String a;
    public String b;
    public x0 c;

    public s(String str, String str2, x0 x0Var) {
        this.a = str;
        this.b = str2;
        this.c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", projectV2ViewFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
