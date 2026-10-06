package bk;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public Avatar d;
    public String e;

    public c(Avatar avatar, String str, String str2, String str3, String str4) {
        k.g(str, "name");
        k.g(str2, "id");
        k.g(str3, "owner");
        k.g(avatar, "avatar");
        k.g(str4, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = avatar;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.j(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PinnedItemsDataEntry(name=", this.a, ", id=", this.b, ", owner=");
        o.append(this.c);
        o.append(", avatar=");
        o.append(this.d);
        o.append(", url=");
        return h1.p(o, this.e, ")");
    }
}
