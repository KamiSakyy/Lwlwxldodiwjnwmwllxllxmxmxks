package qe0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public String a;
    public String b;
    public i c;
    public String d;

    public j(String str, String str2, i iVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository1(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
