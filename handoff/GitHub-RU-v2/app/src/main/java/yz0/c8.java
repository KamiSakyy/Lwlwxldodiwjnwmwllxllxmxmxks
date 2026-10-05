package yz0;

import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 {
    public final String a;
    public final Avatar b;
    public final String c;

    public c8(Avatar avatar, String str, String str2) {
        this.a = str;
        this.b = avatar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return k71.k.b(this.a, c8Var.a) && k71.k.b(this.b, c8Var.b) && k71.k.b(this.c, c8Var.c);
    }

    public final int hashCode() {
        int j = com.github.rudroid.copilot.h1.j(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return j + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAccountInfo(login=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        sb.append(", name=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
