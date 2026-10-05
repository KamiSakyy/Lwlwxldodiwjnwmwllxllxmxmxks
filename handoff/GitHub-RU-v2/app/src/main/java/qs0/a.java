package qs0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final cp0.g e;

    public a(String str, String str2, boolean z, String str3, cp0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c && k.b(this.d, aVar.d) && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnBot(__typename=", this.a, ", login=", this.b, ", isCopilot=");
        m0.z(o, this.c, ", id=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
