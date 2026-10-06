package com.github.rudroid.projects.navigation;

import bf.f;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class RepositoryProjectsEntryPointRoute implements f {
    public static final Companion Companion = new Companion();

    /* renamed from: r, reason: collision with root package name */
    public String f17767r;

    /* renamed from: s, reason: collision with root package name */
    public String f17768s;

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryProjectsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryProjectsEntryPointRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, RepositoryProjectsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17767r = str;
        this.f17768s = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoryProjectsEntryPointRoute)) {
            return false;
        }
        RepositoryProjectsEntryPointRoute repositoryProjectsEntryPointRoute = (RepositoryProjectsEntryPointRoute) obj;
        return k.b(this.f17767r, repositoryProjectsEntryPointRoute.f17767r) && k.b(this.f17768s, repositoryProjectsEntryPointRoute.f17768s);
    }

    public final int hashCode() {
        return this.f17768s.hashCode() + (this.f17767r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("RepositoryProjectsEntryPointRoute(repositoryName=", this.f17767r, ", repositoryOwner=", this.f17768s, ")");
    }

    public RepositoryProjectsEntryPointRoute(String str, String str2) {
        this.f17767r = str;
        this.f17768s = str2;
    }
}
