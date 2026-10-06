package com.github.rudroid.repository.navigation;

import com.github.rudroid.copilot.h1;
import g81.e;
import gn.n;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import q01.p;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class UsersRoute {
    public static final Companion Companion = new Companion();

    /* renamed from: d, reason: collision with root package name */
    public static final h[] f20041d;

    /* renamed from: a, reason: collision with root package name */
    public n f20042a;

    /* renamed from: b, reason: collision with root package name */
    public com.github.domain.users.a f20043b;

    /* renamed from: c, reason: collision with root package name */
    public String f20044c;

    public static final class Companion {
        public final KSerializer serializer() {
            return UsersRoute$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        f20041d = new h[]{w.s(iVar, new p(6)), w.s(iVar, new p(7)), null};
    }

    public /* synthetic */ UsersRoute(int i, n nVar, com.github.domain.users.a aVar, String str) {
        if (7 != (i & 7)) {
            c1.l(i, 7, UsersRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20042a = nVar;
        this.f20043b = aVar;
        this.f20044c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersRoute)) {
            return false;
        }
        UsersRoute usersRoute = (UsersRoute) obj;
        return k.b(this.f20042a, usersRoute.f20042a) && k.b(this.f20043b, usersRoute.f20043b) && k.b(this.f20044c, usersRoute.f20044c);
    }

    public final int hashCode() {
        int hashCode = (this.f20043b.hashCode() + (this.f20042a.hashCode() * 31)) * 31;
        String str = this.f20044c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UsersRoute(userParams=");
        sb2.append(this.f20042a);
        sb2.append(", userViewType=");
        sb2.append(this.f20043b);
        sb2.append(", sourceEntity=");
        return h1.p(sb2, this.f20044c, ")");
    }

    public UsersRoute(n nVar, com.github.domain.users.a aVar, String str) {
        k.g(nVar, "userParams");
        k.g(aVar, "userViewType");
        this.f20042a = nVar;
        this.f20043b = aVar;
        this.f20044c = str;
    }
}
