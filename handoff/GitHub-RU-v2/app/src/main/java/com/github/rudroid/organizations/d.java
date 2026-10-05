package com.github.rudroid.organizations;

import com.github.service.models.response.organizations.Organization;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements c {

    /* renamed from: r, reason: collision with root package name */
    public final Organization f17171r;

    /* renamed from: s, reason: collision with root package name */
    public final String f17172s;

    public d(Organization organization) {
        k71.k.g(organization, "organization");
        this.f17171r = organization;
        this.f17172s = organization.r;
    }

    @Override // le.z
    public final String E() {
        return this.f17172s;
    }

    @Override // com.github.rudroid.organizations.c
    public final Organization H() {
        return this.f17171r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.f17171r, ((d) obj).f17171r);
    }

    public final int hashCode() {
        return this.f17171r.hashCode();
    }

    public final String toString() {
        return "OrganizationItem(organization=" + this.f17171r + ")";
    }
}
