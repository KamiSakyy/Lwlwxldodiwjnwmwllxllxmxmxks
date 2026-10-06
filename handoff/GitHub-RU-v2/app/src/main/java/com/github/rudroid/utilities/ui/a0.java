package com.github.rudroid.utilities.ui;

/* loaded from: /home/user/work/p/classes3.dex */
final class a0<T> implements q0<T> {
    public Object a;
    public fl.b b;

    public a0(fl.b bVar, Object obj) {
        k71.k.g(bVar, "executionError");
        this.a = obj;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b);
    }

    @Override // com.github.rudroid.utilities.ui.q0
    public final Object getData() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "ContentFailureState(data=" + this.a + ", executionError=" + this.b + ")";
    }
}
