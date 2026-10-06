package com.github.rudroid.actions.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sa.d;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ChecksOverviewEntryPointRoute implements d {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f5113r;

    /* renamed from: s, reason: collision with root package name */
    public String f5114s;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChecksOverviewEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChecksOverviewEntryPointRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, ChecksOverviewEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5113r = str;
        this.f5114s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChecksOverviewEntryPointRoute)) {
            return false;
        }
        ChecksOverviewEntryPointRoute checksOverviewEntryPointRoute = (ChecksOverviewEntryPointRoute) obj;
        return k.b(this.f5113r, checksOverviewEntryPointRoute.f5113r) && k.b(this.f5114s, checksOverviewEntryPointRoute.f5114s);
    }

    public final int hashCode() {
        return this.f5114s.hashCode() + (this.f5113r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("ChecksOverviewEntryPointRoute(commitId=", this.f5113r, ", pullRequestId=", this.f5114s, ")");
    }
}
