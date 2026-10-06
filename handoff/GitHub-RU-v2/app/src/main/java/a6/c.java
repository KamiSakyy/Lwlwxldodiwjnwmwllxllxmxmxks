package a6;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f520a;

    public c(String str) {
        this.f520a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return k.b(this.f520a, ((c) obj).f520a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f520a.hashCode();
    }

    public final String toString() {
        return this.f520a;
    }
}
