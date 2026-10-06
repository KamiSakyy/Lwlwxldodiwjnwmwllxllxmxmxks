package a6;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public LinkedHashMap f523a;

    public f(LinkedHashMap linkedHashMap) {
        this.f523a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f523a.equals(((f) obj).f523a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f523a.hashCode();
    }

    public final String toString() {
        return this.f523a.toString();
    }
}
