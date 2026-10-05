package com.github.rudroid.common;

/* loaded from: /home/user/work/p/classes.dex */
final class j<T> implements o0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f9334a;

    public j(Throwable th) {
        k71.k.g(th, "throwable");
        this.f9334a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.f9334a, ((j) obj).f9334a);
    }

    public final int hashCode() {
        return this.f9334a.hashCode();
    }

    public final String toString() {
        return "Failure(throwable=" + this.f9334a + ")";
    }
}
