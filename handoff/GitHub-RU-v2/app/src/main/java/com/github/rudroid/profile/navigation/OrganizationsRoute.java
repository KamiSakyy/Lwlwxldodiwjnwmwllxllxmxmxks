package com.github.rudroid.profile.navigation;

import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class OrganizationsRoute {
    public static final Companion Companion = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f17326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17327b;

    public static final class Companion {
        public final KSerializer serializer() {
            return OrganizationsRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrganizationsRoute(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f17326a = null;
        } else {
            this.f17326a = str;
        }
        if ((i & 2) == 0) {
            this.f17327b = null;
        } else {
            this.f17327b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationsRoute)) {
            return false;
        }
        OrganizationsRoute organizationsRoute = (OrganizationsRoute) obj;
        return k.b(this.f17326a, organizationsRoute.f17326a) && k.b(this.f17327b, organizationsRoute.f17327b);
    }

    public final int hashCode() {
        String str = this.f17326a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17327b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return i.g("OrganizationsRoute(login=", this.f17326a, ", sourceEntity=", this.f17327b, ")");
    }

    public OrganizationsRoute(String str, String str2) {
        this.f17326a = str;
        this.f17327b = str2;
    }
}
