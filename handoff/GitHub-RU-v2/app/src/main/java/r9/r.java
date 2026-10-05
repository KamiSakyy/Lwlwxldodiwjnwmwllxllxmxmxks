package r9;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final r f31332b = new r(x61.s.r);

    /* renamed from: a, reason: collision with root package name */
    public final Map f31333a;

    public r(Map map) {
        this.f31333a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return k71.k.b(this.f31333a, ((r) obj).f31333a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31333a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f31333a + ')';
    }
}
