package gt;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import m10.mj;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final mj e;
    public final String f;

    public a(String str, String str2, String str3, boolean z, mj mjVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = mjVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && k.b(this.f, aVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + i.e((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueTypeFragment(id=", this.a, ", name=", this.b, ", description=");
        m0.x(o, this.c, ", isEnabled=", this.d, ", color=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
