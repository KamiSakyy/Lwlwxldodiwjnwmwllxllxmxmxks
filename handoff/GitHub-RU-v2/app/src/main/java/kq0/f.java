package kq0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final d d;
    public final boolean e;

    public f(String str, String str2, String str3, d dVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c) && k71.k.b(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository1(__typename=", this.a, ", id=", this.b, ", name=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", isPrivate=");
        return f4.s(o, this.e, ")");
    }
}
