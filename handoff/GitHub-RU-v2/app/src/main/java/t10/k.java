package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public boolean h;
    public l i;
    public Object j;

    public k(String str, int i, String str2, String str3, String str4, boolean z, int i2, boolean z2, l lVar, List list) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = lVar;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.a) && this.b == kVar.b && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d) && this.e.equals(kVar.e) && this.f == kVar.f && this.g == kVar.g && this.h == kVar.h && this.i.equals(kVar.i) && this.j.equals(kVar.j);
    }

    public final int hashCode() {
        int b = s0.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.j.hashCode() + ((this.i.hashCode() + x.i.e(s0.b(this.g, x.i.e(h1.i((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.e, 31), 31, this.f), 31), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "FeedRepository(id=", this.a, ", contributorsCount=", ", languageName=");
        f1.e.x(n, this.c, ", languageColor=", this.d, ", descriptionHtml=");
        m0.x(n, this.e, ", showDescriptionHtml=", this.f, ", starCount=");
        m0.w(n, this.g, ", viewerHasStarred=", this.h, ", repositoryHeader=");
        n.append(this.i);
        n.append(", listTitles=");
        n.append(this.j);
        n.append(")");
        return n.toString();
    }
}
