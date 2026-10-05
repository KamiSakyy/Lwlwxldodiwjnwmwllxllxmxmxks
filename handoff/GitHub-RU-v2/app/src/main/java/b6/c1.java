package b6;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3510b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3511c;

    public c1(int i, int i10, Map map) {
        this.f3509a = i;
        this.f3510b = i10;
        this.f3511c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f3509a == c1Var.f3509a && this.f3510b == c1Var.f3510b && k71.k.b(this.f3511c, c1Var.f3511c);
    }

    public final int hashCode() {
        return this.f3511c.hashCode() + a0.s0.b(this.f3510b, Integer.hashCode(this.f3509a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f3509a + ", complexViewId=" + this.f3510b + ", children=" + this.f3511c + ')';
    }

    public /* synthetic */ c1(int i, int i10, Map map, int i11) {
        this((i11 & 1) != 0 ? -1 : i, (i11 & 2) != 0 ? -1 : i10, (i11 & 4) != 0 ? x61.s.r : map);
    }
}
