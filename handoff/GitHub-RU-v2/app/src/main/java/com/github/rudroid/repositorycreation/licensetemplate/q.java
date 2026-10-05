package com.github.rudroid.repositorycreation.licensetemplate;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.license.LicenseTemplate;

/* loaded from: /home/user/work/p/classes.dex */
public final class q {
    public static final a Companion = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final q f20416d = new q(g1.a.c(g1.Companion), "", null);

    /* renamed from: a, reason: collision with root package name */
    public final g1 f20417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20418b;

    /* renamed from: c, reason: collision with root package name */
    public final LicenseTemplate f20419c;

    public static final class a {
    }

    public q(g1 g1Var, String str, LicenseTemplate licenseTemplate) {
        k71.k.g(str, "searchQuery");
        this.f20417a = g1Var;
        this.f20418b = str;
        this.f20419c = licenseTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.f20417a, qVar.f20417a) && k71.k.b(this.f20418b, qVar.f20418b) && k71.k.b(this.f20419c, qVar.f20419c);
    }

    public final int hashCode() {
        int i = h1.i(this.f20417a.hashCode() * 31, this.f20418b, 31);
        LicenseTemplate licenseTemplate = this.f20419c;
        return i + (licenseTemplate == null ? 0 : licenseTemplate.hashCode());
    }

    public final String toString() {
        return "LicenseTemplatePickerUiModel(templatesState=" + this.f20417a + ", searchQuery=" + this.f20418b + ", selectedLicense=" + this.f20419c + ")";
    }
}
