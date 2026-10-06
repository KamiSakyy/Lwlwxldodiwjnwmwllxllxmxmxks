package yz0;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public Avatar e;
    public boolean f;
    public boolean g;

    public x0(String str, String str2, String str3, String str4, Avatar avatar, boolean z, boolean z2) {
        k71.k.g(str, "id");
        k71.k.g(str3, "login");
        k71.k.g(str4, "bioHtml");
        k71.k.g(avatar, "avatar");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = avatar;
        this.f = z;
        this.g = z2;
    }

    public static x0 a(x0 x0Var, boolean z, int i) {
        String str = x0Var.a;
        String str2 = x0Var.b;
        String str3 = x0Var.c;
        String str4 = x0Var.d;
        Avatar avatar = x0Var.e;
        if ((i & 32) != 0) {
            z = x0Var.f;
        }
        boolean z2 = z;
        boolean z3 = (i & 64) != 0 ? x0Var.g : false;
        k71.k.g(str, "id");
        k71.k.g(str3, "login");
        k71.k.g(str4, "bioHtml");
        k71.k.g(avatar, "avatar");
        return new x0(str, str2, str3, str4, avatar, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c) && k71.k.b(this.d, x0Var.d) && k71.k.b(this.e, x0Var.e) && this.f == x0Var.f && this.g == x0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + x.i.e(com.github.rudroid.copilot.h1.j(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Contributor(id=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", bioHtml=", this.d, ", avatar=");
        o.append(this.e);
        o.append(", viewerIsFollowing=");
        o.append(this.f);
        o.append(", viewerIsBlocking=");
        return jo.f4Shadow.s(o, this.g, ")");
    }

    public x0(l4 l4Var, boolean z, boolean z2) {
        this(l4Var.a, l4Var.b, l4Var.c, l4Var.d, l4Var.e, z, z2);
    }
}
