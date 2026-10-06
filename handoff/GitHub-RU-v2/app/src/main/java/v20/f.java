package v20;

import a0.s0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;
    public int b;
    public a c;
    public String d;

    public f(String str, int i, a aVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && this.b == fVar.b && k.b(this.c, fVar.c) && k.b(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "Repository(id=", this.a, ", planLimit=", ", assignableUsers=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
