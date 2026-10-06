package b01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;

    public e(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(str3, "emojiHTML");
        k71.k.g(str4, "description");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && k71.k.b(this.f, eVar.f) && k71.k.b(this.g, eVar.g);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), this.f, 31);
        String str = this.g;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCategory(id=", this.a, ", name=", this.b, ", emojiHTML=");
        m0.x(o, this.c, ", isAnswerable=", this.d, ", isPollable=");
        m0.z(o, this.e, ", description=", this.f, ", formTemplateUrl=");
        return h1.p(o, this.g, ")");
    }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
