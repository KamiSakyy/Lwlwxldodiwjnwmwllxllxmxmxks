package tu;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final eq.g g;

    public s(eq.g gVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d) && k71.k.b(this.e, sVar.e) && this.f == sVar.f && k71.k.b(this.g, sVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int i2 = h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
        String str2 = this.e;
        return this.g.hashCode() + x.i.e((i2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder o = s0.o("OrganizationListItemFragment(__typename=", this.a, ", id=", this.b, ", descriptionHTML=");
        f1.e.x(o, this.c, ", login=", this.d, ", name=");
        m0.x(o, this.e, ", viewerIsFollowing=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
