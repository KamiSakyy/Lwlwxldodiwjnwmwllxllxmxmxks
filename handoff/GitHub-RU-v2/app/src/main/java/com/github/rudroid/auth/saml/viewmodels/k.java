package com.github.rudroid.auth.saml.viewmodels;

import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f8600a;

    /* renamed from: b, reason: collision with root package name */
    public final OrganizationNameAndAvatarUrl f8601b;

    public k(String str, OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl) {
        this.f8600a = str;
        this.f8601b = organizationNameAndAvatarUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.f8600a, kVar.f8600a) && k71.k.b(this.f8601b, kVar.f8601b);
    }

    public final int hashCode() {
        int hashCode = this.f8600a.hashCode() * 31;
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = this.f8601b;
        return hashCode + (organizationNameAndAvatarUrl == null ? 0 : organizationNameAndAvatarUrl.hashCode());
    }

    public final String toString() {
        return "SamlErrorState(orgLogin=" + this.f8600a + ", organization=" + this.f8601b + ")";
    }
}
