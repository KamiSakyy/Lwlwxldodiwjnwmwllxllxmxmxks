package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public Avatar h;
    public boolean i;
    public boolean j;
    public boolean k;

    public s(String str, String str2, String str3, String str4, String str5, int i, int i2, Avatar avatar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = avatar;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d) && k71.k.b(this.e, sVar.e) && this.f == sVar.f && this.g == sVar.g && k71.k.b(this.h, sVar.h) && this.i == sVar.i && this.j == sVar.j && this.k == sVar.k;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = h1.i(h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
        String str2 = this.e;
        return Boolean.hashCode(this.k) + x.i.e(x.i.e(h1.j(this.h, s0.b(this.g, s0.b(this.f, (i + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder o = s0.o("RecommendedUser(id=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", url=", this.d, ", bio=");
        s0.w(this.f, this.e, ", repositoriesCount=", ", followerCount=", o);
        o.append(this.g);
        o.append(", avatar=");
        o.append(this.h);
        o.append(", viewerIsFollowing=");
        m0.A(o, this.i, ", isViewer=", this.j, ", isPrivate=");
        return f4.s(o, this.k, ")");
    }
}
