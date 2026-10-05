package com.github.rudroid.utilities.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0<T> implements g1<T> {
    public final Object a;
    public final fl.b b;

    public n0(fl.b bVar, Object obj) {
        k71.k.g(bVar, "executionError");
        this.a = obj;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b);
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
        return "LegacyError(data=" + this.a + ", executionError=" + this.b + ")";
    }
}
