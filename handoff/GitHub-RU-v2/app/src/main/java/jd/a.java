package jd;

import com.github.rudroid.fragments.onboarding.notifications.viewmodel.k;
import jo.f4;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final C0075a Companion = new C0075a();

    /* renamed from: d, reason: collision with root package name */
    public static final a f27392d = new a(k.f14288s, false, false);

    /* renamed from: a, reason: collision with root package name */
    public k f27393a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27394b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27395c;

    /* renamed from: jd.a$a, reason: collision with other inner class name */
    public static final class C0075a {
    }

    public a(k kVar, boolean z10, boolean z11) {
        this.f27393a = kVar;
        this.f27394b = z10;
        this.f27395c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27393a == aVar.f27393a && this.f27394b == aVar.f27394b && this.f27395c == aVar.f27395c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27395c) + i.e(this.f27393a.hashCode() * 31, 31, this.f27394b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsBannerData(mode=");
        sb2.append(this.f27393a);
        sb2.append(", hasSeenOnboarding=");
        sb2.append(this.f27394b);
        sb2.append(", shouldShowBanner=");
        return f4.s(sb2, this.f27395c, ")");
    }

    public /* synthetic */ a(boolean z10) {
        this(k.f14288s, z10, false);
    }
}
