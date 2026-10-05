package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

/* loaded from: /home/user/work/p/classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f14273a;

    /* renamed from: b, reason: collision with root package name */
    public final k f14274b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14275c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14276d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14277e;

    public i(j jVar, k kVar, a aVar, int i, int i10) {
        this.f14273a = jVar;
        this.f14274b = kVar;
        this.f14275c = aVar;
        this.f14276d = i;
        this.f14277e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14273a == iVar.f14273a && this.f14274b == iVar.f14274b && this.f14275c.equals(iVar.f14275c) && this.f14276d == iVar.f14276d && this.f14277e == iVar.f14277e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14277e) + a0.s0.b(this.f14276d, (this.f14275c.hashCode() + ((this.f14274b.hashCode() + (this.f14273a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingPage(onboardingPageType=");
        sb2.append(this.f14273a);
        sb2.append(", onboardingPagerType=");
        sb2.append(this.f14274b);
        sb2.append(", buttonAction=");
        sb2.append(this.f14275c);
        sb2.append(", buttonText=");
        sb2.append(this.f14276d);
        sb2.append(", buttonSubtitle=");
        return a0.s0.l(sb2, this.f14277e, ")");
    }
}
