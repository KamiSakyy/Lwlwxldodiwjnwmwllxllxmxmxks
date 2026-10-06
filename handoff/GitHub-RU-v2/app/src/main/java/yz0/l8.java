package yz0;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l8 implements k8 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final Avatar f;
    public final String g;
    public final int h;

    public l8(String str, String str2, int i, String str3, String str4, Avatar avatar, String str5, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = avatar;
        this.g = str5;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return k71.k.b(this.a, l8Var.a) && k71.k.b(this.b, l8Var.b) && this.c == l8Var.c && k71.k.b(this.d, l8Var.d) && k71.k.b(this.e, l8Var.e) && k71.k.b(this.f, l8Var.f) && k71.k.b(this.g, l8Var.g) && this.h == l8Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.j(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PinnedRepository(id=", this.a, ", languageName=", this.b, ", languageColor=");
        x.i.r(this.c, ", name=", this.d, ", ownerLogin=", o);
        o.append(this.e);
        o.append(", ownerAvatar=");
        o.append(this.f);
        o.append(", shortDescriptionHtml=");
        o.append(this.g);
        o.append(", stargazersTotalCount=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
