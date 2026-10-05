package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

import android.content.Context;
import com.github.rudroid.settings.g3;
import com.github.rudroid.settings.h3;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final g3 f14278a;

    /* renamed from: b, reason: collision with root package name */
    public final g3 f14279b;

    public static final class a {
        public static i0 a(Context context) {
            k71.k.g(context, "context");
            h3 h3Var = new h3(context);
            return new i0(h3Var.a, h3Var.b);
        }
    }

    public i0(g3 g3Var, g3 g3Var2) {
        k71.k.g(g3Var, "swipeRightAction");
        k71.k.g(g3Var2, "swipeLeftAction");
        this.f14278a = g3Var;
        this.f14279b = g3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f14278a == i0Var.f14278a && this.f14279b == i0Var.f14279b;
    }

    public final int hashCode() {
        return this.f14279b.hashCode() + (this.f14278a.hashCode() * 31);
    }

    public final String toString() {
        return "SwipeActions(swipeRightAction=" + this.f14278a + ", swipeLeftAction=" + this.f14279b + ")";
    }
}
