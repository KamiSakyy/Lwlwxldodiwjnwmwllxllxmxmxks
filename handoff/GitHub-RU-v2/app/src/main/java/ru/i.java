package ru;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public h a;

    public i(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && k.b(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        h hVar = this.a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    public final String toString() {
        return "UnfollowOrganization(organization=" + this.a + ")";
    }
}
