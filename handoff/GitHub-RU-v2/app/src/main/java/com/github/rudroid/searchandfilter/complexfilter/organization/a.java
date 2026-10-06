package com.github.rudroid.searchandfilter.complexfilter.organization;

import com.github.service.models.response.organizations.Organization;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final Organization a;
    public final boolean b;

    public a(Organization organization, boolean z) {
        k71.k.g(organization, "organization");
        this.a = organization;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableOrganization(organization=" + this.a + ", isSelected=" + this.b + ")";
    }
}
