package com.github.rudroid.repository.navigation;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.repositories.RepositoriesViewType;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import q01.p;
import rf.d;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class RepositoriesRoute implements d {
    public static final Companion Companion = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final h[] f20022f = {w.s(i.r, new p(4)), null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public RepositoriesViewType f20023a;

    /* renamed from: b, reason: collision with root package name */
    public String f20024b;

    /* renamed from: c, reason: collision with root package name */
    public String f20025c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f20026d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f20027e;

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoriesRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoriesRoute(int i, RepositoriesViewType repositoriesViewType, String str, String str2, Boolean bool, Boolean bool2) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, RepositoriesRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20023a = repositoriesViewType;
        this.f20024b = str;
        this.f20025c = str2;
        if ((i & 8) == 0) {
            this.f20026d = null;
        } else {
            this.f20026d = bool;
        }
        if ((i & 16) == 0) {
            this.f20027e = null;
        } else {
            this.f20027e = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoriesRoute)) {
            return false;
        }
        RepositoriesRoute repositoriesRoute = (RepositoriesRoute) obj;
        return k.b(this.f20023a, repositoriesRoute.f20023a) && k.b(this.f20024b, repositoriesRoute.f20024b) && k.b(this.f20025c, repositoriesRoute.f20025c) && k.b(this.f20026d, repositoriesRoute.f20026d) && k.b(this.f20027e, repositoriesRoute.f20027e);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.f20023a.hashCode() * 31, this.f20024b, 31), this.f20025c, 31);
        Boolean bool = this.f20026d;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20027e;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoriesRoute(repositoriesViewType=" + this.f20023a + ", rootNodeId=" + this.f20024b + ", sourceEntity=" + this.f20025c + ", isPrivate=" + this.f20026d + ", isOrganization=" + this.f20027e + ")";
    }
}
