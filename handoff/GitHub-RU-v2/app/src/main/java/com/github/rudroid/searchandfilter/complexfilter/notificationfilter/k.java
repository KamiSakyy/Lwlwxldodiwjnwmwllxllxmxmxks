package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public com.github.domain.searchandfilter.filters.data.notification.a a;
    public boolean b;

    public k(com.github.domain.searchandfilter.filters.data.notification.a aVar, boolean z) {
        k71.k.g(aVar, "filter");
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableNotificationFilter(filter=" + this.a + ", isSelected=" + this.b + ")";
    }
}
