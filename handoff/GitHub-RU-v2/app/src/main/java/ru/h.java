package ru;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public String a;
    public String b;
    public tu.a c;

    public h(String str, String str2, tu.a aVar) {
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
