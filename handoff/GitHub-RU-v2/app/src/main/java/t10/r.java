package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Avatar f;
    public boolean g;

    public r(String str, String str2, String str3, String str4, String str5, Avatar avatar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = avatar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && k71.k.b(this.d, rVar.d) && k71.k.b(this.e, rVar.e) && k71.k.b(this.f, rVar.f) && this.g == rVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = h1.i(h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
        String str2 = this.e;
        return Boolean.hashCode(this.g) + h1.j(this.f, (i + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("RecommendedOrganisation(id=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", url=", this.d, ", description=");
        o.append(this.e);
        o.append(", avatar=");
        o.append(this.f);
        o.append(", viewerIsFollowing=");
        return f4.s(o, this.g, ")");
    }
}
