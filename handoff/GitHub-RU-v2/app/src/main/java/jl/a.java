package jl;

import com.github.rudroid.m0;
import f1.e;
import java.util.List;
import k71.k;
import l01.l0;
import l01.t0;
import vb.f;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements f {
    public final List a;
    public final l0 b;
    public final List c;
    public final t0 d;
    public final String e;
    public final boolean f;

    public a(List list, l0 l0Var, List list2, t0 t0Var, String str, boolean z) {
        k.g(l0Var, "selectedView");
        this.a = list;
        this.b = l0Var;
        this.c = list2;
        this.d = t0Var;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + e.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProjectViewData(projectViews=");
        sb.append(this.a);
        sb.append(", selectedView=");
        sb.append(this.b);
        sb.append(", groups=");
        sb.append(this.c);
        sb.append(", projectWithFields=");
        sb.append(this.d);
        sb.append(", query=");
        return m0.k(sb, this.e, ", hasNextPage=", this.f, ")");
    }
}
