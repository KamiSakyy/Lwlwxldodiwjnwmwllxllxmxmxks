package p8;

import java.util.List;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30433a;

    public h(List list) {
        this.f30433a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h.class.equals(obj.getClass())) {
            return false;
        }
        return this.f30433a.equals(((h) obj).f30433a);
    }

    public final int hashCode() {
        return this.f30433a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return m.c0((Iterable) this.f30433a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (j71.c) null, 56);
    }
}
