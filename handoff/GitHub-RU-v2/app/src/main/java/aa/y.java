package aa;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final List f690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f691b;

    public y(List list, String str) {
        this.f690a = list;
        this.f691b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.f690a, yVar.f690a) && k71.k.b(this.f691b, yVar.f691b);
    }

    public final int hashCode() {
        int hashCode = this.f690a.hashCode() * 31;
        String str = this.f691b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb2.append(this.f690a);
        sb2.append(", label=");
        return a0.s0.m(sb2, this.f691b, ')');
    }
}
