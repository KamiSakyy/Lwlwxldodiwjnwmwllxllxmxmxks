package s5;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f31718a;

    public e(String str) {
        k.g(str, "name");
        this.f31718a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return k.b(this.f31718a, ((e) obj).f31718a);
    }

    public final int hashCode() {
        return this.f31718a.hashCode();
    }

    public final String toString() {
        return this.f31718a;
    }
}
