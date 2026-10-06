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
public final class RepositoriesEntryPointRoute implements d {
    public static final Companion Companion = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final h[] f20016f = {w.s(i.r, new p(3)), null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public RepositoriesViewType f20017a;

    /* renamed from: b, reason: collision with root package name */
    public String f20018b;

    /* renamed from: c, reason: collision with root package name */
    public String f20019c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f20020d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f20021e;

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoriesEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoriesEntryPointRoute(int i, RepositoriesViewType repositoriesViewType, String str, String str2, Boolean bool, Boolean bool2) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, RepositoriesEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20017a = repositoriesViewType;
        this.f20018b = str;
        this.f20019c = str2;
        if ((i & 8) == 0) {
            this.f20020d = null;
        } else {
            this.f20020d = bool;
        }
        if ((i & 16) == 0) {
            this.f20021e = null;
        } else {
            this.f20021e = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoriesEntryPointRoute)) {
            return false;
        }
        RepositoriesEntryPointRoute repositoriesEntryPointRoute = (RepositoriesEntryPointRoute) obj;
        return k.b(this.f20017a, repositoriesEntryPointRoute.f20017a) && k.b(this.f20018b, repositoriesEntryPointRoute.f20018b) && k.b(this.f20019c, repositoriesEntryPointRoute.f20019c) && k.b(this.f20020d, repositoriesEntryPointRoute.f20020d) && k.b(this.f20021e, repositoriesEntryPointRoute.f20021e);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.f20017a.hashCode() * 31, this.f20018b, 31), this.f20019c, 31);
        Boolean bool = this.f20020d;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20021e;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "RepositoriesEntryPointRoute(repositoriesViewType=" + this.f20017a + ", rootNodeId=" + this.f20018b + ", sourceEntity=" + this.f20019c + ", isPrivate=" + this.f20020d + ", isOrganization=" + this.f20021e + ")";
    }

    public RepositoriesEntryPointRoute(RepositoriesViewType repositoriesViewType, String str, String str2, Boolean bool, Boolean bool2) {
        k.g(repositoriesViewType, "repositoriesViewType");
        k.g(str, "rootNodeId");
        k.g(str2, "sourceEntity");
        this.f20017a = repositoriesViewType;
        this.f20018b = str;
        this.f20019c = str2;
        this.f20020d = bool;
        this.f20021e = bool2;
    }
}
