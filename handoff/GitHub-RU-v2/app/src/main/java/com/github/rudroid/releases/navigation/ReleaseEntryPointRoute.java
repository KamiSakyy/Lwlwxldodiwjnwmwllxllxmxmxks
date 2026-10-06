package com.github.rudroid.releases.navigation;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import gf.c;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ReleaseEntryPointRoute implements c {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f18927r;

    /* renamed from: s, reason: collision with root package name */
    public String f18928s;

    /* renamed from: t, reason: collision with root package name */
    public String f18929t;

    public static final class Companion {
        public final KSerializer serializer() {
            return ReleaseEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReleaseEntryPointRoute(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, ReleaseEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18927r = str;
        this.f18928s = str2;
        this.f18929t = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleaseEntryPointRoute)) {
            return false;
        }
        ReleaseEntryPointRoute releaseEntryPointRoute = (ReleaseEntryPointRoute) obj;
        return k.b(this.f18927r, releaseEntryPointRoute.f18927r) && k.b(this.f18928s, releaseEntryPointRoute.f18928s) && k.b(this.f18929t, releaseEntryPointRoute.f18929t);
    }

    public final int hashCode() {
        return this.f18929t.hashCode() + h1.i(this.f18927r.hashCode() * 31, this.f18928s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("ReleaseEntryPointRoute(repositoryOwner=", this.f18927r, ", repositoryName=", this.f18928s, ", tagName="), this.f18929t, ")");
    }

    public ReleaseEntryPointRoute(String str, String str2, String str3) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        k.g(str3, "tagName");
        this.f18927r = str;
        this.f18928s = str2;
        this.f18929t = str3;
    }
}
