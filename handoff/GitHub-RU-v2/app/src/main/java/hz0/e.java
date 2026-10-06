package hz0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements h0 {
    public a a;
    public c b;
    public int c;
    public String d;
    public String e;
    public ArrayList f;

    public e(a aVar, c cVar, int i, String str, String str2, ArrayList arrayList) {
        this.a = aVar;
        this.b = cVar;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && this.c == eVar.c && this.d.equals(eVar.d) && this.e.equals(eVar.e) && this.f.equals(eVar.f);
    }

    public final int hashCode() {
        a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        c cVar = this.b;
        return this.f.hashCode() + h1.i(h1.i(s0.b(this.c, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalCodeSearchFragment(language=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", matchCount=");
        x.i.r(this.c, ", path=", this.d, ", refName=", sb);
        sb.append(this.e);
        sb.append(", snippets=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
