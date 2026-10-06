package com.github.rudroid.common;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes.dex */
final class n0<T> implements o0<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f9365a;

    public n0(Object obj) {
        this.f9365a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && k71.k.b(this.f9365a, ((n0) obj).f9365a);
    }

    public final int hashCode() {
        Object obj = this.f9365a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return h1.l(this.f9365a, "WrappedResult(result=", ")");
    }
}
