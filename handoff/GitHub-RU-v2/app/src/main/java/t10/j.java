package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final int h;
    public final List i;
    public final boolean j;
    public final String k;
    public final String l;
    public final l m;

    public j(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, List list2, boolean z, String str7, String str8, l lVar) {
        k71.k.g(str5, "shortDescriptionText");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = i;
        this.i = list2;
        this.j = z;
        this.k = str7;
        this.l = str8;
        this.m = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e) && k71.k.b(this.f, jVar.f) && k71.k.b(this.g, jVar.g) && this.h == jVar.h && k71.k.b(this.i, jVar.i) && this.j == jVar.j && k71.k.b(this.k, jVar.k) && k71.k.b(this.l, jVar.l) && k71.k.b(this.m, jVar.m);
    }

    public final int hashCode() {
        int e = x.i.e(f1.e.c(this.i, s0.b(this.h, f1.e.c(this.g, h1.i(h1.i(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31), 31), 31), 31, this.j);
        String str = this.k;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return this.m.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("FeedRelease(id=", this.a, ", url=", this.b, ", name=");
        f1.e.x(o, this.c, ", shortDescriptionHTML=", this.d, ", shortDescriptionText=");
        f1.e.x(o, this.e, ", tagName=", this.f, ", contributors=");
        o.append(this.g);
        o.append(", contributorCount=");
        o.append(this.h);
        o.append(", reactions=");
        h1.C(o, this.i, ", viewerCanReact=", this.j, ", discussionId=");
        f1.e.x(o, this.k, ", discussionUrl=", this.l, ", repository=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }
}
