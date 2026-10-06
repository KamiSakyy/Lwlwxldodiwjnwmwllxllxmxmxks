package ib0;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final String a;
    public final d b;
    public final String c;

    public f(String str, d dVar, String str2) {
        this.a = str;
        this.b = dVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        return this.c.hashCode() + ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
