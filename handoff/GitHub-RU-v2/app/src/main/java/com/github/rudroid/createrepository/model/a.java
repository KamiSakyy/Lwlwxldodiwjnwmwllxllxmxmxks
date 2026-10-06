package com.github.rudroid.createrepository.model;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.license.LicenseTemplate;
import com.github.service.models.response.SimpleRepository;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10578c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10579d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10580e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleRepository f10581f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10582g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10583h;
    public final LicenseTemplate i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10584j;

    public a(String str, String str2, String str3, String str4, boolean z10, SimpleRepository simpleRepository, boolean z11, String str5, LicenseTemplate licenseTemplate, boolean z12) {
        k.g(str, "ownerLogin");
        k.g(str2, "ownerAvatarUrl");
        k.g(str3, "repositoryName");
        k.g(str4, "description");
        this.f10576a = str;
        this.f10577b = str2;
        this.f10578c = str3;
        this.f10579d = str4;
        this.f10580e = z10;
        this.f10581f = simpleRepository;
        this.f10582g = z11;
        this.f10583h = str5;
        this.i = licenseTemplate;
        this.f10584j = z12;
    }

    public static a a(a aVar, String str, String str2, boolean z10, SimpleRepository simpleRepository, boolean z11, String str3, LicenseTemplate licenseTemplate, boolean z12, int i) {
        String str4 = aVar.f10576a;
        String str5 = aVar.f10577b;
        if ((i & 4) != 0) {
            str = aVar.f10578c;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = aVar.f10579d;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            z10 = aVar.f10580e;
        }
        boolean z13 = z10;
        SimpleRepository simpleRepository2 = (i & 32) != 0 ? aVar.f10581f : simpleRepository;
        boolean z14 = (i & 64) != 0 ? aVar.f10582g : z11;
        String str8 = (i & 128) != 0 ? aVar.f10583h : str3;
        LicenseTemplate licenseTemplate2 = (i & 256) != 0 ? aVar.i : licenseTemplate;
        boolean z15 = (i & 512) != 0 ? aVar.f10584j : z12;
        aVar.getClass();
        k.g(str4, "ownerLogin");
        k.g(str5, "ownerAvatarUrl");
        k.g(str6, "repositoryName");
        k.g(str7, "description");
        return new a(str4, str5, str6, str7, z13, simpleRepository2, z14, str8, licenseTemplate2, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f10576a, aVar.f10576a) && k.b(this.f10577b, aVar.f10577b) && k.b(this.f10578c, aVar.f10578c) && k.b(this.f10579d, aVar.f10579d) && this.f10580e == aVar.f10580e && k.b(this.f10581f, aVar.f10581f) && this.f10582g == aVar.f10582g && k.b(this.f10583h, aVar.f10583h) && k.b(this.i, aVar.i) && this.f10584j == aVar.f10584j;
    }

    public final int hashCode() {
        int e5 = i.e(h1.i(h1.i(h1.i(this.f10576a.hashCode() * 31, this.f10577b, 31), this.f10578c, 31), this.f10579d, 31), 31, this.f10580e);
        SimpleRepository simpleRepository = this.f10581f;
        int e10 = i.e((e5 + (simpleRepository == null ? 0 : simpleRepository.hashCode())) * 31, 31, this.f10582g);
        String str = this.f10583h;
        int hashCode = (e10 + (str == null ? 0 : str.hashCode())) * 31;
        LicenseTemplate licenseTemplate = this.i;
        return Boolean.hashCode(this.f10584j) + ((hashCode + (licenseTemplate != null ? licenseTemplate.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("CreateRepositoryFormData(ownerLogin=", this.f10576a, ", ownerAvatarUrl=", this.f10577b, ", repositoryName=");
        f1.e.x(o5, this.f10578c, ", description=", this.f10579d, ", isPrivate=");
        o5.append(this.f10580e);
        o5.append(", selectedTemplate=");
        o5.append(this.f10581f);
        o5.append(", addReadme=");
        m0.z(o5, this.f10582g, ", selectedGitignore=", this.f10583h, ", selectedLicense=");
        o5.append(this.i);
        o5.append(", includeAllBranches=");
        o5.append(this.f10584j);
        o5.append(")");
        return o5.toString();
    }
}
