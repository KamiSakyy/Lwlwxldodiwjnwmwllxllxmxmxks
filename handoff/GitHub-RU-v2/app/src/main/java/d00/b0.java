package d00;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public String a;
    public String b;
    public f00.e c;

    public b0(String str, String str2, f00.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Item(__typename=", this.a, ", id=", this.b, ", projectV2BoardItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
