package ru;

import aa.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements m0 {
    public final i a;

    public g(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Data(unfollowOrganization=" + this.a + ")";
    }
}
