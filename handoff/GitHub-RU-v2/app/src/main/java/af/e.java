package af;

import com.github.rudroid.utilities.ui.g1;
import k71.k;
import l01.i0;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public i0 f896a;

    /* renamed from: b, reason: collision with root package name */
    public g1 f897b;

    public e(i0 i0Var, g1 g1Var) {
        k.g(i0Var, "projectType");
        this.f896a = i0Var;
        this.f897b = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.f896a, eVar.f896a) && k.b(this.f897b, eVar.f897b);
    }

    public final int hashCode() {
        return this.f897b.hashCode() + (this.f896a.hashCode() * 31);
    }

    public final String toString() {
        return "SimplifiedTableState(projectType=" + this.f896a + ", projectBoardUiModel=" + this.f897b + ")";
    }
    public static Object c(Object p1, Object p2, Object p3) { return null; }
}
