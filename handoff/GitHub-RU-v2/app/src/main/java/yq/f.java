package yq;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final b d;
    public final k e;

    public f(String str, String str2, String str3, b bVar, k kVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && k71.k.b(this.d, fVar.d) && k71.k.b(this.e, fVar.e);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        b bVar = this.d;
        return this.e.hashCode() + ((i + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnCommit(abbreviatedOid=", this.a, ", id=", this.b, ", messageHeadline=");
        o.append(this.c);
        o.append(", author=");
        o.append(this.d);
        o.append(", repository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
