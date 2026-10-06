package com.github.rudroid.main;

import com.github.rudroid.agents.copilothome.navigation.CopilotHomeEntryPointRoute;
import com.github.rudroid.feed.navigation.ExploreEntryPointRoute;
import com.github.rudroid.home.navigation.HomeEntryPointRoute;
import com.github.rudroid.navigation.NotificationsEntryPointRoute;
import com.github.rudroid.profile.navigation.ProfileEntryPointRoute;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16907a;

    /* renamed from: b, reason: collision with root package name */
    public int f16908b;

    /* renamed from: c, reason: collision with root package name */
    public int f16909c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f16910d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16911e;

    public static final class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f16912f = new a(2131953147, 2131231207, 2131231207, null, CopilotHomeEntryPointRoute.INSTANCE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2023711338;
        }

        public final String toString() {
            return "Copilot";
        }
    }

    public static final class b extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f16913f = new b(2131953150, 2131231468, 2131231469, null, ExploreEntryPointRoute.INSTANCE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 9050717;
        }

        public final String toString() {
            return "Explore";
        }
    }

    public static final class c extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f16914f = new c(2131953152, 2131231310, 2131231311, 2131953873, HomeEntryPointRoute.INSTANCE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -142214827;
        }

        public final String toString() {
            return "Home";
        }
    }

    public static final class d extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f16915f = new d(2131953153, 2131231315, 2131231317, 2131953874, NotificationsEntryPointRoute.INSTANCE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2084555470;
        }

        public final String toString() {
            return "Notifications";
        }
    }

    public static final class e extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public static final e f16916f = new e(2131953222, 2131231396, 2131231398, 2131953905, ProfileEntryPointRoute.INSTANCE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1008773491;
        }

        public final String toString() {
            return "Profile";
        }
    }

    public m0(int i, int i10, int i11, Integer num, Object obj) {
        this.f16907a = i;
        this.f16908b = i10;
        this.f16909c = i11;
        this.f16910d = num;
        this.f16911e = obj;
    }
}
