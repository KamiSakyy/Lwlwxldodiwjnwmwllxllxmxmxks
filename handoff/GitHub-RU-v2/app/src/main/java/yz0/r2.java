package yz0;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 {
    public final String a;
    public final String b;
    public final Avatar c;
    public final boolean d;

    public r2(String str, String str2, Avatar avatar, boolean z) {
        k71.k.g(str2, "login");
        k71.k.g(avatar, "avatar");
        this.a = str;
        this.b = str2;
        this.c = avatar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        r2 r2Var = obj instanceof r2 ? (r2) obj : null;
        return k71.k.b(this.b, r2Var != null ? r2Var.b : null);
    }

    public final int hashCode() {
        return this.c.r.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.g("@", this.b);
    }
}
