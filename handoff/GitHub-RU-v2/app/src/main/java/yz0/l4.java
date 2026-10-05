package yz0;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Avatar e;
    public final boolean f;

    public l4(Avatar avatar, String str, String str2, String str3, String str4) {
        boolean x = t71.w.x(str3, "[bot]", false);
        k71.k.g(str, "id");
        k71.k.g(str3, "login");
        k71.k.g(avatar, "avatar");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = avatar;
        this.f = x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b) && k71.k.b(this.c, l4Var.c) && k71.k.b(this.d, l4Var.d) && k71.k.b(this.e, l4Var.e) && this.f == l4Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.f) + com.github.rudroid.copilot.h1.j(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SimpleUserOrOrganization(id=", this.a, ", name=", this.b, ", login=");
        f1.e.x(o, this.c, ", descriptionHtml=", this.d, ", avatar=");
        o.append(this.e);
        o.append(", isBot=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
