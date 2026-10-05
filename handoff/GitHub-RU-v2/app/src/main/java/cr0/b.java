package cr0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final a g;
    public final String h;

    public b(String str, String str2, String str3, boolean z, boolean z2, String str4, a aVar, String str5) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "emojiHTML");
        k.g(str5, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = aVar;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && k.b(this.f, bVar.f) && k.b(this.g, bVar.g) && k.b(this.h, bVar.h);
    }

    public final int hashCode() {
        int e = i.e(i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.g;
        return this.h.hashCode() + ((hashCode + (aVar != null ? aVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCategoryFragment(id=", this.a, ", name=", this.b, ", emojiHTML=");
        m0.x(o, this.c, ", isAnswerable=", this.d, ", isPollable=");
        m0.z(o, this.e, ", description=", this.f, ", template=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
