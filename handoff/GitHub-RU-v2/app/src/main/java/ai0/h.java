package ai0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final String b;
    public final ci0.a c;

    public h(String str, String str2, ci0.a aVar) {
        k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && k.b(this.b, hVar.b) && k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Organization(__typename=", this.a, ", id=", this.b, ", followOrganizationFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
