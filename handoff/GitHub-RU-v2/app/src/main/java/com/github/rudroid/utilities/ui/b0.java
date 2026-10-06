package com.github.rudroid.utilities.ui;

/* loaded from: /home/user/work/p/classes3.dex */
final class b0<T> implements q0<T> {
    public Object a;

    public b0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && k71.k.b(this.a, ((b0) obj).a);
    }

    @Override // com.github.rudroid.utilities.ui.q0
    public final Object getData() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.l(this.a, "ContentLoadingAppendState(data=", ")");
    }
}
