package gc;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f24869a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24870b;

    public a(List list, boolean z10) {
        k.g(list, "selectedProjects");
        this.f24869a = list;
        this.f24870b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f24869a, aVar.f24869a) && this.f24870b == aVar.f24870b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24870b) + (this.f24869a.hashCode() * 31);
    }

    public final String toString() {
        return "PropertyBarProjectsUiModel(selectedProjects=" + this.f24869a + ", isProjectSelected=" + this.f24870b + ")";
    }
}
