package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final boolean h;
    public final l i;

    public e(String str, String str2, String str3, String str4, String str5, int i, List list, boolean z, l lVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = list;
        this.h = z;
        this.i = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e) && this.f == eVar.f && k71.k.b(this.g, eVar.g) && this.h == eVar.h && k71.k.b(this.i, eVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + x.i.e(f1.e.c(this.g, s0.b(this.f, h1.i(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder o = s0.o("FeedDiscussion(id=", this.a, ", url=", this.b, ", title=");
        f1.e.x(o, this.c, ", bodyHtml=", this.d, ", shortBodyText=");
        s0.w(this.f, this.e, ", number=", ", reactions=", o);
        h1.C(o, this.g, ", viewerCanReact=", this.h, ", repository=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
