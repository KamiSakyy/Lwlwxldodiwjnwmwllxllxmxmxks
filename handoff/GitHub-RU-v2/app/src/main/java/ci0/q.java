package ci0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public ud0.c g;

    public q(String str, String str2, String str3, String str4, String str5, boolean z, ud0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && k71.k.b(this.d, qVar.d) && k71.k.b(this.e, qVar.e) && this.f == qVar.f && k71.k.b(this.g, qVar.g);
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
