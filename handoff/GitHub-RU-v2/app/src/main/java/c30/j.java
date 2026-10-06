package c30;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public j(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OrganizationNameAndAvatar(id=", this.a, ", login=", this.b, ", name=");
        f1.e.x(o, this.c, ", avatarUrl=", this.d, ", __typename=");
        return h1.p(o, this.e, ")");
    }
}
