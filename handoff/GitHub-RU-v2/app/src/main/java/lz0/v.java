package lz0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public final String a;
    public final String b;
    public final String c;
    public final u d;
    public final String e;
    public final String f;

    public v(String str, String str2, String str3, u uVar, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uVar;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d) && k71.k.b(this.e, vVar.e) && k71.k.b(this.f, vVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        u uVar = this.d;
        return this.f.hashCode() + h1.i((i + (uVar != null ? uVar.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Viewer(email=", this.a, ", primaryEmail=", this.b, ", login=");
        o.append(this.c);
        o.append(", mobileAuthStatus=");
        o.append(this.d);
        o.append(", id=");
        return x.i.k(o, this.e, ", __typename=", this.f, ")");
    }
}
