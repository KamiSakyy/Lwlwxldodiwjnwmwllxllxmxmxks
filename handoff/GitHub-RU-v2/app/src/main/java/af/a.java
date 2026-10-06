package af;

import java.util.List;
import java.util.Set;
import k71.k;
import l01.l0;
import l01.t0;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public List f880a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f881b;

    /* renamed from: c, reason: collision with root package name */
    public List f882c;

    /* renamed from: d, reason: collision with root package name */
    public t0 f883d;

    /* renamed from: e, reason: collision with root package name */
    public Set f884e;

    /* renamed from: f, reason: collision with root package name */
    public vb.e f885f;

    public a(List list, l0 l0Var, List list2, t0 t0Var, Set set, vb.e eVar) {
        k.g(l0Var, "selectedView");
        this.f880a = list;
        this.f881b = l0Var;
        this.f882c = list2;
        this.f883d = t0Var;
        this.f884e = set;
        this.f885f = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f880a, aVar.f880a) && k.b(this.f881b, aVar.f881b) && k.b(this.f882c, aVar.f882c) && k.b(this.f883d, aVar.f883d) && k.b(this.f884e, aVar.f884e) && k.b(this.f885f, aVar.f885f);
    }

    public final int hashCode() {
        int hashCode = (this.f884e.hashCode() + ((this.f883d.hashCode() + f1.e.c(this.f882c, (this.f881b.hashCode() + (this.f880a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        vb.e eVar = this.f885f;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ProjectBoardUiModel(projectViews=" + this.f880a + ", selectedView=" + this.f881b + ", groups=" + this.f882c + ", project=" + this.f883d + ", visibleFieldTypes=" + this.f884e + ", nextPage=" + this.f885f + ")";
    }
}
