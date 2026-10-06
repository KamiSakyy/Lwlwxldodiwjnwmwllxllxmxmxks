package com.github.rudroid.utilities.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1<T> implements g1<T> {
    public Object a;

    public t1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && k71.k.b(this.a, ((t1) obj).a);
    }

    @Override // com.github.rudroid.utilities.ui.g1
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
        return com.github.rudroid.copilot.h1.l(this.a, "Success(data=", ")");
    }
}
