package com.github.rudroid.viewmodels.notifications;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends f {
    public int a;

    public c(int i) {
        h hVar = h.r;
        this.a = i;
    }

    @Override // com.github.rudroid.viewmodels.notifications.p1
    public final j71.a a() {
        return null;
    }

    @Override // com.github.rudroid.viewmodels.notifications.f
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return a0.s0.i("MultiSelectMarkAsReadSnackBarEvent(count=", this.a, ", undoAction=null)");
    }
    public Object v(Object p1) { return null; }
    public Object v(Object) { return null; }
}
