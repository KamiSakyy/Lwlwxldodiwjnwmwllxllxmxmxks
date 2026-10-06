package dd;

import com.github.rudroid.fragments.onboarding.notifications.viewmodel.j;
import com.github.rudroid.viewmodels.notifications.n;
import com.github.service.models.response.type.MobileAppElement;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: dd.a$a, reason: collision with other inner class name */
    public static final class C0064a extends f {

        /* renamed from: d, reason: collision with root package name */
        public j f21765d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0064a(j jVar, n nVar, n nVar2) {
            super(MobileAppElement.NOTIFICATION_ONBOARDING_CONTINUE_BANNER, nVar, nVar2);
            k.g(jVar, "lastKnownBanner");
            this.f21765d = jVar;
        }
    }

    public static final class b extends c {
        public static final C0065a Companion = new C0065a();

        /* renamed from: dd.a$b$a, reason: collision with other inner class name */
        public static final class C0065a {
        }
    }

    public static abstract class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public int f21766a;

        /* renamed from: b, reason: collision with root package name */
        public int f21767b;

        /* renamed from: c, reason: collision with root package name */
        public MobileAppElement f21768c;

        /* renamed from: d, reason: collision with root package name */
        public int f21769d;

        /* renamed from: e, reason: collision with root package name */
        public j71.a f21770e;

        public c(int i, int i10, MobileAppElement mobileAppElement, int i11, j71.a aVar) {
            this.f21766a = i;
            this.f21767b = i10;
            this.f21768c = mobileAppElement;
            this.f21769d = i11;
            this.f21770e = aVar;
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f21771a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1822737743;
        }

        public final String toString() {
            return "Nothing";
        }
    }

    public static final class e extends f {
    }

    public static abstract class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public MobileAppElement f21772a;

        /* renamed from: b, reason: collision with root package name */
        public j71.a f21773b;

        /* renamed from: c, reason: collision with root package name */
        public j71.a f21774c;

        public f(MobileAppElement mobileAppElement, j71.a aVar, j71.a aVar2) {
            this.f21772a = mobileAppElement;
            this.f21773b = aVar;
            this.f21774c = aVar2;
        }
    }

    public static final class g extends c {
    }

    public static final class h extends f {
    }
}
