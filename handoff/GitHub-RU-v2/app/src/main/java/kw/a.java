package kw;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final eq.g g;

    public a(eq.g gVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && this.e == aVar.e && k.b(this.f, aVar.f) && k.b(this.g, aVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + h1.i(x.i.e(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnBot(__typename=", this.a, ", id=", this.b, ", login=");
        f1.e.x(o, this.c, ", displayName=", this.d, ", isCopilot=");
        m0.z(o, this.e, ", url=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
