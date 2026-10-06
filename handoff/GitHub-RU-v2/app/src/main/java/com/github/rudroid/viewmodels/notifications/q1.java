package com.github.rudroid.viewmodels.notifications;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 implements p1 {
    public h a;
    public j71.a b;

    public q1(h hVar, j71.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    @Override // com.github.rudroid.viewmodels.notifications.p1
    public final j71.a a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.a == q1Var.a && k71.k.b(this.b, q1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j71.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "SwipeSnackBarEvent(type=" + this.a + ", undoAction=" + this.b + ")";
    }
}
