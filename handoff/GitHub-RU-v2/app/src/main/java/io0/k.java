package io0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements m0 {
    public final m a;

    public k(m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        m mVar = this.a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "Data(reopenDiscussion=" + this.a + ")";
    }
}
