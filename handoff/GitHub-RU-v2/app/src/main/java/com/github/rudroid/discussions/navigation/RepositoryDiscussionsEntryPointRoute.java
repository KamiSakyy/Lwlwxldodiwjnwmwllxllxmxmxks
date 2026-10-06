package com.github.rudroid.discussions.navigation;

import g81.e;
import jk.j;
import k71.k;
import k81.c1Shadow;
import kh.a;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class RepositoryDiscussionsEntryPointRoute implements oc.e {
    public static final Companion Companion = new Companion();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f11579s = {w.s(i.r, new a(25))};

    /* renamed from: r, reason: collision with root package name */
    public j f11580r;

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryDiscussionsEntryPointRoute(int i, j jVar) {
        if (1 == (i & 1)) {
            this.f11580r = jVar;
        } else {
            c1Shadow.l(i, 1, RepositoryDiscussionsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RepositoryDiscussionsEntryPointRoute) && k.b(this.f11580r, ((RepositoryDiscussionsEntryPointRoute) obj).f11580r);
    }

    public final int hashCode() {
        return this.f11580r.hashCode();
    }

    public final String toString() {
        return "RepositoryDiscussionsEntryPointRoute(intentData=" + this.f11580r + ")";
    }

    public RepositoryDiscussionsEntryPointRoute(j jVar) {
        this.f11580r = jVar;
    }
}
