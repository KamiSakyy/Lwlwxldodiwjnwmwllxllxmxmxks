package io0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public String a;
    public String b;
    public ar0.k c;

    public l(String str, String str2, ar0.k kVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionClosedStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
