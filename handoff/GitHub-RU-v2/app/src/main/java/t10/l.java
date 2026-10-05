package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Avatar f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;

    public l(String str, String str2, String str3, String str4, String str5, Avatar avatar, String str6, boolean z, String str7, boolean z2) {
        k71.k.g(avatar, "ownerAvatar");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = avatar;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && k71.k.b(this.d, lVar.d) && k71.k.b(this.e, lVar.e) && k71.k.b(this.f, lVar.f) && k71.k.b(this.g, lVar.g) && this.h == lVar.h && k71.k.b(this.i, lVar.i) && this.j == lVar.j;
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
        String str = this.e;
        return Boolean.hashCode(this.j) + h1.i(x.i.e(h1.i(h1.j(this.f, (i + (str == null ? 0 : str.hashCode())) * 31, 31), this.g, 31), 31, this.h), this.i, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("FeedRepositoryHeader(id=", this.a, ", name=", this.b, ", url=");
        f1.e.x(o, this.c, ", ownerLogin=", this.d, ", ownerName=");
        o.append(this.e);
        o.append(", ownerAvatar=");
        o.append(this.f);
        o.append(", ownerUrl=");
        m0.x(o, this.g, ", usesCustomOpenGraphImage=", this.h, ", openGraphImageUrl=");
        return m0.k(o, this.i, ", ownerIsOrganization=", this.j, ")");
    }
}
