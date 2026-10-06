package com.github.rudroid.profile.navigation;

import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import ze.d;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class UserOrOgProfileScreenEntryPointRoute implements d {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f17330r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17331s;

    public static final class Companion {
        public final KSerializer serializer() {
            return UserOrOgProfileScreenEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserOrOgProfileScreenEntryPointRoute(int i, String str, boolean z10) {
        if (1 != (i & 1)) {
            c1.l(i, 1, UserOrOgProfileScreenEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17330r = str;
        if ((i & 2) == 0) {
            this.f17331s = false;
        } else {
            this.f17331s = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOrOgProfileScreenEntryPointRoute)) {
            return false;
        }
        UserOrOgProfileScreenEntryPointRoute userOrOgProfileScreenEntryPointRoute = (UserOrOgProfileScreenEntryPointRoute) obj;
        return k.b(this.f17330r, userOrOgProfileScreenEntryPointRoute.f17330r) && this.f17331s == userOrOgProfileScreenEntryPointRoute.f17331s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17331s) + (this.f17330r.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("UserOrOgProfileScreenEntryPointRoute(userOrOrgLogin=", this.f17330r, ", displayBlockDialog=", ")", this.f17331s);
    }

    public UserOrOgProfileScreenEntryPointRoute(String str, boolean z10) {
        k.g(str, "userOrOrgLogin");
        this.f17330r = str;
        this.f17331s = z10;
    }
}
