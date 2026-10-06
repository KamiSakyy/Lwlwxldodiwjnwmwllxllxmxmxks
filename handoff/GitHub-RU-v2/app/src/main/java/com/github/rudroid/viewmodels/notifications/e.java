package com.github.rudroid.viewmodels.notifications;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends f {
    public int a;

    public e(int i) {
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
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return a0.s0.i("MultiSelectMarkAsUnReadSnackBarEvent(count=", this.a, ", undoAction=null)");
    }
}
