package ru;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        d dVar = this.a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "FollowOrganization(organization=" + this.a + ")";
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
