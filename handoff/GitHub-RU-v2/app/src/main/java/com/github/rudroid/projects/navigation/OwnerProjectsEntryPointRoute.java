package com.github.rudroid.projects.navigation;

import bf.a;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class OwnerProjectsEntryPointRoute implements a {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f17753r;

    public static final class Companion {
        public final KSerializer serializer() {
            return OwnerProjectsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OwnerProjectsEntryPointRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.f17753r = str;
        } else {
            c1.l(i, 1, OwnerProjectsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnerProjectsEntryPointRoute) && k.b(this.f17753r, ((OwnerProjectsEntryPointRoute) obj).f17753r);
    }

    public final int hashCode() {
        return this.f17753r.hashCode();
    }

    public final String toString() {
        return f1.e.z("OwnerProjectsEntryPointRoute(userOrOrgLogin=", this.f17753r, ")");
    }
}
