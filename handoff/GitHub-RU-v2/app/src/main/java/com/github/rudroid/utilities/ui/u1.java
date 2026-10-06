package com.github.rudroid.utilities.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1<T> implements g1<T> {
    public Object a;
    public rh.f b;

    public u1(Object obj, rh.f fVar) {
        this.a = obj;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b);
    }

    @Override // com.github.rudroid.utilities.ui.g1
    public final Object getData() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "UiError(data=" + this.a + ", uiErrorModel=" + this.b + ")";
    }
}
