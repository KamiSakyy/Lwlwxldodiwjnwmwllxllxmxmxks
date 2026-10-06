package com.github.rudroid.utilities.viewmodel.paging.model;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x<T> {
    public Object a;
    public boolean b;

    public x(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && this.b == xVar.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectableItem(item=" + this.a + ", isSelected=" + this.b + ")";
    }
}
