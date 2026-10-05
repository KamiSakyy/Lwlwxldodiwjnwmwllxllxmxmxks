package com.github.rudroid.repositorycreation.licensetemplate;

import com.github.service.license.LicenseTemplate;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LicenseTemplate f20397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20398b;

    public b(LicenseTemplate licenseTemplate, boolean z10) {
        this.f20397a = licenseTemplate;
        this.f20398b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f20397a, bVar.f20397a) && this.f20398b == bVar.f20398b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20398b) + (this.f20397a.hashCode() * 31);
    }

    public final String toString() {
        return "LicenseTemplateItem(license=" + this.f20397a + ", isSelected=" + this.f20398b + ")";
    }
}
